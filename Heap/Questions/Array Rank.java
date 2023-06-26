// Replace each array element by its corresponding rank

package Heap.Questions;
import java.io.*;
import java.util.*;

class ArrayRank
{
    static final int size = 5;
    static int arr[] = new int[size];
    static PriorityQueue<Integer> pq = new PriorityQueue<>();


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
    void print()
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Creating the heap */
    void makeHeap()
    {
        for (int i=0; i<size; i++)
        {
            pq.add(arr[i]);
        }
    }


    /* Function to copy rank back to array index */
    void copyRank()
    {
        //Copying elements in heap
        makeHeap();

        //Rank variable
        int rank = 1;

        while (!pq.isEmpty())
        {
            //Removing the root
            int root = pq.remove();

            //Comparing root with every array element
            for (int i=0; i<size; i++)
            {
                if (root == arr[i])
                {
                    //Replacing with rank
                    arr[i] = rank;
                    rank++;
                }
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ArrayRank obj = new ArrayRank();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print();

        //Copying ranks
        obj.copyRank();

        //Printing the new array
        System.out.println("\n*** Ranks ***");
        obj.print();
    }
}