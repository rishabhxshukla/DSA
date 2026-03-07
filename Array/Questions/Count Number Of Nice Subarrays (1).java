/*
Count Number of Nice Subarrays
Given an array of integers arr and an integer k.
A continuous subarray is called nice if there are k odd numbers on it.
Return the number of nice sub-arrays.

Example 1 :
Input: arr = [1, 1, 2, 1, 1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

Example 2 :
Input: arr = [2, 4, 6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.

Example 3 :
Input: arr = [2, 2, 2, 1, 2, 2, 1, 2, 2, 2], k = 2
Output: 16
*/
// NESTED LOOPS -> SLIDING WINDOW -> O(N)²

package Array.Questions;
import java.io.*;
import java.util.*;

class CountNumberOfNiceSubarrays1
{
    static int arr[] = {1, 1, 2, 1, 1};
    static int k = 3;


    /* Function to find the no. of nice subarrays */
    static int niceSubarrays()
    {
        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            //Reinitialize odd to 0 for every window
            int odd = 0;

            //Sliding window starting from ith index
            for (int j = i; j < arr.length; j++)
            {
                //Count no. of odd elements
                if (arr[j] % 2 == 1) {
                    odd++;
                }

                //Update count
                if (odd == k) {
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
        System.out.println("No. of nice subarrays : " + niceSubarrays());
    }
}