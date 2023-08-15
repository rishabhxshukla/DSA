/*
Maximum Product Difference Between Two Pairs
The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
Given an integer array arr, choose four distinct indices a, b, c, and d such that the product
difference between pairs (arr[a], arr[b]) and (arr[c], arr[d]) is maximized.

Input: arr = [5,6,2,7,4]
Output: 34
Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for
the second pair (2, 4).
The product difference is (6 * 7) - (2 * 4) = 34.
*/

package Array.Questions;
import java.io.*;
import java.util.*;

class MaximumProductDifference
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Creating the array */
    void create() throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }
    }


    /* Printing the array */
    void print()
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Function to find the maximum product difference */
    static int maxProductDifference()
    {
        //Sorting the array
        Arrays.sort(arr);

        //Choosing 1st 2 numbers
        int prod1 = arr[0] * arr[1];

        //Choosing last 2 numbers
        int prod2 = arr[size-2] * arr[size-1];

        return (prod2 - prod1);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MaximumProductDifference obj = new MaximumProductDifference();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print();

        //Printing the maximum product difference
        System.out.println("\nMaximum product difference : " + maxProductDifference());
    }
}