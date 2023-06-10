// Implementing stack using 2 queues with Pop operation being the costlier one

package Queue.Questions;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

class StackUsingQueue2
{
    static final int MAX = 5;

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();


    /* PUSH */
    void push(int data)
    {
        //Adding new element into Q1
        q1.add(data);
    }


    /* POP */
    int pop()
    {
        //Shifting all elements from Q1 to Q2
        while (q1.size() != 1)
        {
            q2.add(q1.remove());
        }

        //Popping the top element of Q1
        int res = q1.remove();

        //Shifting back the elements into Q1
        while (!q2.isEmpty())
        {
            q1.add(q2.remove());
        }

        return res;
    }


    public static void main(String args[]) throws IOException
    {
        StackUsingQueue2 s = new StackUsingQueue2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<MAX; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            s.push(d);
        }

        //Original Stack
        System.out.println("*** Original Stack ***");
        System.out.print(q1);

        //Performing operations
        System.out.println("\nRemoving " +s.pop()+ " from the stack...");
        System.out.println("Removing " +s.pop()+ " from the stack...");

        //New Stack
        System.out.println("*** New Stack ***");
        System.out.print(q1);
    }
}