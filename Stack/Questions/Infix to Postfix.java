package Stack.Questions;
import java.io.*;

class InfixToPostfix
{
    static int top = -1;
    static final int MAX = 6;
    char a[] = new char[MAX];


    /* Print Stack */
    void printStk()
    {
        for (int i=top; i>=0; i--)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* isEmpty() */
    static boolean isEmpty()
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
            return '$';
        }
        else
            return a[top--];
    }


    /* PEEK */
    char peek()
    {
        if (top < 0) {
            System.out.println("Stack is Empty!");
            return '$';
        }
        else
            return a[top];
    }


    /* Utility Functions */
    /*--------------------------------------------------------*/
    static boolean isOperand(char ch)
    {
        return ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>=1 && ch<=9));
    }
    static boolean isOpening(char ch)
    {
        return (ch=='(');
    }
    static boolean isClosing(char ch)
    {
        return (ch==')');
    }
    static int Precedence(char ch)
    {
        if (ch == '^')
            return 3;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch=='-')
            return 1;
        else
            return 0;
    }
    /*--------------------------------------------------------*/


    /* Function to convert Infix to Postfix */
    static String Convert(String str)
    {
        InfixToPostfix s = new InfixToPostfix();
        String ans = "";

        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            //If the scanned character is an operand, add it to output
            if (isOperand(ch))
                ans = ans + ch;

            //If the scanned character is '(', push it to the stack
            else if (isOpening(ch))
                s.push(ch);

            //If the scanned character is an ')', pop from stack until '(' is encountered
            else if (isClosing(ch))
            {
                while (!isEmpty() && s.peek() != '(')
                {
                    ans = ans + s.peek();
                    s.pop();
                }
                s.pop();  //For popping out '('
            }

            //When any operator is encountered, check precedence
            else
            {
                while (!isEmpty() && Precedence(s.peek()) >= Precedence(ch))
                {
                    ans = ans + s.peek();
                    s.pop();
                }
                s.push(ch);
            }
        }

        //Pop all the operators from the stack
        while (!isEmpty())
        {
            if (s.peek() == '(')
                return "Invalid Expression";

            ans = ans + s.peek();
            s.pop();
        }
        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InfixToPostfix s = new InfixToPostfix();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the Infix expression : ");
        String str = b.readLine();

        //Printing the postfix expression
        System.out.println("Postfix expression = " + Convert(str));
    }
}