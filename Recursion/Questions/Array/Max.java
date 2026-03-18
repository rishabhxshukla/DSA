// Program to find the maximum element of an array

package Recursion.Questions.Array;
import java.io.*;
import java.util.*;

class Max
{
    static int max(int arr[], int i, int max)
    {
        //Base case
        if (i == arr.length) {
            return max;
        }

        //Find max
        if (arr[i] > max) {
            max = arr[i];
        }

        return max(arr, i + 1, max);
    }


    public static void main(String args[])
    {
        int arr[] = {3, 1, 2, 5, 4};

        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("Max : " + max(arr, 0, arr[0]));
    }
}