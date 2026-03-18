// Program to find the minimum element of an array

package Recursion.Questions.Array;
import java.io.*;
import java.util.*;

class Min
{
    static int min(int arr[], int i, int min)
    {
        //Base case
        if (i == arr.length) {
            return min;
        }

        //Find min
        if (arr[i] < min) {
            min = arr[i];
        }

        return min(arr, i + 1, min);
    }


    public static void main(String args[])
    {
        int arr[] = {3, 1, 2, 5, 4};

        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("Min : " + min(arr, 0, arr[0]));
    }
}