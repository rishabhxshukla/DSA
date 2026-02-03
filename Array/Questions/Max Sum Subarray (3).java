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
// SLIDING WINDOW -> 2 POINTERS -> O(n)

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
        int sum = 0;

        //First window
        //Move the 2nd pointer till you make a window of size k
        int i = 0, j = 0;
        while (j - i < k)
        {
            sum = sum + arr[j];
            j++;
        }

        //1st max is sum of elements of 1st window
        max = sum;

        //Slide the window
        //Move the 2nd pointer till you find the end of the array
        while (j < arr.length)
        {
            sum = sum - arr[i++];    //Shrink from left
            sum = sum + arr[j++];    //Expand to right

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