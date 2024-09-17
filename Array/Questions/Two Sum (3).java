/*
Two sum problem.
For using the two-pointer technique, the array must be sorted.
If the sum < target, increase the left pointer.
If the sum > target, decrease the right pointer.
If the sum == target, add the pairs.
*/
// 2 POINTERS

package Array.Questions;
import java.io.*;
import java.util.*;

class TwoSum3
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


    /* Function to find the pairs whose sum is equal to target */
    void pairs(int target)
    {
        //Set to store the pairs
        Set<List<Integer>> pairs = new HashSet<>();
        int i = 0, j = size-1;

        while (i < j)
        {
            int sum = arr[i] + arr[j];

            if (sum < target) {
                i++;
            }
            else if (sum > target) {
                j--;
            }
            else {
                //Adding pairs as a group
                pairs.add(Arrays.asList(arr[i], arr[j]));
                i++;
                j--;
            }
        }

        //Printing the pairs
        for (List<Integer> group : pairs)
        {
            System.out.println(group);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        TwoSum3 obj = new TwoSum3();
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

        //Printing the pairs
        System.out.println("*** Pairs ***");
        obj.pairs(target);
    }
}