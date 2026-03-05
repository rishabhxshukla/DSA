/*
Binary Subarrays With Sum
Given a binary array arr and an integer goal, return the number of non-empty subarrays with a sum goal.
A subarray is a contiguous part of the array.

Example 1 :
Input: arr = [1, 0, 1, 0, 1], goal = 2
Output: 4

Example 2 :
Input: arr = [0, 0, 0, 0, 0], goal = 0
Output: 15
*/
// NESTED LOOPS -> SLIDING WINDOW -> O(N)²

package Array.Questions;
import java.io.*;
import java.util.*;

class BinarySubarraysWithSum1
{
    static int arr[] = {1, 0, 1, 0, 1};
    static int goal = 2;


    /* Function to find no. of subarrays with a sum = goal. */
    static int subarraysWithSum()
    {
        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            //Reinitialize sum to 0 for every window
            int sum = 0;

            //Sliding window starting from ith index
            for (int j = i; j < arr.length; j++)
            {
                sum = sum + arr[j];

                //Increase count if a subarray is found
                if (sum == goal) {
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("No. of subarrays : " + subarraysWithSum());
    }
}