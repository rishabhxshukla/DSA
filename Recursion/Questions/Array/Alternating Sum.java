/*
Alternating Sum of Array.
Add elements at even indices and Subtract elements at odd indices.
sum = nums[0] - nums[1] + nums[2] - nums[3]...
*/
// O(N)

package Recursion.Questions.Array;
import java.io.*;
import java.util.*;

class AlternatingSum
{
    static int sum(int arr[], int i)
    {
        //Base case: Last element can be even or odd
        if (i == arr.length - 1) {
            int last = (i % 2 == 0) ? arr[i] : -arr[i];
            return last;
        }

        //Even index
        if (i % 2 == 0) {
            return sum(arr, i + 1) + arr[i];
        }
        //Odd index
        else {
            return sum(arr, i + 1) - arr[i];
        }
    }


    public static void main(String args[])
    {
        int arr[] = {1, 3, 5, 7, 9};

        //Printing the array
        System.out.println("Created Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("Alternating Sum : " + sum(arr, 0));
    }
}