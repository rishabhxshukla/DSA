// Create an answer array which is the result of concatenation of 2 same arrays

package Array.Questions;
import java.io.*;

class Concatenate
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


    /* Function to concatenate the arrays */
    void concatenate()
    {
        //Answer array to store 2 arrays
        int ans[] = new int[2*size];

        //Concatenating the arrays
        for (int i=0; i<size; i++)
        {
            ans[i] = arr[i];
            ans[i + size] = arr[i];
        }

        //Printing the answer array
        for (int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
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