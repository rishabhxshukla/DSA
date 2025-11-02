// Implementing queue using 2 stacks with Enqueue operation being the costlier one

package Stack.Questions;
import java.io.*;
import java.util.*;

class QueueUsingStack1
{
    /* 2-STACKS : */
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();


    /* ENQUEUE */
    void enqueue(int data)
    {
        //Shifting all elements from S1 to S2
        while (!s1.isEmpty())
        {
            s2.push(s1.pop());
        }

        //Pushing new element into S1
        s1.push(data);

        //Shifting back the elements into S1
        while (!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }


    /* DEQUEUE */
    int dequeue()
    {
        return s1.pop();
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        QueueUsingStack1 obj = new QueueUsingStack1();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the stack
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            obj.enqueue(d);
        }

        //Printing original queue
        System.out.println("*** Original Queue ***");
        System.out.print(s1);

        //Performing operations
        System.out.println("\nRemoving " + obj.dequeue() + " from the queue...");
        System.out.println("Removing " + obj.dequeue() + " from the queue...");

        //Printing new queue
        System.out.println("*** New Queue ***");
        System.out.print(s1);
    }
}