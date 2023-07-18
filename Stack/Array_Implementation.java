/* Implementation of Stack using an Array */
package Stack;
import java.io.*;

class Array_Implementation
{
    int top = -1;                  //Top element of stack
    static final int MAX = 6;      //Maximum size of Stack
    int a[] = new int[MAX];


    /* Print Stack */
    void print()
    {
        for(int i=top; i>=0; i--)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* Function to check if stack is empty */
    boolean isEmpty()
    {
        return (top < 0);
    }


    /* PUSH */
    void push(int data)
    {
        if (top >= MAX - 1)
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
            System.out.println("Stack is Empty");
            return -999;
        }
        else
            return a[top];
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Array_Implementation s = new Array_Implementation();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the stack
        for(int i=0; i<MAX; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            s.push(d);
        }

        //Printing original stack
        System.out.println("*** Original Stack ***");
        s.print();

        //Performing operations
        System.out.println("\n\nTop element : " + s.peek());
        System.out.println("Removing " +s.peek()+ " from stack..");
        s.pop();
        System.out.println("Top element : " + s.peek());
        System.out.println("Removing " +s.peek()+ " from stack..");
        s.pop();

        //Printing new stack
        System.out.println("\n*** New Stack ***");
        s.print();
    }
}