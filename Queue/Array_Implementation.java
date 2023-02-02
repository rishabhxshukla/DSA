/* Implementation of Queue using an Array */
package Queue;
import java.io.*;

class Array_Implementation
{
    int front = -1, rear = -1;
    static final int MAX = 5;
    int a[] = new int[MAX];


    /* Print Queue */
    void printQue()
    {
        for (int i=0; i<=rear; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* isEmpty */
    boolean isEmpty()
    {
        return (front == rear);
    }


    /* ENQUEUE */
    void enqueue(int data)
    {
        if (rear == MAX - 1)
            System.out.println("Queue Overflow!");
        else
            a[++rear] = data;
    }


    /* DEQUEUE */
    int dequeue()
    {
        if (front == rear) {
            System.out.println("Queue Underflow!");
            return -999;
        }
        else
        {
            int res = a[0];   //Storing the front element

            //Shift all elements from index 0 till rear to the left
            for (int i=0; i<rear; i++)
            {
                a[i] = a[i+1];
            }
            rear--;    //Shifting rear 1 place to the left

            return res;
        }
    }


    /* PEEK */
    int peek()
    {
        if (front == rear) {
            System.out.println("Queue is Empty!");
            return -999;
        }
        else
            return a[0];
    }


    public static void main(String args[]) throws IOException
    {
        Array_Implementation q = new Array_Implementation();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<MAX; i++)
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