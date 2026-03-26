// Program to check if an array is sorted or not
// O(N)

package Recursion.Questions.Array;
import java.util.*;

class CheckSorted
{
    static int arr[] = {1, 2, 3, 4, 5};


    static boolean isSorted(int i)
    {
        //Base case: Reached last element
        if (i == arr.length - 1) {
            return true;
        }

        //Current element > Next element = Not sorted
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        //Check for remaining elements
        return isSorted(i + 1);
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the sorted array
        System.out.println("isSorted : " + isSorted(0));
    }
}