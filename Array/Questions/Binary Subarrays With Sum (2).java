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

FORMULA :
Real-world analogy (weights) :
Suppose fun(w) counts how many people weigh <= x kg.
fun(70) = 25   //people weighing 70 kg or less (includes 70)
fun(69) = 18   //people weighing less than 70 kg

People weighing exactly 70 kg = fun(70) - fun(69) = 25 - 18 = 7

Same idea here:
- atMost(goal)       counts subarrays with sum <= goal
- atMost(goal - 1)   counts subarrays with sum < goal

Subtracting removes all smaller sums and leaves only subarrays with sum exactly = goal.
*/
// SLIDING WINDOW -> O(2N)

package Array.Questions;
import java.io.*;
import java.util.*;

class BinarySubarraysWithSum2
{
    static int arr[] = {1, 0, 1, 0, 1};
    static int goal = 2;


    /* Helper function to count all subarrays with sum <= k */
    static int atMost(int k)
    {
        int i = 0, count = 0, sum = 0;

        //Edge case
        if (k < 0) {
            return 0;
        }

        for (int j = 0; j < arr.length; j++)
        {
            //Expand window
            sum = sum + arr[j];

            //Shrink window
            if (sum > k)
            {
                while (sum > k)
                {
                    sum = sum - arr[i];
                    i++;
                }
            }

            //Update count
            count = count + (j - i + 1);
        }

        return count;
    }


    /* No. of subarrays with sum = goal : (subarrays with sum <= goal) - (subarrays with sum <= goal - 1) */
    static int subarraysWithSum()
    {
        return (atMost(goal) - atMost(goal - 1));
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("No. of subarrays : " + subarraysWithSum());
    }
}