/*
By default, priority is given to number with lesser value.
If you want to change this behaviour, just pass 'Comparator.reverseOrder()' in PriorityQueue<>().
*/

package CollectionFramework;
import java.util.PriorityQueue;
import java.util.Comparator;

class Priority_Queue
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        /* Inserting elements */
        pq.add(30);
        pq.add(50);
        pq.add(10);
        pq.add(70);


        /* Printing the Priority Queue */
        System.out.println("Printing the Priority Queue :");
        while (!pq.isEmpty())
        {
            System.out.print(pq.remove() + " ");
        }
        System.out.println();


        //Adding elements again to pq
        pq.add(30);
        pq.add(50);
        pq.add(10);
        pq.add(70);
        System.out.println();


        /* Getting the front element of the Priority Queue */
        System.out.println("Front element :");
        int front = pq.peek();
        System.out.println(front);
        System.out.println();


        /* Removing the front element of the Priority Queue */
        System.out.println("After removing front element :");
        pq.remove();
        System.out.println(pq);
        System.out.println();


        /* Size of Priority Queue */
        System.out.println("Size of Priority Queue :");
        int size = pq.size();
        System.out.println(size);
        System.out.println();


        /* Deleting full Priority Queue */
        System.out.println("Deleting full Priority Queue :");
        pq.clear();
        System.out.println(pq);
    }
}