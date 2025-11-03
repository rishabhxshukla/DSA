/*
Convert infix to postfix expression

Example :
Infix: A+B*C
Postfix: ABC*+
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class InfixToPostfix
{
    static Stack<Character> s = new Stack<>();


    /* Utility Functions */
    static boolean isOperand(char ch)
    {
        return ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>=0 && ch<=9));
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


    /* Function to convert Infix to Postfix */
    static String convert(String str)
    {
        String ans = "";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            //If the scanned character is an operand, add it to output
            if (isOperand(ch)) {
                ans = ans + ch;
            }

            //If the scanned character is '(', push it to the stack
            else if (isOpening(ch)) {
                s.push(ch);
            }

            //If the scanned character is an ')', pop from stack until '(' is encountered
            else if (isClosing(ch))
            {
                while (!s.isEmpty() && s.peek() != '(')
                {
                    ans = ans + s.peek();
                    s.pop();
                }
                s.pop();  //For popping out '('
            }

            //When any operator is encountered, check precedence
            else
            {
                while (!s.isEmpty() && Precedence(s.peek()) >= Precedence(ch))
                {
                    ans = ans + s.peek();
                    s.pop();
                }
                s.push(ch);
            }
        }

        //Pop all the operators from the stack
        while (!s.isEmpty())
        {
            if (s.peek() == '(') {
                return "Invalid Expression";
            }

            ans = ans + s.peek();
            s.pop();
        }

        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the Infix expression : ");
        String str = b.readLine();

        //Printing the postfix expression
        System.out.println("Postfix expression : " + convert(str));
    }
}