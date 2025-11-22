/*
Given a string of lower and upper case English letters.
A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where :
    - s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
To make the string good, you can choose two adjacent characters that make the string bad and remove them.
You can keep doing this until the string becomes good.
Return the string after making it good.

Example 1 :
Input: s = "leEeetcode"
Output: "leetcode"
Explanation: "leEeetcode" -> "leetcode"

Example 2 :
Input: s = "abBAcC"
Output: ""
Explanation: "abBAcC" -> "aAcC" -> "cC" -> ""
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class MakeStringGreat
{
    static Stack<Character> s = new Stack<>();


    /* Function to make the string great */
    static String makeStringGreat(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            //Extracting each character
            char ch = str.charAt(i);

            //Remove if current char and top of stack are the same letters but in opposite cases
            if (!s.isEmpty() &&
                    Character.toLowerCase(ch) == Character.toLowerCase(s.peek()) &&
                    ch != s.peek())
            {
                s.pop();
            }
            //Otherwise, push the current char into the stack
            else
            {
                s.push(ch);
            }
        }

        //Building the result string present in stack
        String ans = "";
        while (!s.isEmpty())
        {
            ans = s.pop() + ans;    //Prepend because stack reverses order
        }

        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Result after making the string great
        System.out.print("Result after making the string great : " + makeStringGreat(str));
    }
}