/*
Given an integer array arr and an integer k, find the maximum sum of any contiguous subarray of size k.
The subarray must be of length exactly k.
Return the maximum sum.

Example :
Input: arr = [-1, 2, 3, 3, 4, 5, -1] , k = 4
Output: 15
Explanation:
Subarrays of size 4:
  [-1, 2, 3, 3] → sum = 7
  [2, 3, 3, 4] → sum = 12
  [3, 3, 4, 5] → sum = 15
  [3, 4, 5, -1] → sum = 11
*/
// SLIDING WINDOW -> O(n)

package Array.Questions;
import java.io.*;
import java.util.*;

class MaxSumSubarray2
{
    static int arr[] = {-1, 2, 3, 3, 4, 5, -1};
    static int k = 4;


    /* Function to find the max sum of subarray of size k */
    static int maxSum()
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        //First window
        for (int i = 0; i < k; i++)
        {
            sum = sum + arr[i];
        }

        //1st max is sum of first k elements
        max = sum;

        //Slide the window
        for (int i = k; i < arr.length; i++)
        {
            sum = sum - arr[i - k];    //Shrink from left
            sum = sum + arr[i];        //Expand to right

            //Update the max sum
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }


    public static void main(String[] args)
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("Max sum : " + maxSum());
    }
}