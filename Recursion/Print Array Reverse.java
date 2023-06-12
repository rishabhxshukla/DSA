// Program to print the array recursively in reverse order

package Recursion;
import java.io.*;

class PrintArrayReverse
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to print the reverse of array */
    void print(int i)
    {
        if (i == 0) {
            System.out.print(arr[i]);
            return;
        }

        System.out.print(arr[i] + " ");
        print(i-1);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        PrintArrayReverse obj = new PrintArrayReverse();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing the array
        System.out.println("*** Reversed Array ***");
        obj.print(size-1);
    }
}