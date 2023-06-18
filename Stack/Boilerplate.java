// ...

package Stack.Questions;
import java.io.*;

class Boilerplate
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


    /* Function to ... */
    //


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Boilerplate s = new Boilerplate();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the stack
        for (int i=0; i<MAX; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            s.push(d);
        }

        //Printing the stack
        System.out.println("*** Created Stack ***");
        s.printStk();
    }
}