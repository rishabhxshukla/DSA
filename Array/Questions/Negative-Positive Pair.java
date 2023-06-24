// Find all the negative-positive pairs present in an array.
// HASHSET

package Array.Questions;
import java.io.*;
import java.util.*;

class NegativePositivePair
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


    /* Function to find the negative-positive pairs */
    void pairs()
    {
        HashSet<Integer> hs = new HashSet<>();

        //Storing all the elements in HashSet
        for (int i=0; i<size; i++)
        {
            hs.add(arr[i]);
        }

        //Printing the pairs
        for (int i=0; i<size; i++)
        {
            //If negative of current element is present
            if (hs.contains(-arr[i]))
            {
                //Printing the pair
                System.out.println(-arr[i] + ", " + arr[i]);
                //Removing the pair
                hs.remove(arr[i]);
                hs.remove(-arr[i]);
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        NegativePositivePair obj = new NegativePositivePair();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the pairs
        System.out.println("\n*** Negative-Positive Pairs ***");
        obj.pairs();
    }
}