/*
Opening parenthesis => Push in stack
Closing parenthesis => Compare with top of the stack
If pair matches, pop out the opening parenthesis from the stack.
Parenthesis are balanced if stack is empty otherwise not.

NOTE : The order of opening and closing parenthesis should be same.
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class ParenthesisMatching
{
    static Stack<Character> s = new Stack<>();


    /* Function to check for balanced parenthesis */
    static boolean isBalanced(String str)
    {
        s.clear();

        for (int i = 0; i < str.length(); i++)
        {
            //Extracting each character
            char ch = str.charAt(i);

            //If opening bracket, push it into stack
            if (ch == '[' || ch == '{' || ch == '(')
            {
                s.push(ch);
            }

            //If closing bracket, compare with stack top and pop it
            else if (ch == ')' || ch == '}' || ch == ']')
            {
                //If stack is empty before match => unbalanced
                if (s.isEmpty())
                    return false;

                char top = s.peek();

                //Mismatched pair
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '['))
                    return false;

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