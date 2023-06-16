// Find first K largest elements of an array

package Heap.Questions;
import java.io.*;
import java.util.*;

class KLargest
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


    /* Function to print K largest elements */
    void kLargest(int k)
    {
        //Printing K largest elements
        while (k > 0)
        {
            System.out.print(pq.remove() + " ");
            k--;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        KLargest obj = new KLargest();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the heap
        obj.create();

        //Printing the heap
        System.out.println("*** Created Heap ***");
        obj.print();

        //Taking user input
        System.out.print("Enter the value of K : ");
        int k = Integer.parseInt(b.readLine());

        //Printing the K largest elements
        System.out.println("*** K Largest Elements ***");
        obj.kLargest(k);
    }
}