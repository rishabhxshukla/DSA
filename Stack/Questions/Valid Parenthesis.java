/*
Given a string str containing only three types of characters: '(', ')' and '*', return true if str is valid.

The following rules define if a string is valid or not :
    1) Any left parenthesis '(' must have a corresponding right parenthesis ')'.
    2) Left parenthesis '(' must go before the corresponding right parenthesis ')'.
    3) '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

Example 1 :
Input: s = "()"
Output: true

Example 2 :
Input: s = "(*)"
Output: true

Example 3 :
Input: s = "(*))"
Output: true
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class ValidParenthesis
{
    static String str = "(*))";


    /* Function to check for valid parenthesis */
    static boolean isValid()
    {
        /*
          Stack → tracks unmatched '('
          starCount → tracks available '*' that can act as '(', ')', or empty
        */
        Stack<Character> s = new Stack<>();
        int starCount = 0;

        for (int i = 0; i < str.length(); i++)
        {
            //Extracting each character
            char ch = str.charAt(i);

            if (ch == '(') {
                s.push(ch);
            }
            else if (ch == '*') {
                starCount++;
            }
            else if (ch == ')')
            {
                //Use a real '(' if available
                if (!s.isEmpty()) {
                    s.pop();
                }
                //Otherwise, use a '*' pretending it was '('
                else if (starCount > 0) {
                    starCount--;
                }
                //You have nothing to make a pair
                else {
                    return false;
                }
            }
        }

        /*
          s.size() -> how many '(' are still open
          starCount -> how many '*' are still unused
          Checking if the leftover '*' are enough to close all leftover '('
        */
        return (s.size() <= starCount);
    }


    public static void main(String args[]) throws IOException
    {
        //Printing the original string
        System.out.println("Original string : " + str);

        //Printing the output
        System.out.println("Valid Parenthesis output : " + isValid());
    }
}