package Sorting;
import java.io.*;

class Bubble_Sort
{
    static final int size = 5;
    static int arr[] = new int[size];


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
        int t;
        int n = size - 1;

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<(n-i); j++)
            {
                if (arr[j] > arr[j+1])
                {
                    //Swapping
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Bubble_Sort obj = new Bubble_Sort();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print();

        //Sorting the elements
        System.out.println("\nSorting...");
        obj.sort();

        //Printing new array
        System.out.println("*** New Array ***");
        obj.print();
    }
}