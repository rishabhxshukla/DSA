package Questions;
import java.io.*;

class InsertBottom
{
    int top = -1;
    static final int MAX = 6;
    int a[] = new int[MAX];


    /* Printing Stack */
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


    /* Function to insert element at the bottom of the stack */
    void insertAtBottom(InsertBottom s, int data)
    {
        InsertBottom t = new InsertBottom();    //Temporary Stack

        //Shifting all elements from main stack to temp stack
        while (!s.isEmpty())
        {
            t.push(s.pop());
        }
        s.push(data);   //Inserting the last element

        //Re-shifting all elements from temp stack to main stack
        while (!t.isEmpty())
        {
            s.push(t.pop());
        }
    }


    public static void main(String args[]) throws IOException
    {
        InsertBottom s = new InsertBottom();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<MAX-1; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            s.push(d);
        }

        System.out.println("*** Original Stack ***");
        s.printStk();

        System.out.print("\nEnter the element that you want to insert : ");
        int d = Integer.parseInt(b.readLine());
        s.insertAtBottom(s, d);

        System.out.println("*** New Stack ***");
        s.printStk();
    }
}