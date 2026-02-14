/*
You are given an integer array arr and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value.

Example :
Input: arr = [1, 12, -5, -6, 50, 3], k = 4
Output: 12.75
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
*/
// 2. SLIDING WINDOW -> O(N)

package Array.Questions;
import java.io.*;
import java.util.*;

class MaxAvgSumSubarray3
{
    static int arr[] = {1, 12, -5, -6, 50, 3};
    static int k = 4;


    /* Function to find the max avg of subarray of size k */
    static double maxAverage()
    {
        double maxAvg = Double.NEGATIVE_INFINITY;
        double sum = 0.0;
        int i = 0;

        for (int j = 0; j < arr.length; j++)
        {
            //Expand window
            sum = sum + arr[j];

            //When window size is k
            if (j - i + 1 == k)
            {
                //Update maxAvg
                maxAvg = Math.max(maxAvg, sum / k);

                //Shrink window
                sum = sum - arr[i];
                i++;
            }
        }

        return maxAvg;
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("Max avg : " + maxAverage());
    }
}