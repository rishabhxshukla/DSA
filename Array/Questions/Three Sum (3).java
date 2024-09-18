/*
Three sum problem.
For using the two-pointer technique, the array must be sorted.
If the sum < target, increase the left pointer.
If the sum > target, decrease the right pointer.
If the sum == target, add the triplets.
*/
// LOOP + 2 POINTERS

package Array.Questions;
import java.io.*;
import java.util.*;

class ThreeSum3
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Creating the array */
    void create() throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }
    }


    /* Printing the array */
    void print(int a[])
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* Function to find the triplets whose sum is equal to target */
    void pairs(int target)
    {
        //Set to store the triplets
        Set<List<Integer>> triplets = new HashSet<>();

        //Iterate over the array to pick the first element
        for (int i=0; i<size; i++)
        {
            int j = i + 1;        //Left pointer starts from the next element
            int k = size - 1;     //Right pointer starts from the last element

            //Use two-pointer technique for the remaining array
            while (j < k)
            {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum < target) {
                    j++;
                }
                else if (sum > target) {
                    k--;
                }
                else {
                    //Adding triplets as a group
                    triplets.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;

                    //Skipping the duplicates
                    //Keep moving pointers till the numbers are same as before
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }
        }

        //Printing the triplets
        for (List<Integer> group : triplets)
        {
            System.out.println(group);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ThreeSum3 obj = new ThreeSum3();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the target : ");
        int target = Integer.parseInt(b.readLine());

        //Printing the triplets
        System.out.println("*** Triplets ***");
        obj.pairs(target);
    }
}