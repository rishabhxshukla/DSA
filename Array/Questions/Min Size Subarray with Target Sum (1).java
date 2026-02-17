/*
Minimum Size Subarray with Target Sum
Given an array of positive integers arr and a positive integer target, return the minimal length of a subarray
whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1 :
Input: target = 7, arr = [2, 3, 1, 2, 4, 3]
Output: 2
Explanation: The subarray [4, 3] has the minimal length under the problem constraint.

Example 2 :
Input: target = 4, arr = [1, 4, 4]
Output: 1

Example 3 :
Input: target = 11, arr = [1, 1, 1, 1, 1, 1, 1, 1]
Output: 0
*/
// NESTED LOOPS -> SLIDING WINDOW -> O(N)²

package Array.Questions;
import java.util.*;

class MinSizeSubarrayWithTargetSum1
{
    static int arr[] = {2, 3, 1, 2, 4, 3};
    static int target = 7;


    /* Function to find the min size subarray with target sum */
    static int minSubarray()
    {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            //Reinitialize sum to 0 for every window
            int sum = 0;

            //Sliding window starting from ith index
            for (int j = i; j < arr.length; j++)
            {
                //Expand window
                sum = sum + arr[j];

                //Stop when sum >= target
                if (sum >= target)
                {
                    //Update ans
                    min = Math.min(min, j - i + 1);

                    break;
                }
            }
        }

        return (min == Integer.MAX_VALUE ? 0 : min);
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("Min size subarray : " + minSubarray());
    }
}