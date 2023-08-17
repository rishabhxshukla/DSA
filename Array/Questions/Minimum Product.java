/*
Minimum Product of Two Elements in an Array
Given the array of integers arr, you will choose two different indices i and j of that array. Return the minimum value of (arr[i]-1)*(arr[j]-1).
*/
// SORTING

package Array.Questions;
import java.io.*;
import java.util.*;

class MinimumProduct
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


    /* Function to find the minimum product */
    static int minProduct()
    {
        //Sorting the array
        Arrays.sort(arr);

        //Choosing the last 2 numbers
        int prod = (arr[0]) * (arr[1]);

        return prod;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MinimumProduct obj = new MinimumProduct();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print();

        //Printing the minimum product
        System.out.println("\nMinimum product : " + minProduct());
    }
}