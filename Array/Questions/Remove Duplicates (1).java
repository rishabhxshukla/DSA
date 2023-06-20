// Remove duplicate elements from a sorted array
// 1 POINTER

package Array.Questions;
import java.io.*;

class RemoveDuplicates1
{
    static int arr[] = {2, 3, 3, 7, 9, 9, 9, 10, 12, 12, 12};


    /* Printing the array */
    void print(int a[])
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* Function to remove the duplicates */
    void removeDuplicates()
    {
        //Pointer
        int k = 0;

        for (int i=1; i<arr.length; i++)
        {
            if (arr[i] != arr[k]) {
                k++;
                arr[k] = arr[i];
            }
        }

        //Printing the elements after removing duplicates
        for (int i = 0; i < k; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        RemoveDuplicates1 obj = new RemoveDuplicates1();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Removing duplicates
        System.out.println("\nRemoving duplicates...");
        System.out.println("*** New Array ***");
        obj.removeDuplicates();
    }
}