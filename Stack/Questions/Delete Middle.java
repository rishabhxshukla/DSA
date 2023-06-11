package Stack.Questions;
import java.io.*;

class DeleteMiddle
{
    static int top = -1;
    static final int MAX = 5;
    int a[] = new int[MAX];


    /* Print Stack */
    void printStk()
    {
        for (int i=top; i>=0; i--)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* isEmpty() */
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


    /* PEEK */
    int peek()
    {
        if (top < 0) {
            System.out.println("Stack is Empty!");
            return -999;
        }
        else
            return a[top];
    }


    /* Function to find length of stack */
    static int lengthOfStack()
    {
        int count = 0;
        int i = top;
        while (i >= 0)
        {
            i--;
            count++;
        }
        return count;
    }


    /* Function to delete middle element */
    void deleteMiddle()
    {
        DeleteMiddle s = new DeleteMiddle();
        DeleteMiddle t = new DeleteMiddle();
        int mid = lengthOfStack()/2;
        int count = 0;

        //Storing elements in a temporary stack until mid is found
        while (count != mid)
        {
            t.push(s.peek());
            s.pop();
            count++;
        }
        s.pop();    //Popping out middle element

        //Placing elements back to the main stack from the temp stack
        while (!t.isEmpty())
        {
            s.push(t.peek());
            t.pop();
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        DeleteMiddle s = new DeleteMiddle();
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

        //Deleting middle element
        System.out.println("\nDeleting middle element...");
        s.deleteMiddle();

        //Printing new stack
        System.out.println("*** New Stack ***");
        s.printStk();
    }
}