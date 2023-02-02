/* Implementing stack using a single queue only */
package Questions;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

class StackUsingQueue3
{
    static final int MAX = 5;
    static Queue<Integer> q = new LinkedList<>();


    /* PUSH */
    void push(int data)
    {
        if (q.size() == MAX)
            System.out.println("Stack Overflow!");
        else
        {
            //Adding the new element
            q.add(data);

            //Placing all the previous elements at the end
            for (int i=0; i<q.size(); i++)
            {
                int val = q.remove();
                q.add(val);
            }
        }
    }


    /* POP */
    int pop()
    {
        if (q.isEmpty()) {
            System.out.println("Queue Underflow!");
            return -999;
        }
        else
            return q.remove();
    }


    public static void main(String args[]) throws IOException
    {
        StackUsingQueue3 s = new StackUsingQueue3();
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
        System.out.print(q);

        //Performing operations
        System.out.println("\nRemoving " +s.pop()+ " from the stack...");
        System.out.println("Removing " +s.pop()+ " from the stack...");

        //New Stack
        System.out.println("*** New Stack ***");
        System.out.print(q);
    }
}