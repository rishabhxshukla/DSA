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

FORMULA :
Real-world analogy (weights) :
Suppose fun(w) counts how many people weigh <= x kg.
fun(70) = 25   //people weighing 70 kg or less (includes 70)
fun(69) = 18   //people weighing less than 70 kg

People weighing exactly 70 kg = fun(70) - fun(69) = 25 - 18 = 7

Same idea here:
- atMost(k)       counts subarrays with <= k distinct numbers
- atMost(k - 1)   counts subarrays with < k distinct numbers

Subtracting removes all subarrays with fewer distinct integers and leaves only subarrays with exactly k distinct integers.
*/
// SLIDING WINDOW -> O(2N)

package Array.Questions;
import java.io.*;
import java.util.*;

class SubarraysWithKDifferentIntegers2
{
    static int arr[] = {1, 2, 1, 2, 3};
    static int k = 2;


    /* Helper function to count all subarrays with <= k distinct numbers */
    static int atMost(int k)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0, count = 0;

        //Edge case
        if (k < 0) {
            return 0;
        }

        for (int j = 0; j < arr.length; j++)
        {
            //Expand window
            hm.put(arr[j], hm.getOrDefault(arr[j], 0) + 1);

            //Shrink window
            if (hm.size() > k)
            {
                while (hm.size() > k)
                {
                    //Decrease freq
                    hm.put(arr[i], hm.get(arr[i]) - 1);

                    //If freq is 0, remove num
                    if (hm.get(arr[i]) == 0) {
                        hm.remove(arr[i]);
                    }

                    i++;
                }
            }

            //Update count
            count = count + (j - i + 1);
        }

        return count;
    }


    /* No. of subarrays k distinct numbers : (subarrays with <= k distinct numbers) - (subarrays with <= k - 1 distinct numbers) */
    static int numberOfSubarrays()
    {
        return (atMost(k) - atMost(k - 1));
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("No. of subarrays : " + numberOfSubarrays());
    }
}