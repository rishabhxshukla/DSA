/*
Sort a stack.
STEPS :
1) We create a temporary stack. Now we run a loop while the input stack is not empty.
2) At each iteration, we pop an element from the input stack and compare it with the element
   present on top of the tempStack.
3) If tempStack is not empty and the top element of input stack > top element of the tempStack,
   we pop the top element from the tempStack and push it into the input stack.
   Otherwise, if the element is smaller, we push it into the tempStack.
4) The input stack will be empty by the end of the outer loop, and the sorted elements are present in
   the temporary stack. So we return the tempStack as an output.
*/

package Stack.Questions;
import java.io.*;

class Sort
{
    int top = -1;
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


    /* Function to sort a given stack */
    void sort(Sort s, Sort t)
    {
        while (!s.isEmpty())
        {
            //Top of original stack
            int stkTop = s.pop();

            while (!t.isEmpty() && stkTop > t.peek())
            {
                //Popping element from tempStack and pushing into input stack
                s.push(t.pop());
            }

            //Otherwise, if element is smaller, we push it into the tempStack
            t.push(stkTop);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating objects of the class
        Sort stack = new Sort();
        Sort tempStack = new Sort();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the stack
        for (int i=0; i<MAX; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            stack.push(d);
        }

        //Printing original stack
        System.out.println("*** Original Stack ***");
        stack.print();

        //Sorting the stack
        System.out.println("\nSorting the Stack...");
        stack.sort(stack, tempStack);

        //Printing new stack
        System.out.println("*** New Stack ***");
        tempStack.print();
    }
}