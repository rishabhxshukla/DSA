// Find triplets in the array whose sum is zero
// NESTED LOOPS

package Array.Questions;
import java.io.*;

class Triplets1
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


    // TIME COMPLEXITY : O(N^3)
    /* Function to find the triplets */
    void triplets()
    {
        boolean present = false;

        for (int i=0; i<size-2; i++)
        {
            for (int j=i+1; j<size-1; j++)
            {
                for (int k=j+1; k<size; k++)
                {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                        present = true;
                    }
                }
            }
        }

        //If no triplet is present
        if (!present)
            System.out.println("Triplets not found!");
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Triplets1 obj = new Triplets1();

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