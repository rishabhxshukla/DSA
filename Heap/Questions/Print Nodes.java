// Print all nodes which are less than a value x in a Min Heap

package Heap.Questions;
import java.io.*;
import java.util.*;

class PrintNodes
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


    /* Function to print nodes which are less than key */
    void printLessThan(int key)
    {
        while (pq.peek() != key)
        {
            //If key is not found
            if (pq.isEmpty()) {
                System.out.println("ERROR : Heap is empty, key not found.");
                return;
            }

            System.out.print(pq.remove() + " ");
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        PrintNodes obj = new PrintNodes();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the heap
        obj.create();

        //Printing the heap
        System.out.println("*** Created Heap ***");
        obj.print();

        //Taking user input
        System.out.print("Enter the key : ");
        int key = Integer.parseInt(b.readLine());

        //Printing the nodes which are less than key
        System.out.println("Nodes less than " +key+ " are : ");
        obj.printLessThan(key);
    }
}