// Find all duplicate elements in an unsorted array
// HASHSET

package Array.Questions;
import java.io.*;
import java.util.*;

class Duplicates1
{
    static final int size = 5;
    static int arr[] = new int[size];


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
    void print(int a[])
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* Function to find the duplicates */
    void duplicates()
    {
        HashSet<Integer> hs = new HashSet<>();

        //Adding elements to HashSet
        for (int i=0; i<size; i++)
        {
            hs.add(arr[i]);
        }

        //Printing the duplicates
        System.out.println(hs);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Duplicates1 obj = new Duplicates1();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the duplicates
        System.out.println("\nDuplicates : ");
        obj.duplicates();
    }
}