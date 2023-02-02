/* Implementation of Queue using a Linked List */
package Queue;
import java.io.*;

class LL_Implementation
{
    static Node front, rear;
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    /* Print Queue */
    void printQue()
    {
        Node temp = front;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* ENQUEUE */
    void enqueue(int d)
    {
        Node new_node = new Node(d);
        //If queue is empty
        if (front == null)
        {
            front = rear = new_node;
        }
        else
        {
            rear.next = new_node;
            rear = new_node;
        }
    }


    /* DEQUEUE */
    int dequeue()
    {
        if (front == null) {
            System.out.println("Queue Underflow!");
            return -999;
        }
        else
        {
            int res = front.data;
            front = front.next;
            return res;
        }
    }


    /* PEEK */
    int peek()
    {
        if (front == null) {
            System.out.println("Queue Underflow!");
            return -999;
        }
        else
            return front.data;
    }


    public static void main(String args[]) throws IOException
    {
        LL_Implementation q = new LL_Implementation();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            q.enqueue(d);
        }

        //Original Queue
        System.out.println("*** Original Queue ***");
        q.printQue();

        //Performing operations
        System.out.println("\nRemoving " +q.peek()+ " from the queue...");
        q.dequeue();
        System.out.println("Removing " +q.peek()+ " from the queue...");
        q.dequeue();

        //New Queue
        System.out.println("*** New Queue ***");
        q.printQue();
    }
}