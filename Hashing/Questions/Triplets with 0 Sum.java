// Find triplets in the array whose sum is zero
// HASHSET

package Hashing.Questions;
import java.io.*;
import java.util.*;

class Triplets
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


    // TIME COMPLEXITY : O(N^2)
    /* Function to find the triplets */
    void triplets()
    {
        HashSet<Integer> hs = new HashSet<>();
        boolean present = false;

        //Finding the sum of 2 elements
        for (int i=0; i<size-1; i++)
        {
            for (int j=i+1; j<size; j++)
            {
                //3rd number
                int sum = -(arr[i] + arr[j]);

                //If 3rd no. is present in HashSet
                if (hs.contains(sum)) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ", " + sum + ")");
                    present = true;
                }

                //Otherwise add 2nd no. to HashSet
                hs.add(arr[j]);
            }
        }

        //If no triplet is present
        if (!present)
            System.out.println("Triplets not found!");
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Triplets obj = new Triplets();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the triplets
        System.out.println("\n*** Triplets ***");
        obj.triplets();
    }
}