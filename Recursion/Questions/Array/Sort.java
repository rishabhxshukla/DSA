// Program to sort an array recursively
// O(N)²

package Recursion.Questions.Array;
import java.util.*;

class Sort
{
    static int arr[] = {3, 1, 2, 5, 4};


    static void sort(int n)
    {
        //Base case: array of size 0 or 1 is already sorted
        if (n <= 1) {
            return;
        }

        //Sort first n-1 elements
        sort(n - 1);

        //Insert nth element into the sorted part
        int key = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("*** Created Array ***");
        System.out.println(Arrays.toString(arr));

        //Sorting the array
        sort(arr.length);

        //Printing the sorted array
        System.out.println("*** Sorted Array ***");
        System.out.println(Arrays.toString(arr));
    }
}