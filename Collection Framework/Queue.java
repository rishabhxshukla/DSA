package CollectionFramework;
import java.util.Queue;
import java.util.LinkedList;

class Queue_CF
{
    public static void main(String args[])
    {
        Queue<Integer> q = new LinkedList<>();

        /* Inserting elements */
        q.add(30);
        q.add(20);
        q.add(10);


        /* Printing the Queue */
        System.out.println("Printing the Queue :");
        System.out.println(q);
        System.out.println();


        /* Getting the front element of the Queue */
        System.out.println("Front element :");
        int front = q.peek();
        System.out.println(front);
        System.out.println();


        /* Removing the front element of the Queue */
        System.out.println("Removing front element :");
        q.remove();
        System.out.println(q);
        System.out.println();


        /* Size of Queue */
        System.out.println("Size of Queue :");
        int size = q.size();
        System.out.println(size);
        System.out.println();


        /* Deleting full Queue */
        System.out.println("Deleting full Queue :");
        q.clear();
        System.out.println(q);
    }
}