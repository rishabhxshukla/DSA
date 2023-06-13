// Smallest element of the array

package Array.Questions;
import java.io.*;

class Min
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to find the smallest element of the array */
    static int smallest()
    {
        int min = Integer.MAX_VALUE;

        for (int i=0; i<size; i++)
        {
            if (arr[i] < min)
                min = arr[i];
        }

        return min;
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

        //Printing the smallest element
        System.out.println("\nSmallest element : " + smallest());
    }
}