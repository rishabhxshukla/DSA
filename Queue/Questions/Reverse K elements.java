/*
STEPS :
1. Pop first K elements from queue and put them into a stack
2. Pop elements from stack and push them back into the queue
3. Fetch first (n-k) elements from the queue and place them at the end of queue
 */
package Questions;
import java.io.*;
import java.util.Stack;

class ReverseFirstK
{
    int front = -1, rear = -1;
    static final int MAX = 5;
    int a[] = new int[MAX];
    static Stack<Integer> s = new Stack<>();


    /* Print Queue */
    void printQue()
    {
        for (int i=0; i<=rear; i++)
        {
            System.out.print(a[i] + " ");
        }
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


    /* Function to reverse the first K elements */
    void reverse(ReverseFirstK q, int k)
    {
        //Inserting first k elements into the stack
        for (int i=0; i<k; i++)
        {
            s.push(q.dequeue());
        }

        //Pushing elements back into the queue
        while (!s.isEmpty())
        {
            q.enqueue(s.pop());
        }

        //Placing the remaining elements at the end of queue
        for (int i=0; i<(MAX-k); i++)
        {
            int e = q.dequeue();
            q.enqueue(e);
        }
    }


    public static void main(String args[]) throws IOException
    {
        ReverseFirstK q = new ReverseFirstK();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Inserting the elements
        for (int i=0; i<MAX; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            q.enqueue(d);
        }

        //Taking input for 'k'
        System.out.print("How many elements do you want to reverse? : ");
        int k = Integer.parseInt(b.readLine());
        if (k < 0 || k > MAX)
        {
            System.out.print("INVALID ENTRY!!");
            System.exit(0);
        }

        //Printing original queue
        System.out.println("*** Original Queue ***");
        q.printQue();

        //Reversing the elements
        System.out.println("\nReversing the elements...");
        q.reverse(q, k);

        //Printing new queue
        System.out.println("*** New Queue ***");
        q.printQue();
    }
}