/*
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent
elements, and swaps them if they are in the wrong order. The pass through the list is repeated
until the list is sorted.
It is called Bubble Sort because with each pass through the list, the smaller elements gradually
'bubble' to the top (beginning) of the list, while the larger elements 'sink' to the bottom (end).

Time Complexity : O(N^2)
*/

package Sorting;
import java.io.*;

class BubbleSort
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
        int n = size - 1;

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<(n-i); j++)
            {
                if (arr[j] > arr[j+1])
                {
                    //Swapping
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        BubbleSort obj = new BubbleSort();

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