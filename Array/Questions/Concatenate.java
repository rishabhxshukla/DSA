// Create an answer array which is the result of concatenation of 2 same arrays

package Array.Questions;
import java.io.*;

class Concatenate
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


    /* Function to concatenate the arrays */
    void concatenate()
    {
        //New array to store arr twice
        int newarr[] = new int[size *  2];

        //Concatenating the arrays
        for (int i=0; i<size; i++)
        {
            newarr[i] = arr[i];
            newarr[i + size] = arr[i];
        }

        //Printing the answer array
        print(newarr);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Concatenate obj = new Concatenate();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Concatenating the arrays
        System.out.println("\n*** Concatenated Array ***");
        obj.concatenate();
    }
}