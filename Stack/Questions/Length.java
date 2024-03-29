// Find the length of a stack

package Stack.Questions;
import java.io.*;

class Length
{
    static int top = -1;
    static final int MAX = 5;
    int a[] = new int[MAX];


    /* Print Stack */
    void print()
    {
        for (int i=top; i>=0; i--)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* PUSH */
    void push(int data)
    {
        if (top > MAX - 1)
            System.out.println("Stack Overflow!");
        else
            a[++top] = data;
    }


    /* Function to find length of stack */
    static int length()
    {
        int count = 0;

        for (int i=top; i>=0; i--)
        {
            count++;
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Length s = new Length();
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
        System.out.println("Created Stack :");
        s.print();

        //Printing the length of stack
        System.out.println("\nLength of stack is : " + length());
    }
}