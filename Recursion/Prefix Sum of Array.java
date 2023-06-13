// Program to print the prefix sum of the array
// Prefix Sum = Sum of all the elements till the index i for every element of the array

package Recursion;
import java.io.*;

class PrefixSum
{
    static final int size = 5;
    static int arr[] = new int[size];
    static int sum[] = new int[size];


    /* Function to find the prefix sum */
    void prefixSum(int i)
    {
        if (i == 0) {
            sum[0] = arr[0];
            return;
        }

        prefixSum(i-1);
        sum[i] = sum[i-1] + arr[i];
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        PrefixSum obj = new PrefixSum();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing the array
        System.out.println("*** Created Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Calculating the prefix sum
        obj.prefixSum(size-1);

        //Printing the prefix sum array
        System.out.println("\n*** Prefix Sum ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(sum[i] + " ");
        }
    }
}