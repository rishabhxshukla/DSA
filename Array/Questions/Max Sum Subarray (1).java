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
// BRUTE FORCE -> SLIDING WINDOW -> O(n*k)

package Array.Questions;
import java.io.*;
import java.util.*;

class MaxSumSubarray1
{
    static int arr[] = {-1, 2, 3, 3, 4, 5, -1};
    static int k = 4;


    /* Function to find the max sum of subarray of size k */
    static int maxSum()
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i <= arr.length - k; i++)
        {
            //Sliding window of size k starting from ith index
            for (int j = i; j < (i + k); j++)
            {
                sum = sum + arr[j];
            }

            //Update max sum
            if (sum > max) {
                max = sum;
            }

            /* System.out.println("Window " + (i + 1));
            System.out.println(" SUM: " + sum + ", MAX: " + max); */

            //Reinitialize current sum to 0
            sum = 0;
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