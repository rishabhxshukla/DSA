// Program to find the smallest element of an array

package Recursion.Questions;
import java.io.*;

class ArrayMin
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to find the max element */
    static int min = Integer.MAX_VALUE;
    static int min(int i)
    {
        if (i == arr.length) {
            return min;
        }

        if (arr[i] < min) {
            min = arr[i];
        }

        return min(i + 1);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ArrayMin obj = new ArrayMin();
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

        //Finding the smallest element
        System.out.println("\nMin : " + min(0));
    }
}