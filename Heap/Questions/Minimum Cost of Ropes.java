/*
Given N ropes of different lengths, the task is to connect these
ropes into one rope with minimum cost.
Cost of 2 ropes = Sum of lengths of 2 ropes
*/

package Heap.Questions;
import java.io.*;
import java.util.*;

class MinCostOfRopes
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


    /* Function to find the minimum cost */
    static int minCost()
    {
        int cost = 0;

        //Till PQ contains only 1 element
        while (pq.size() != 1)
        {
            //Getting top 2 minimum elements
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost = cost + min1 + min2;

            //Adding combined length in PQ
            pq.add(min1 + min2);
        }

        return cost;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MinCostOfRopes h = new MinCostOfRopes();

        //Creating the heap
        h.create();

        //Printing the heap
        System.out.println("*** Created Heap ***");
        h.print();

        //Printing the minimum cost
        System.out.println("Minimum cost : " + minCost());
    }
}