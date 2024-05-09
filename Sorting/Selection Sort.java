/*
Selection Sort works by repeatedly selecting the minimum (or maximum) element from
the unsorted portion of the array and placing it at the beginning of the array.

Time Complexity : O(N^2)
*/

package Sorting;
import java.io.*;

class SelectionSort
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

        for (int i=0; i<n-1; i++)
        {
            int min = i;

            for (int j=i+1; j<n; j++)
            {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //Swapping
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SelectionSort obj = new SelectionSort();

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