/*
Subarray is an array inside another array.
For an array of size n, there are n*(n+1)/2 subarrays.
*/
// NESTED LOOPS

package Array.Questions;
import java.io.*;

class Subarrays
{
    static final int size = 3;
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


    // TIME COMPLEXITY : O(N^3)
    /* Function to print the subarrays */
    void subarrays()
    {
        for (int i=0; i<size; i++)
        {
            for (int j=i; j<size; j++)
            {
                for (int k=i; k<=j; k++)
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Subarrays obj = new Subarrays();

        //Creating the array
        obj.create();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Printing the subarrays
        System.out.println("\n*** Subarrays ***");
        obj.subarrays();
    }
}