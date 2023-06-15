/*
Min Heap implementation using Priority Queue.
NOTE :
Internal data structure of PriorityQueue is not ordered, it is a heap; so while printing pq, elements can be unordered.
PriorityQueue doesn't need to be ordered because it only focuses on the head, and sorting wastes time.
*/

package Heap;
import java.util.*;

class MinHeap2
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //Inserting elements
        pq.add(10);
        pq.add(70);
        pq.add(30);
        pq.add(50);


        //Printing the heap
        System.out.println("*** Min Heap ***");
        System.out.println(pq);
        System.out.println();


        //Printing the min element
        int min = pq.peek();
        System.out.println("Minimum element : " + min);
        System.out.println();


        //Removing the min element
        System.out.println("Removing min element...");
        pq.remove();
        System.out.println();


        //After removing min element
        System.out.println("*** New Min Heap ***");
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