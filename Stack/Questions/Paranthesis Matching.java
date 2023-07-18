/*
Opening parenthesis => Push in stack
Closing parenthesis => Compare with top of the stack
If pair matches, pop out the opening parenthesis from the stack.
Parenthesis are balanced if stack is empty otherwise not.

NOTE : The order of opening and closing parenthesis should be same.
*/

package Stack.Questions;
import java.io.*;

class ParenthesisMatching
{
    int top = -1;
    static final int MAX = 100;
    char a[] = new char[MAX];


    /* isEmpty */
    boolean isEmpty()
    {
        return (top < 0);
    }


    /* PUSH */
    void push(char data)
    {
        if (top > MAX - 1)
            System.out.println("Stack Overflow!");
        else
            a[++top] = data;
    }


    /* POP */
    char pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow!");
            return 'X';
        }
        else
            return a[top--];
    }


    /* PEEK */
    char peek()
    {
        if (top < 0) {
            System.out.println("Stack is Empty!");
            return 'X';
        }
        else
            return a[top];
    }


    /* Function to check for balanced parenthesis */
    static boolean isBalanced(String str)
    {
        ParenthesisMatching s = new ParenthesisMatching();

        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            //If opening bracket, push it into stack
            if (ch == '[' || ch == '{' | ch == '(')
            {
                s.push(ch);
            }

            //If closing bracket, compare with stack top and pop it
            else if ((ch==']' && s.peek()=='[') ||
                     (ch=='}' && s.peek()=='{') ||
                     (ch==')' && s.peek()=='('))
                    {
                        s.pop();
                    }
        }

        //Finally, if stack is empty then parenthesis are balanced
        return (s.isEmpty());
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string with input parenthesis : ");
        String str = b.readLine();

        //Printing the output
        System.out.println("Balanced Parenthesis output : " + isBalanced(str));
    }
}