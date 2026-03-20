// Program to check if an element is present in the array or not

package Recursion.Questions.Array;
import java.io.*;
import java.util.*;

class Search
{
    static boolean search(int arr[], int key, int i)
    {
        //Base case
        if (i == arr.length) {
            return false;
        }

        //Element found
        if (arr[i] == key) {
            return true;
        }

        return search(arr, key, i + 1);
    }


    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5};

        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("isPresent : " + search(arr, 3, 0));
    }
}