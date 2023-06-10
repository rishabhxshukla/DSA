package Queue.Questions;
import java.io.*;
import java.util.Stack;

class QueueReverse
{
    int front = -1, rear = -1;
    static final int MAX = 5;
    int a[] = new int[MAX];
    Stack<Integer> s = new Stack<>();


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
            int ans = a[0];

            for (int i = 0; i < rear; i++)
            {
                a[i] = a[i+1];
            }
            rear--;

            return ans;
        }
    }


    /* Function to reverse the queue */
    void reverse(QueueReverse q)
    {
        while (!q.isEmpty())
        {
            s.push(q.dequeue());
        }

        while (!s.isEmpty())
        {
            q.enqueue(s.pop());
        }
    }


    public static void main(String args[]) throws IOException
    {
        QueueReverse q = new QueueReverse();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<MAX; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            q.enqueue(d);
        }

        System.out.println("*** Original Queue ***");
        q.printQue();

        System.out.println("\nReversing the queue...");
        q.reverse(q);

        System.out.println("*** New Queue ***");
        q.printQue();
    }
}