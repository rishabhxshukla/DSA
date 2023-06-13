// Kth largest element in an unsorted array
// SORTING

package Array.Questions;
import java.io.*;
import java.util.*;

class KthLargest
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to sort the array and return the Kth largest element */
    static int Kth(int k)
    {
        //Sorting the array
        Arrays.sort(arr);

        //Returning Kth element from last
        return arr[size - k];
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

        //Printing the Kth largest element
        System.out.println("Kth largest element : " + Kth(k));
    }
}