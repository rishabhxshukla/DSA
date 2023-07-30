// Sum of all elements between k1’th and k2’th smallest elements

package Heap.Questions;
import java.io.*;
import java.util.*;

class SumBetween
{
    static final int size = 6;
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


    /* Function to find the sum */
    static int sum(int k1, int k2)
    {
        int i = 1;      //Starting pointer from 1
        int sum = 0;    //Variable to store sum

        //Removing all the elements till k1 (including k1)
        while (i <= k1)
        {
            pq.remove();
            i++;
        }

        //Summing all the elements till k2 (excluding k2)
        while (i < k2)
        {
            sum = sum + pq.remove();
            i++;
        }

        return sum;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SumBetween h = new SumBetween();

        //Creating the heap
        h.create();

        //Printing the heap
        System.out.println("*** Created Heap ***");
        h.print();

        //Values of k
        int k1 = 2;
        int k2 = 5;

        //Printing the sum of elements between k1 smallest and k2 smallest
        System.out.println("Sum : " + sum(k1, k2));
    }
}