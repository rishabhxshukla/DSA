/*
Subarrays with K Different Integers
Given an integer array arr and an integer k, return the number of good subarrays of arr.
A good array is an array where the number of different integers in that array is exactly k.

Example 1 :
Input: arr = [1, 2, 1, 2, 3], k = 2
Output: 7
Explanation: Subarrays formed with exactly 2 different integers:
[1, 2], [2, 1], [1, 2], [2, 3], [1, 2, 1], [2, 1, 2], [1, 2, 1, 2]

Example 2 :
Input: arr = [1, 2, 1, 3, 4], k = 3
Output: 3
Explanation: Subarrays formed with exactly 3 different integers:
[1, 2, 1, 3], [2, 1, 3], [1, 3, 4].
*/
// NESTED LOOPS -> SLIDING WINDOW -> O(N)²

package Array.Questions;
import java.io.*;
import java.util.*;

class SubarraysWithKDifferentIntegers1
{
    static int arr[] = {1, 2, 1, 2, 3};
    static int k = 2;


    /* Function to find the no. of subarrays containing k distinct numbers */
    static int numberOfSubarrays()
    {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            //Reinitialize HashSet for every window
            hs.clear();

            //Sliding window starting from ith index
            for (int j = i; j < arr.length; j++)
            {
                hs.add(arr[j]);

                //Increase count when HashSet contains k distinct numbers
                if (hs.size() == k) {
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
        System.out.println("No. of subarrays : " + numberOfSubarrays());
    }
}