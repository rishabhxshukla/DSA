// Program to find the sum of all the elements of an array

package Recursion.Questions.Array;
import java.io.*;
import java.util.*;

class Sum
{
    static int sum(int arr[], int i)
    {
        //Base case
        if (i == arr.length) {
            return 0;
        }

        return arr[i] + sum(arr, i + 1);
    }


    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5};

        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("Sum : " + sum(arr, 0));
    }
}