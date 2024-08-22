/*
Insertion Sort divides the array in 2 parts - sorted & unsorted.
It uses one part of the array to hold the sorted values, and the other part to hold the
unsorted values.
The algorithm takes one value at a time from the unsorted part of the array and places it
into its correct position in the sorted part, until whole array is sorted.

Time Complexity : O(N^2)
*/

package Sorting;
import java.io.*;

class InsertionSort
{
    static final int size = 5;
    int arr[] = new int[size];


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


    /* Function to sort elements of an array */
    void sort()
    {
        int n = size;

        for (int i = 0; i < n; i++)
        {
            int j = i;

            /* Swap */
            //Current element is lesser than previous element
            while (j > 0 && arr[j] < arr[j - 1])
            {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InsertionSort obj = new InsertionSort();

        //Creating the array
        obj.create();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print();

        //Sorting the elements
        System.out.println("\nSorting...");
        obj.sort();

        //Printing sorted array
        System.out.println("*** Sorted Array ***");
        obj.print();
    }
}