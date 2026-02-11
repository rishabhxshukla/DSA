/*
First negative in every window of size k.
Given an array arr[]  and a positive integer k, find the first negative integer for each and every
window (contiguous subarray) of size k.
Note: If a window does not contain a negative integer, then return 0 for that window.

Example 1 :
Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
Output: [-8, 0, -6, -6]
Explanation:
Window [-8, 2]  : First negative integer is -8.
Window [2, 3]   : No negative integers, output is 0.
Window [3, -6]  : First negative integer is -6.
Window [-6, 10] : First negative integer is -6.

Example 2 :
Input: arr[] = [12, -1, -7, 8, -15, 30, 16, 28] , k = 3
Output: [-1, -1, -7, -15, -15, 0]
Explanation:
Window [12, -1, -7] First negative integer is -1.
Window [-1, -7, 8] First negative integer is -1.
Window [-7, 8, -15] First negative integer is -7.
Window [8, -15, 30] First negative integer is -15.
Window [-15, 30, 16] First negative integer is -15.
Window [30, 16, 28] No negative integers, output is 0.
*/
// NESTED LOOPS -> SLIDING WINDOW -> O(n*k)

package Array.Questions;
import java.io.*;
import java.util.*;

class FirstNegativeInEveryWindow1
{
    static int arr[] = {-8, 2, 3, -6, 10};
    static int k = 2;


    /* Function to find the first negative in window of size k */
    static ArrayList<Integer> firstNegative()
    {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= (arr.length - k); i++)
        {
            //Reinitialize flag to false for every window
            boolean flag = false;

            //Sliding window of size k starting from ith index
            for (int j = i; j < (i + k); j++)
            {
                if (arr[j] < 0) {
                    ans.add(arr[j]);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                ans.add(0);
            }
        }

        return ans;
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("First negative in every window : " + firstNegative());
    }
}