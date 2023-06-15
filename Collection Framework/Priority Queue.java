/*
By default, priority is given to number with lesser value.
If you want to change this behaviour, just pass 'Collections.reverseOrder()' in PriorityQueue<>().
NOTE :
Internal data structure of PriorityQueue is not ordered, it is a heap; so while printing pq, elements can be unordered.
PriorityQueue doesn't need to be ordered because it only focuses on the head, and sorting wastes time.
*/

package CollectionFramework;
import java.util.Collections;
import java.util.PriorityQueue;

class Priority_Queue
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        /* Inserting elements */
        pq.add(10);
        pq.add(70);
        pq.add(30);
        pq.add(50);


        /* Printing the Priority Queue */
        System.out.println("Printing the Priority Queue :");
        System.out.println(pq);
        System.out.println();


        /* Getting the head element of Priority Queue */
        System.out.println("Head element :");
        int head = pq.peek();
        System.out.println(head);
        System.out.println();


        /* Removing the front element of Priority Queue */
        System.out.println("After removing front element :");
        pq.remove();
        System.out.println(pq);
        System.out.println();


        /* Size of Priority Queue */
        System.out.println("Size of Priority Queue :");
        int size = pq.size();
        System.out.println(size);
        System.out.println();


        /* Converting Priority Queue to Array */
        System.out.println("Converting PQ to Array :");
        Object[] arr = pq.toArray();
        for (int j=0; j<arr.length; j++)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n");


        /* Deleting full Priority Queue */
        System.out.println("Deleting full Priority Queue :");
        pq.clear();
        System.out.println(pq);
    }
}