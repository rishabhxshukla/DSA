// Implementing queue using 2 stacks with Dequeue operation being the costlier one

package Stack.Questions;
import java.io.*;
import java.util.Stack;

class QueueUsingStack2
{
    /* 2-STACKS : */
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();


    /* ENQUEUE */
    void enqueue(int data)
    {
        s1.push(data);
    }


    /* DEQUEUE */
    int dequeue()
    {
        //Shifting all elements into S2
        while (!s1.isEmpty())
        {
            s2.push(s1.pop());
        }

        //Popping out the top element
        int ans = s2.pop();

        //Shifting back the elements into S1
        while (!s2.isEmpty())
        {
            s1.push(s2.pop());
        }

        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        QueueUsingStack2 q = new QueueUsingStack2();
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
        System.out.print(s1);

        //Performing operations
        System.out.println("\nRemoving " +q.dequeue()+ " from the queue...");
        System.out.println("Removing " +q.dequeue()+ " from the queue...");

        //New Queue
        System.out.println("*** New Queue ***");
        System.out.print(s1);
    }
}