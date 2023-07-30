// Find maximum distinct elements after removing k elements from the heap

package Heap.Questions;
import java.io.*;
import java.util.*;

class MaximumDistinct
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


    /* Function to print the no. of distinct elements */
    static int distinct(int k)
    {
        int count = 0;

        //Removing k elements
        while (k > 0 && !pq.isEmpty())
        {
            pq.remove();
            k--;
        }

        //Counting no. of distinct elements
        while (!pq.isEmpty())
        {
            //Removed element
            int removed = pq.remove();

            //If removed was the last element
            if (pq.peek() == null) {
                count++;
                return count;
            }

            //If removed element is not equal to next element
            if (removed != pq.peek()) {
                count++;
            }
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MaximumDistinct h = new MaximumDistinct();
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

        //Printing the no. of distinct elements
        System.out.println("No. of distinct elements : " + distinct(k));
    }
}