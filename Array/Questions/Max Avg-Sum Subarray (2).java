/*
You are given an integer array arr and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value.

Example :
Input: arr = [1, 12, -5, -6, 50, 3], k = 4
Output: 12.75
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
*/
// SLIDING WINDOW -> O(N)

package Array.Questions;
import java.io.*;
import java.util.*;

class MaxAvgSumSubarray2
{
    static int arr[] = {1, 12, -5, -6, 50, 3};
    static int k = 4;

    static double maxAverage()
    {
        double maxAvg = Double.NEGATIVE_INFINITY;
        double sum = 0.0;
        double avg = 0.0;

        //First window
        for (int i = 0; i < k; i++)
        {
            sum = sum + arr[i];
        }

        //Calculate 1st avg
        avg = sum / k;

        //1st max avg
        maxAvg = avg;

        //Slide the window
        for (int i = k; i < arr.length; i++)
        {
            sum = sum - arr[i - k];    //Shrink from left
            sum = sum + arr[i];        //Expand to right

            //Calculate current avg
            avg = sum / k;

            //Update max avg
            if (avg > maxAvg) {
                maxAvg = avg;
            }
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