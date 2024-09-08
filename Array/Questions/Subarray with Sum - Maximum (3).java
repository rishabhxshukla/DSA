/*
Given an array, find the subarray with the "maximum" sum.

Example :
Input: arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: The subarray [4, -1, 2, 1] has the largest sum 6.
*/

// KADANE'S ALGORITHM
/*
Kadane's Algorithm is used to find the largest sum of a contiguous subarray in an array.
1) It maintains a running sum (S) of the current subarray, with tempStart marking the
   potential start of a new subarray.
2) It resets the sum to 0 and updates tempStart to the next index when S becomes negative
   because negative sum means that the current subarray does not contribute to the
   maximum sum, so we start afresh.
3) We keep track of the maximum sum (max) in the max variable.
   We update start to tempStart, and end to current index, marking the range of the subarray.
*/

package Array.Questions;
import java.io.*;

class Subarray_with_Sum_Maximum3
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
    void maxSumSubarray()
    {
        int S = 0;
        int max = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0;

        for (int i=0; i<size; i++)
        {
            //Sum of current subarray
            S = S + arr[i];

            //Making current sum 0 if it becomes negative and updating tempStart
            if (S < 0) {
                S = 0;
                tempStart = i + 1;
            }

            //Storing maximum sum and updating the start and end indices
            if (S > max) {
                max = S;
                start = tempStart;
                end = i;
            }
        }

        //Printing the maximum sum subarray
        for (int i = start; i <= end; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Subarray_with_Sum_Maximum3 obj = new Subarray_with_Sum_Maximum3();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the maximum sum subarray
        System.out.print("\nSubarray with the maximum sum : ");
        obj.maxSumSubarray();
    }
}