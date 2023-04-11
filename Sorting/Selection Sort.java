package Sorting;
import java.io.*;

class Selection_Sort
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
        int min, t;

        for (int i=0; i<arr.length-1; i++)
        {
            min = i;

            for (int j=i+1; j<arr.length; j++)
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
        Selection_Sort obj = new Selection_Sort();
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