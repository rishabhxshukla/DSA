// ...

package Heap.Questions;
import java.io.*;
import java.util.PriorityQueue;

class Boilerplate
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


    /* Function to ... */
    //


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Boilerplate obj = new Boilerplate();

        //Creating the heap
        obj.create();

        //Printing the heap
        System.out.println("*** Created Heap ***");
        obj.print();

        //Printing the ...
    }
}