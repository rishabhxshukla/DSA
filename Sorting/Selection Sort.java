package Sorting;
import java.io.*;

class Selection_Sort
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
        int min, t;
        int n = size;

        for (int i=0; i<n-1; i++)
        {
            min = i;

            for (int j=i+1; j<n; j++)
            {
                if (arr[j] < arr[min])
                    min = j;
            }
            //Swapping
            t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Selection_Sort obj = new Selection_Sort();
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