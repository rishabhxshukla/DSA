package Questions;
import java.io.*;

class InterleaveHalves
{
    int front = -1, rear = -1;
    static final int MAX = 6;
    int a[] = new int[MAX];


    /* Print Queue */
    void printQue()
    {
        for (int i = 0; i <= rear; i++)
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
            int ans = a[0];
            for (int i=0; i<rear; i++)
            {
                a[i] = a[i+1];
            }
            rear--;

            return ans;
        }
    }


    /* Function to interleave the 1st and 2nd halves */
    void interleave(InterleaveHalves q)
    {
        //Creating a temporary queue
        InterleaveHalves temp = new InterleaveHalves();

        //Storing second half elements into the temp queue
        for (int i=MAX/2; i<MAX; i++)
        {
            temp.enqueue(q.dequeue());
        }

        //Removing elements from temp & original queues and
        //placing them at the end of original queue
        while (!temp.isEmpty())
        {
            q.enqueue(temp.dequeue());
            q.enqueue(q.dequeue());
        }
    }


    public static void main(String args[]) throws IOException
    {
        InterleaveHalves q = new InterleaveHalves();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Inserting the elements
        for (int i=0; i<MAX; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            q.enqueue(d);
        }

        //Printing original queue
        System.out.println("*** Original Queue ***");
        q.printQue();

        //Interleaving the 1st and 2nd halves
        System.out.println("\nInterleaving the 1st and 2nd halves...");
        q.interleave(q);

        //Printing new queue
        System.out.println("*** New Queue ***");
        q.printQue();
    }
}