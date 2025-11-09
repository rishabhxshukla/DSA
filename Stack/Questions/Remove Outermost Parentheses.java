/*
A valid parentheses string can be a string like "", "()", "(())()", and "(()(()))".
You are given a valid parentheses string s, return s after removing the outermost parentheses of each part in it.

Example 1 :
Input: s = "(()())(())"
Output: "()()()"
Explanation: After removing the outer parentheses of each part, s becomes "()()()".

Example 2 :
Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation: After removing the outer parentheses of each part, s becomes "()()()()(())".
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class RemoveOutermostParentheses
{
    static Stack<Character> s = new Stack<>();


    /* Function to remove the outermost parenthesis */
    static String remove(String str)
    {
        String ans = "";

        for (int i = 0; i < str.length(); i++)
        {
            //Extracting each character
            char ch = str.charAt(i);

            if (ch == '(')
            {
                //If stack is not empty, it's not outermost, so include it
                if (!s.isEmpty()) {
                    ans += ch;
                }

                s.push(ch);
            }
            else if (ch == ')')
            {
                s.pop();

                //After popping, if stack is not empty, it's not outermost, include it
                if (!s.isEmpty()) {
                    ans += ch;
                }
            }
        }

        return ans;
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
        System.out.println("Result string : " + remove(str));
    }
}