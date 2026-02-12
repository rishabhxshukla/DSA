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
// 2. SLIDING WINDOW -> O(N)

package Array.Questions;
import java.io.*;
import java.util.*;

class MaxSumSubarray3
{
    static int arr[] = {-1, 2, 3, 3, 4, 5, -1};
    static int k = 4;


    /* Function to find the max sum of subarray of size k */
    static int maxSum()
    {
        int max = Integer.MIN_VALUE;
        int i = 0, sum = 0;

        for (int j = 0; j < arr.length; j++)
        {
            //Expand window
            sum = sum + arr[j];

            //When window size is k
            if (j - i + 1 == k)
            {
                //Update max
                max = Math.max(max, sum);

                //Shrink window
                sum = sum - arr[i];
                i++;
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