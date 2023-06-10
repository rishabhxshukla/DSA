package Stack.Questions;
import java.io.*;

class NumberReverse
{
    int top = -1;
    static final int MAX = 6;
    int a[] = new int[MAX];


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


    /* Function to reverse a number */
    void reverse(int num)
    {
        NumberReverse s = new NumberReverse();
        int rem, S = 0;

        //Pushing the digits into the stack
        for (int i=num; i>0; i=i/10)
        {
            rem = i % 10;
            s.push(rem);
        }

        //Popping the digits from the stack
        int i = 1;
        while (!s.isEmpty())
        {
            S = S + (s.peek() * i);
            i = i* 10;
            s.pop();
        }
        //Printing the reversed number
        System.out.print(S);
    }


    public static void main(String args[]) throws IOException
    {
        NumberReverse s = new NumberReverse();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        System.out.print("Enter the number : ");
        int num = Integer.parseInt(b.readLine());

        System.out.print("Reverse of the number = ");
        s.reverse(num);
    }
}