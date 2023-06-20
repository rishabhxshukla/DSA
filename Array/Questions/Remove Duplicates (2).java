// Remove duplicate elements from a sorted array
// 2 POINTERS

package Array.Questions;
import java.io.*;

class RemoveDuplicates2
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
        //Pointers
        int i = 0, j = 1;

        while (j < arr.length)
        {
            //Move 2nd pointer
            if (arr[i] == arr[j]) {
                j++;
            }
            //Move 1st pointer
            else {
                i++;
                arr[i] = arr[j];
            }
        }

        //Printing the elements after removing duplicates
        for (int k = 0; k <= i; k++)
        {
            System.out.print(arr[k] + " ");
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        RemoveDuplicates2 obj = new RemoveDuplicates2();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Removing duplicates
        System.out.println("\nRemoving duplicates...");
        System.out.println("*** New Array ***");
        obj.removeDuplicates();
    }
}