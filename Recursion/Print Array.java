// Program to print the array recursively

package Recursion;
import java.io.*;

class PrintArray
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to print the array */
    void print(int i)
    {
        if (i == size-1) {
            System.out.print(arr[i]);
            return;
        }

        System.out.print(arr[i] + " ");
        print(i+1);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        PrintArray obj = new PrintArray();
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
        obj.print(0);
    }
}