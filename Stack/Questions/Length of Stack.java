package Questions;
import java.io.*;

class StackLength
{
    static int top = -1;
    static final int MAX = 6;
    int a[] = new int[MAX];


    /* Print Stack */
    void printStk()
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


    public static void main(String args[]) throws IOException
    {
        StackLength s = new StackLength();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<MAX; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            s.push(d);
        }

        System.out.println("Created Stack :");
        s.printStk();
        System.out.println("\nLength of stack is : " + lengthOfStack());
    }
}