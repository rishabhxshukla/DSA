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
// SLIDING WINDOW -> O(N)

package Array.Questions;
import java.util.*;

class MinSizeSubarrayWithTargetSum2
{
    static int arr[] = {2, 3, 1, 2, 4, 3};
    static int target = 7;


    /* Function to find the min size subarray with target sum */
    static int minSubarray()
    {
        int min = Integer.MAX_VALUE;
        int i = 0, sum = 0;

        for (int j = 0; j < arr.length; j++)
        {
            //Expand window
            sum = sum + arr[j];

            //When sum >= target
            if (sum >= target)
            {
                while (sum >= target)
                {
                    //Update ans
                    min = Math.min(min, j - i + 1);

                    //Shrink window
                    sum = sum - arr[i];
                    i++;
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