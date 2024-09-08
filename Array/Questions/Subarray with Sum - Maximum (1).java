/*
Given an array, find the subarray with the "maximum" sum.

Example :
Input: arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: The subarray [4, -1, 2, 1] has the largest sum 6.
*/
// NESTED LOOPS

package Array.Questions;
import java.io.*;

class Subarray_with_Sum_Maximum1
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


    /* Function to find the subarray with maximum sum */
    static int maxSumSubarray()
    {
        int max = Integer.MIN_VALUE;

        //Creating the subarrays
        for (int i=0; i<size; i++)
        {
            int S = 0;

            //Sum of each subarray
            for (int j=i; j<size; j++)
            {
                S = S + arr[j];

                //Max sum
                if (S > max) {
                    max = S;
                }
            }
        }

        return max;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Subarray_with_Sum_Maximum1 obj = new Subarray_with_Sum_Maximum1();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the maximum sum
        System.out.println("\nMaximum sum : " + maxSumSubarray());
    }
}