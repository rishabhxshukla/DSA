// Implementing stack using 2 queues with Push operation being the costlier one

package Queue.Questions;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

class StackUsingQueue1
{
    static final int MAX = 5;

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();


    /* PUSH */
    void push(int data)
    {
        //Adding new element into Q2
        q2.add(data);

        //Shifting all elements from Q1 to Q2
        while (!q1.isEmpty())
        {
            q2.add(q1.remove());
        }

        //Shifting back the elements into Q1
        while (!q2.isEmpty())
        {
            q1.add(q2.remove());
        }
    }


    /* POP */
    int pop()
    {
        return q1.remove();
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        StackUsingQueue1 s = new StackUsingQueue1();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the queue
        for (int i=0; i<MAX; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            s.push(d);
        }

        //Printing original queue
        System.out.println("*** Original Stack ***");
        System.out.print(q1);

        //Performing operations
        System.out.println("\nRemoving " +s.pop()+ " from the stack...");
        System.out.println("Removing " +s.pop()+ " from the stack...");

        //Printing new queue
        System.out.println("*** New Stack ***");
        System.out.print(q1);
    }
}