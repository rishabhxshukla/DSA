// Sum of elements of the array

package Array.Questions;
import java.io.*;

class ArraySum
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to find the sum of the array */
    static int sum()
    {
        int sum = 0;

        for (int i=0; i<size; i++)
        {
            sum = sum + arr[i];
        }

        return sum;
    }


    public static void main(String args[]) throws IOException
    {
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

        //Printing the sum
        System.out.println("\nSum : " + sum());
    }
}