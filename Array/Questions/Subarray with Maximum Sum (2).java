/*
Given an array, find the subarray with the largest sum.
Example :
Input: arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: The subarray [4, -1, 2, 1] has the largest sum 6.
*/
// KADANE'S ALGORITHM
/*
Kadane's Algorithm is used to find the largest sum of a contiguous subarray in an array.
1) It maintains a running sum (S) of the current subarray.
2) It resets the sum to 0 when S becomes negative because negative sum means that the
   current subarray does not contribute to the maximum sum, so we start afresh.
3) We keep track of the maximum sum (max) in the max variable.
*/

package Array.Questions;
import java.io.*;

class Subarray_with_Maximum_Sum2
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
        int S = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<size; i++)
        {
            //Sum of current subarray
            S = S + arr[i];

            //Making current sum 0 if it becomes negative
            if (S < 0) {
                S = 0;
            }

            //Storing maximum sum
            if (S > max) {
                max = S;
            }
        }

        return max;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Subarray_with_Maximum_Sum2 obj = new Subarray_with_Maximum_Sum2();
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