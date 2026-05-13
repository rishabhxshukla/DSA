/*
Min-Max Game
You are given an integer array nums whose length is a power of 2.
Apply the following algorithm on nums :
   1) Let n be the length of nums. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n / 2.
   2) For every even index i where 0 <= i < n / 2, assign the value of newNums[i] as min(nums[2 * i], nums[2 * i + 1]).
   3) For every odd index i where 0 <= i < n / 2, assign the value of newNums[i] as max(nums[2 * i], nums[2 * i + 1]).
   4) Replace the array nums with newNums.
   5) Repeat the entire process starting from step 1.
Return the last number that remains in nums after applying the algorithm.

Example :
Input: nums = [1, 3, 5, 2, 4, 8, 2, 2]
Output: 1
Explanation: The following arrays are the results of applying the algorithm repeatedly.
First: nums = [1, 5, 4, 2]
Second: nums = [1, 4]
Third: nums = [1]
1 is the last remaining number, so we return 1.

      1       3       5       2       4       8       2       2
       \     /         \     /         \     /         \     /
       Min 1           Max 5           Min 4           Max 2
         \              /                \              /
          --------------                  --------------
                 |                               |
                Min 1                          Max 4
                   \                           /
                    ------------ --------------
                                |
                              Min 1
*/
// O(N)

package Recursion.Questions.Array;
import java.util.*;

class MinMaxGame
{
    static int game(int nums[])
    {
        //New array to store results of this round
        int n = nums.length;
        int newNums[] = new int[n / 2];

        //Base case: Only one element remaining
        if (n == 1) {
            return nums[0];
        }

        for (int i = 0; i < n / 2; i++)
        {
            if (i % 2 == 0) {
                newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            }
            else {
                newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }

        //Recursive call for next round
        return game(newNums);
    }


    public static void main(String args[])
    {
        int arr[] = {1, 3, 5, 2, 4, 8, 2, 2};

        //Printing the array
        System.out.println("*** Created Array ***");
        System.out.println(Arrays.toString(arr));

        //Printing the result
        System.out.println("Final number : " + game(arr));
    }
}