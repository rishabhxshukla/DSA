package Stack.Questions;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

class StackReverse
{
    int top = -1;
    static final int MAX = 5;
    int a[] = new int[MAX];
    Queue<Integer> q = new LinkedList<>();


    /* Print Stack */
    void printStk()
    {
        for (int i=top; i>=0; i--)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* isEmpty */
    boolean isEmpty()
    {
        return (top < 0);
    }


    /* PUSH */
    void push(int data)
    {
        if (top > MAX - 1)
            System.out.println("Stack Overflow!");
        else
            a[++top] = data;
    }


    /* POP */
    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow!");
            return -999;
        }
        else
            return a[top--];
    }


    /* Function to reverse the stack */
    void reverse(StackReverse s)
    {
        while (!s.isEmpty())
        {
            q.add(s.pop());
        }

        while (!q.isEmpty())
        {
            s.push(q.remove());
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        StackReverse s = new StackReverse();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the stack
        for (int i=0; i<MAX; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            s.push(d);
        }

        //Printing original stack
        System.out.println("*** Original Stack ***");
        s.printStk();

        //Reversing the stack
        System.out.println("\nReversing the stack...");
        s.reverse(s);

        //Printing new stack
        System.out.println("*** New Stack ***");
        s.printStk();
    }
}