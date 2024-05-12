/*
Merge Sort is a divide-and-conquer sorting algorithm that works by recursively dividing the
input array into smaller sub-arrays until each sub-array contains only one element.
Then, it merges these smaller sorted sub-arrays to produce a single sorted array.

Time Complexity : O(n log n)
*/

package Sorting;
import java.io.*;

class MergeSort
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


    //Merge two sub-arrays of arr[]
    //First sub-array => arr[l...m]
    //Second sub-array => arr[m+1...r]
    void merge(int l, int m, int r)
    {
        //Sizes of sub-arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        //Create 2 temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //Copy data to temp arrays
        for (int i = 0; i < n1; i++)
        {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++)
        {
            R[j] = arr[m + 1 + j];
        }

        //Merge the temp arrays
        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
                k++;
            }
            else {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        //Copy remaining elements of L[] if any
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        //Copy remaining elements of R[] if any
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    /* Function to sort elements of an array */
    void sort(int l, int r)
    {
        if (l < r)
        {
            //Find the middle point
            int m = l + (r - l) / 2;

            //Sort first and second halves
            sort(l, m);
            sort(m + 1, r);

            //Merge the sorted halves
            merge(l, m, r);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MergeSort obj = new MergeSort();

        //Creating the array
        obj.create();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print();

        //Sorting the elements
        System.out.println("\nSorting...");
        obj.sort(0, size - 1);

        //Printing sorted array
        System.out.println("*** Sorted Array ***");
        obj.print();
    }
}