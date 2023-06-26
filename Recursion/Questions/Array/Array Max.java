// Program to find the largest element of an array

package Recursion.Questions.Array;
import java.io.*;

class ArrayMax
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to find the max element */
    static int max = Integer.MIN_VALUE;
    static int max(int i)
    {
        if (i == arr.length) {
            return max;
        }

        if (arr[i] > max) {
            max = arr[i];
        }

        return max(i + 1);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ArrayMax obj = new ArrayMax();
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

        //Finding the largest element
        System.out.println("\nMax : " + max(0));
    }
}