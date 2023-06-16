// Arrays.sort() inbuilt method in Java

package Array;
import java.io.*;
import java.util.*;

class ArraysSort
{
    /* ARRAYS */
    int arr1[] = {2, 3, 1, 5, 4};
    Integer arr2[] = {2, 3, 1, 5, 4};
    int arr3[] = {2, 3, 1, 5, 4};


    /* Function to sort the array */
    void sort()
    {
        //Ascending Order
        System.out.println("\nAscending order : ");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));


        //Descending Order
        System.out.println("\nDescending order : ");
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));


        //Index-wise
        //Here upper limit is not included
        System.out.println("\nIndex-wise (0 to 3) : ");
        Arrays.sort(arr3, 0, 3);
        System.out.println(Arrays.toString(arr3));
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ArraysSort obj = new ArraysSort();

        //Sample Array
        System.out.println("SAMPLE ARRAY : 2, 3, 1, 5, 4");

        //Sorting the arrays
        obj.sort();
    }
}