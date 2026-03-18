// Program to print the elements of an array recursively

package Recursion.Questions.Array;
import java.io.*;
import java.util.*;

class Print
{
    static void print(int arr[], int i)
    {
        //Base case
        if (i == arr.length) {
            return;
        }

        System.out.print(arr[i] + " ");
        print(arr, i + 1);
    }


    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5};

        //Printing the array
        System.out.println("Array : ");
        print(arr, 0 );
    }
}