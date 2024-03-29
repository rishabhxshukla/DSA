// Kth largest element in an unsorted array
// MAX HEAP

package Heap.Questions;
import java.io.*;
import java.util.*;

class KthLargest
{
    static final int size = 5;
    static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


    /* Creating the heap */
    void create() throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            int e = Integer.parseInt(b.readLine());
            pq.add(e);
        }
    }


    /* Printing the heap */
    void print()
    {
        System.out.println(pq);
    }


    /* Function to return the Kth largest element */
    static int Kth(int k)
    {
        int e = 0;

        while(k > 0)
        {
            e = pq.remove();
            k--;
        }

        return e;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        KthLargest h = new KthLargest();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the heap
        h.create();

        //Printing the heap
        System.out.println("*** Created Heap ***");
        h.print();

        //Taking user input
        System.out.print("Enter the value of K : ");
        int k = Integer.parseInt(b.readLine());

        //Printing the Kth largest element
        System.out.println("Kth largest element : " + Kth(k));
    }
}