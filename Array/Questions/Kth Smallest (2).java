// Kth smallest element in an unsorted array
// MIN HEAP

package Array.Questions;
import java.io.*;
import java.util.*;

class KthSmallest2
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Creating the array */
    void create() throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }
    }


    /* Printing the array */
    void print(int a[])
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* Function to sort the array and return the Kth smallest element */
    static int Kth(int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int min = 0;

        //Inserting elements in PriorityQueue
        for (int i=0; i<size; i++)
        {
            pq.add(arr[i]);
        }

        //Getting Kth smallest element
        while (k > 0)
        {
            min = pq.remove();
            k--;
        }

        return min;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        KthSmallest2 obj = new KthSmallest2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the value of k : ");
        int k = Integer.parseInt(b.readLine());

        //Printing the Kth smallest element
        System.out.println("Kth smallest element : " + Kth(k));
    }
}