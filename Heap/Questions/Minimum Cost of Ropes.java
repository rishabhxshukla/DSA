/*
Given N ropes of different lengths, the task is to connect these
ropes into one rope with minimum cost.
Cost of 2 ropes = Sum of lengths of 2 ropes
*/

package Heap.Questions;
import java.io.*;
import java.util.PriorityQueue;

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
        //Getting top 2 minimum elements
        int min1 = pq.remove();
        int min2 = pq.remove();

        return (min1 + min2);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MinCostOfRopes obj = new MinCostOfRopes();

        //Creating the heap
        obj.create();

        //Printing the heap
        System.out.println("*** Created Heap ***");
        obj.print();

        //Printing the minimum cost
        System.out.println("Minimum cost : " + minCost());
    }
}