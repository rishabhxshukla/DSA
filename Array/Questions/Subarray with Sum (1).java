/*
Given an array and an integer k. Your task is to find the length of the longest sub-array
with the sum of the elements equal to the given value k.

Input : arr[] = {10, 5, 2, 7, 1, 9}, k = 15
Output : 4
Explanation: Longest sub-array is {5, 2, 7, 1}.
*/
// NESTED LOOP

package Array.Questions;
import java.io.*;

class Subarray_with_Sum1
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


    /* Function to find the longest subarray with given sum */
    void subarray(int target)
    {
        int len = 0;

        //Creating the subarrays
        for (int i=0; i<size; i++)
        {
            int S = 0;

            for (int j=i; j<size; j++)
            {
                //Sum of each subarray
                S = S + arr[j];

                //Max length of subarray which is equal to target
                if (S == target) {
                    len = Math.max(len, (j-i+1));
                }
            }
        }

        System.out.println(STR."Length of longest subarray with sum \{target} is \{len}");
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Subarray_with_Sum1 obj = new Subarray_with_Sum1();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the sum : ");
        int target = Integer.parseInt(b.readLine());

        //Printing the subarray indices
        obj.subarray(target);
    }
}