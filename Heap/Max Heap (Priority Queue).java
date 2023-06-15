/*
Max Heap implementation using Priority Queue.
NOTE :
Internal data structure of PriorityQueue is not ordered, it is a heap; so while printing pq, elements can be unordered.
PriorityQueue doesn't need to be ordered because it focuses on the head of data, and sorting wastes time.
*/

package Heap;
import java.util.*;

class MaxHeap2
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        //Inserting elements
        pq.add(10);
        pq.add(70);
        pq.add(30);
        pq.add(50);


        // Printing the heap
        System.out.println("*** Max Heap ***");
        System.out.println(pq);
        System.out.println();


        //Printing the max element
        int max = pq.peek();
        System.out.println("Maximum element : " + max);
        System.out.println();


        //Removing the max element
        System.out.println("Removing max element...");
        pq.remove();
        System.out.println();


        //After removing max element
        System.out.println("*** New Max Heap ***");
        System.out.println(pq);
        System.out.println();


        //Checking if pq contains an element
        boolean ans = pq.contains(10);
        System.out.println("Does PQ contain 10 : " + ans);
        System.out.println();


        //Converting Priority Queue to Array
        System.out.println("Converting PQ to Array...");
        Object[] arr = pq.toArray();

        System.out.println("*** Created Array ***");
        for (int j=0; j<arr.length; j++)
        {
            System.out.print(arr[j] + " ");
        }
    }
}