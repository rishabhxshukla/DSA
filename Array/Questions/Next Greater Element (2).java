/*
Given an array arr of size n containing elements, find the next greater element for each element in the
array in the order of their appearance. The next greater element of an element in the array is the nearest
element on the right that is greater than the current element.
If there does not exist a next greater element for the current element, then the next greater element for
that element is -1.

Example 1 :
Input: arr = [1, 3, 2, 4]
Output: [3, 4, 4, -1]
Explanation:
In the array, the next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4 is -1, since it does not exist.

Example 2 :
Input: arr = [6, 8, 0, 1, 3]
Output: [8, -1, 1, 3, -1]
Explanation:
In the array, the next larger element to 6 is 8, for 8 there is no larger elements hence it is -1, for 0
it is 1 , for 1 it is 3 and then for 3 there is no larger element on the right and hence -1.
*/
// STACK

package Array.Questions;
import java.io.*;
import java.util.*;

class NextGreaterElement2
{
    static int arr[] = {6, 8, 0, 1, 3};


    /* Function to find the next greater element of each element in arr */
    static int[] nextGreaterElement()
    {
        int ans[]  = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        //Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--)
        {
            //Remove smaller elements
            while (!s.isEmpty() && s.peek() <= arr[i])
            {
                s.pop();
            }

            //Decide the next greater element
            if (s.isEmpty())
            {
                ans[i] = -1;
            }
            else
            {
                ans[i] = s.peek();
            }

            //Push current element in stack
            s.push(arr[i]);
        }

        return ans;
    }


    public static void main(String args[])
    {
        //Printing the original array
        System.out.println("Original array : " + Arrays.toString(arr));

        //Printing the next greater element array
        System.out.println("Next greater element array : " + Arrays.toString(nextGreaterElement()));
    }
}