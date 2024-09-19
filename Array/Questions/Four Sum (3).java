/*
Four sum problem.
For using the two-pointer technique, the array must be sorted.
If the sum < target, increase the left pointer.
If the sum > target, decrease the right pointer.
If the sum == target, add the quadruplets.
*/
// NESTED LOOPS + 2 POINTERS

package Array.Questions;
import java.io.*;
import java.util.*;

class FourSum3
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


    /* Function to find the quadruplets whose sum is equal to target */
    void pairs(int target)
    {
        //Set to store the quadruplets
        Set<List<Integer>> quadruplets = new HashSet<>();

        //Iterate over the array to pick the first element
        for (int i = 0; i < size; i++)
        {
            //Skip duplicates for the first element
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            //Iterate over the array to pick the second element
            for (int j = i+1; j < size; j++)
            {
                //Skip duplicates for the second element
                if ((j != i + 1) && arr[j] == arr[j - 1]) {
                    continue;
                }

                int k = j + 1;        //Left pointer starts from the next element
                int l = size - 1;     //Right pointer starts from the last element

                //Use two-pointer technique for the remaining array
                while (k < l)
                {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];

                    if (sum < target) {
                        k++;
                    }
                    else if (sum > target) {
                        l--;
                    }
                    else {
                        //Adding quadruplets as a group
                        quadruplets.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;

                        //Skipping the duplicates
                        //Keep moving pointers till the numbers are same as before
                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    }
                }
            }
        }

        //Printing the quadruplets
        for (List<Integer> group : quadruplets)
        {
            System.out.println(group);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        FourSum3 obj = new FourSum3();
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

        //Printing the quadruplets
        System.out.println("*** Quadruplets ***");
        obj.pairs(target);
    }
}