// Kth smallest element in an unsorted array
// SORTING

package Array.Questions;
import java.io.*;
import java.util.*;

class KthSmallest
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to sort the array and return the Kth smallest element */
    static int Kth(int k)
    {
        //Sorting the array
        Arrays.sort(arr);

        //Returning Kth element
        return arr[k - 1];
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

        //Taking user input
        System.out.print("\nEnter the value of k : ");
        int k = Integer.parseInt(b.readLine());

        //Printing the Kth smallest element
        System.out.println("Kth smallest element : " + Kth(k));
    }
}