/*
Counting Sort is a sorting algorithm that works particularly well when the range of input
values is small compared to the size of the array to be sorted.
This means that although the array is big, but the elements present inside it lie only in
a specific range, and they keep repeating. Eg : 1 3 1 5 7 1 9 3 5 7 5 9 3 1 5

STEPS :
1) Find the maximum element of original array.
2) Create count array of size max + 1.
3) Store the count of each element in count[].
4) Build the sorted array using 2 pointers.

The only problem with this algorithm is that the complexity increases if the size of maximum
element is very big.
*/

package Sorting;
import java.io.*;

class Counting_Sort
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


    /* Function to sort elements of the array */
    void sort()
    {
        //Finding the maximum element of original array
        int max = 0;
        for (int i=0; i<size; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }

        //Creating count array of size max+1
        int count[] = new int[max+1];

        //Storing the count of each element
        for (int i=0; i<size; i++)
        {
            count[arr[i]]++;
        }

        int i = 0;  //Pointer for count array
        int j = 0;  //Pointer for main array

        //Building the sorted array
        while (i <= max)
        {
            if (count[i] > 0)
            {
                arr[j] = i;
                count[i]--;
                j++;
            }
            else
                i++;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Counting_Sort obj = new Counting_Sort();
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