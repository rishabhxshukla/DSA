// Find first K smallest elements of an array

package Heap.Questions;
import java.io.*;
import java.util.*;

class KSmallest
{
    static final int size = 5;
    static PriorityQueue<Integer> pq = new PriorityQueue<>();


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


    /* Function to print K smallest elements */
    void kSmallest(int k)
    {
        //Printing K smallest elements
        while (k > 0)
        {
            System.out.print(pq.remove() + " ");
            k--;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        KSmallest h = new KSmallest();
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

        //Printing the K smallest elements
        System.out.println("*** K Smallest Elements ***");
        h.kSmallest(k);
    }
}