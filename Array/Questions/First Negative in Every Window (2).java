/*
First negative in every window of size k
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
// SLIDING WINDOW -> QUEUE -> O(N)

package Array.Questions;
import java.io.*;
import java.util.*;

class FirstNegativeInEveryWindow2
{
    static int arr[] = {-8, 2, 3, -6, 10};
    static int k = 2;


    /* Function to find the first negative in window of size k */
    static ArrayList<Integer> firstNegative()
    {
        Queue<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();

        //First window
        for (int i = 0; i < k; i++)
        {
            if (arr[i] < 0) {
                q.add(arr[i]);
            }
        }

        //Adding the 1st negative in ans
        ans.add(q.isEmpty() ? 0 : q.peek());

        //Slide the window
        for (int i = k; i < arr.length; i++)
        {
            //Remove element that goes out
            int outgoing = arr[i - k];
            if (!q.isEmpty() && q.peek() == outgoing) {
                q.remove();
            }

            //Add new negative element
            if (arr[i] < 0) {
                q.add(arr[i]);
            }

            //Add first negative of current window in ans
            ans.add(q.isEmpty() ? 0 : q.peek());
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