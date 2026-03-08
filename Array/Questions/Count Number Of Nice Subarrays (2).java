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

FORMULA :
Real-world analogy (weights) :
Suppose fun(w) counts how many people weigh <= x kg.
fun(70) = 25   //people weighing 70 kg or less (includes 70)
fun(69) = 18   //people weighing less than 70 kg

People weighing exactly 70 kg = fun(70) - fun(69) = 25 - 18 = 7

Same idea here:
- atMost(k)       counts subarrays with odd <= k
- atMost(k - 1)   counts subarrays with odd < k

Subtracting removes all smaller odd and leaves only subarrays with odd exactly = k.
*/
// SLIDING WINDOW -> O(2N)

package Array.Questions;
import java.io.*;
import java.util.*;

class CountNumberOfNiceSubarrays2
{
    static int arr[] = {1, 1, 2, 1, 1};
    static int k = 3;


    /* Helper function to count all subarrays where odd <= k */
    static int atMost(int k)
    {
        int i = 0, count = 0, odd = 0;

        //Edge case
        if (k < 0) {
            return 0;
        }

        for (int j = 0; j < arr.length; j++)
        {
            //Expand window
            if (arr[j] % 2 == 1) {
                odd++;
            }

            //Shrink window
            if (odd > k)
            {
                while (odd > k)
                {
                    if (arr[i] % 2 == 1) {
                        odd--;
                    }
                    i++;
                }
            }

            //Update count
            count = count + (j - i + 1);
        }

        return count;
    }


    /* No. of subarrays with odd = k : (subarrays with odd <= k) - (subarrays with odd <= k - 1) */
    static int niceSubarrays()
    {
        return (atMost(k) - atMost(k - 1));
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("No. of nice subarrays : " + niceSubarrays());
    }
}