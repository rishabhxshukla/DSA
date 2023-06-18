// ...

package Queue.Questions;
import java.io.*;

class Boilerplate
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
            int ans = a[0];

            for (int i = 0; i < rear; i++)
            {
                a[i] = a[i+1];
            }
            rear--;

            return ans;
        }
    }


    /* Function to ... */
    //


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Boilerplate q = new Boilerplate();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the queue
        for (int i=0; i<MAX; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            q.enqueue(d);
        }

        //Printing the queue
        System.out.println("*** Created Queue ***");
        q.printQue();
    }
}