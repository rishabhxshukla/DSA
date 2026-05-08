/*
Program to implement binary search using recursion

Optimal formula for calculating the middle element.
Instead of mid = (lb + ub) / 2, use :
   mid = lb + (ub - lb) / 2

Why?
- Prevents integer overflow when lb and ub are large
- (lb + ub) may exceed the maximum integer value
- This formula keeps the calculation within safe limits
*/
// O(log N)

package Recursion.Questions.Array;
import java.io.*;
import java.util.*;

class BinarySearch
{
    //Sorted array
    static int arr[] = {1, 2, 3, 4, 5};


    static boolean search(int arr[], int key, int lb, int ub)
    {
        //Mid calculation
        int mid = lb + (ub - lb) / 2;

        //Base case: Element not found
        if (lb > ub) {
            return false;
        }

        //Element found
        if (arr[mid] == key) {
            return true;
        }
        //Search left half
        else if (arr[mid] > key) {
            return search(arr, key, lb, mid - 1);
        }
        //Search right half
        else {
            return search(arr, key, mid + 1, ub);
        }
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Taking user input
        System.out.print("Enter the element that you want to search : ");
        int key = Integer.parseInt(b.readLine());

        //Printing the result
        int lb = 0, ub = arr.length - 1;
        System.out.println("Result : " + search(arr, key, lb, ub));
    }
}