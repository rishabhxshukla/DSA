// Kth largest element in an unsorted array
// MAX HEAP

package Array.Questions;
import java.io.*;
import java.util.*;

class KthLargest2
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


    /* Function to sort the array and return the Kth largest element */
    static int Kth(int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int max = 0;

        //Inserting elements in PriorityQueue
        for (int i=0; i<size; i++)
        {
            pq.add(arr[i]);
        }

        //Getting Kth largest element
        while (k > 0)
        {
            max = pq.remove();
            k--;
        }

        return max;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        KthLargest2 obj = new KthLargest2();
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

        //Printing the Kth largest element
        System.out.println("Kth largest element : " + Kth(k));
    }
}