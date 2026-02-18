/*
Longest Harmonious Subsequence
We define a harmonious array where the difference between its maximum value and its minimum value is exactly 1.
Given an integer array arr, return the length of its longest harmonious subsequence among all its possible subsequences.

Example 1 :
Input: arr = [1, 3, 2, 2, 5, 2, 3, 7]
Output: 5
Explanation: The longest harmonious subsequence is [3, 2, 2, 2, 3].

Example 2 :
Input: arr = [1, 2, 3, 4]
Output: 2
Explanation: The longest harmonious subsequences are [1, 2], [2, 3], [3, 4], all of which have a length of 2.

Example 3 :
Input: arr = [1, 1, 1, 1]
Output: 0
*/
// HASHMAP

package Array.Questions;
import java.io.*;
import java.util.*;

class LongestHarmoniousSubsequence
{
    static int arr[] = {1, 3, 2, 2, 5, 2, 3, 7};


    /* Function to find the longest harmonious subsequence */
    static int lhs()
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;

        //Storing element + freq in HashMap
        for (int i = 0; i < arr.length; i++)
        {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        //Check for consecutive key with difference exactly 1
        for (int key : hm.keySet())
        {
            if (hm.containsKey(key + 1))
            {
                //Add frequencies of both the keys
                int freqSum = hm.get(key) + hm.get(key + 1);
                max = Math.max(max, freqSum);
            }
        }

        return max;
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("Longest Harmonious Subsequence : " + lhs());
    }
}