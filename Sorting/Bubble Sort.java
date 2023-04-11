package Sorting;
import java.io.*;

class Bubble_Sort
{
    static int arr[] = new int[5];

    /* Printing the array */
    void print()
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Function to sort elements of an array */
    void sort()
    {
        int t;
        int n = arr.length - 1;

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
        Bubble_Sort obj = new Bubble_Sort();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        System.out.print("Created array : ");
        obj.print();
        System.out.println("\nSorting...");
        obj.sort();
        System.out.print("New array : ");
        obj.print();
    }
}