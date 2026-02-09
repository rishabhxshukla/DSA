/*
You are given an integer array arr and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value.

Example :
Input: arr = [1, 12, -5, -6, 50, 3], k = 4
Output: 12.75
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
*/
// NESTED LOOPS -> SLIDING WINDOW -> O(n*k)

package Array.Questions;
import java.io.*;
import java.util.*;

class MaxAvgSumSubarray1
{
    static int arr[] = {1, 12, -5, -6, 50, 3};
    static int k = 4;

    static double maxAverage()
    {
        double maxAvg = Double.NEGATIVE_INFINITY;

        for (int i = 0; i <= arr.length - k; i++)
        {
            //Reinitialize current sum to 0 for every window
            double sum = 0.0;

            //Sliding window of size k starting from ith index
            for (int j = i; j < (i + k); j++)
            {
                sum = sum + arr[j];
            }

            //Calculate current avg
            double avg = sum / k;

            //Update max avg
            if (avg > maxAvg) {
                maxAvg = avg;
            }

            /* System.out.println("Window " + (i + 1));
            System.out.println(" SUM: " + sum + ", AVG: " + avg + ", MAXAVG: " + maxAvg); */
        }

        return maxAvg;
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("Max avg sum : " + maxAverage());
    }
}