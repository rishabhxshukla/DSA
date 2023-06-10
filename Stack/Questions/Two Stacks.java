/*
A simple way to implement two stacks is to divide the array in two halves, i.e., use arr[0] to arr[n/2]
for stack1, and arr[(n/2) + 1] to arr[n-1] for stack2
where arr[] is the array of size n which is to be used to implement the two stacks.

The problem with this method is inefficient use of array space. A stack push operation may result in
stack overflow even if there is space available in arr[]. For example, say the array size is 6 and we
push 3 elements to stack1 and do not push anything to second stack2. When we push 4th element to stack1,
there will be overflow even if we have space for 3 more elements in array.
*/

package Stack.Questions;
import java.io.*;

class TwoStacks
{
    static final int MAX = 6;
    int a[] = new int[MAX];
    int top1 = -1;
    int top2 = MAX;


    /* Print Stack */
    void printStk()
    {
        for (int i=0; i<MAX; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* PUSH */
    /* Into stack 1 */
    void push1(int data)
    {
        if (top1 > top2 - 1)
            System.out.println("Stack Overflow!");
        else
            a[++top1] = data;
    }
    /* Into stack 2 */
    void push2(int data)
    {
        if (top1 > top2 - 1)
            System.out.println("Stack Overflow!");
        else
            a[--top2] = data;
    }


    /* POP */
    /* From stack 1 */
    int pop1()
    {
        if (top1 < 0) {
            System.out.println("Stack Underflow!");
            return -999;
        }
        else
            return a[top1--];
    }
    /* From stack 2 */
    int pop2()
    {
        if (top2 > MAX) {
            System.out.println("Stack Underflow!");
            return -999;
        }
        else
            return a[top2++];
    }


    /* PEEK */
    /* Into stack 1 */
    int peek1()
    {
        if (top1 < 0) {
            System.out.println("Stack is Empty!");
            return -999;
        }
        return a[top1];
    }
    /* Into stack 2 */
    int peek2()
    {
        if (top2 > MAX) {
            System.out.println("Stack is Empty!");
            return -999;
        }
        return a[top2];
    }


    public static void main(String args[]) throws IOException
    {
        TwoStacks s = new TwoStacks();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Inserting data into the stacks
        System.out.println("In which stack do you want to insert the data?");
        for (int i=0; i<MAX; i++)
        {
            System.out.print("Enter 1 for Stack1, 2 for Stack2 : ");
            int choice = Integer.parseInt(b.readLine());
            switch (choice)
            {
                case 1:
                    System.out.print("Enter the data : ");
                    int d1 = Integer.parseInt(b.readLine());
                    s.push1(d1);
                    break;

                case 2:
                    System.out.print("Enter the data : ");
                    int d2 = Integer.parseInt(b.readLine());
                    s.push2(d2);
                    break;

                default:
                    System.out.println("INVALID ENTRY!!");
                    System.exit(0);
            }
        }

        //Printing original stack
        System.out.println("\nCreated Stack :");
        s.printStk();

        //Peeking elements
        System.out.println("\n\nTop element of stack 1 is : " + s.peek1());
        System.out.println("Top element of stack 2 is : " + s.peek2());

        //Popping elements
        System.out.println("\nPopped element from stack 1 : " + s.pop1());
        System.out.println("Popped element from stack 2 : " + s.pop2());
    }
}