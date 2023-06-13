// Program to print the prefix sum of the array
// Prefix Sum = Sum of all the elements till the index i for every element of the array

package Array.Questions;
import java.io.*;

class PrefixSum
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


    /* Function to find the prefix sum */
    void prefixSum()
    {
        //Starting from the second element
        for (int i=1; i<size; i++)
        {
            arr[i] = arr[i-1] + arr[i];
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        PrefixSum obj = new PrefixSum();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Calculating the prefix sum
        obj.prefixSum();

        //Printing the prefix sum array
        System.out.println("\n*** Prefix Sum ***");
        obj.print(arr);
    }
}