// Largest element of the array

package Questions;
import java.io.*;

class Largest
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to find the largest element of the array */
    static int largest()
    {
        int max = Integer.MIN_VALUE;

        for (int i=0; i<size; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
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

        //Printing the largest element
        System.out.println("\nLargest element : " + largest());
    }
}