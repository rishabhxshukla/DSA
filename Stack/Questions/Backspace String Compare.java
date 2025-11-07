/*
Given two strings s and t, return true if they are equal after performing backspace operation.
'#' means a backspace character.
Both the strings only contain lowercase letters and '#' characters.
Note that after backspacing an empty text, the text will continue to be empty.

Example 1 :
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2 :
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

STEPS :
1) Scan each character.
2) If it's a letter, push it in the stack.
3) If it's '#', remove last letter from the stack and perform backspace.
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class BackspaceStringCompare
{
    static Stack<Character> s = new Stack<>();


    /* Function to perform backspace operation */
    static String backspace(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            //Extracting each character
            char ch = str.charAt(i);

            //If char is a letter, push it in stack
            if (Character.isLetter(ch))
            {
                s.push(ch);
            }
            //If char is '#', perform backspace operation
            else if (ch == '#' && !s.isEmpty())
            {
                s.pop();
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
        System.out.print("Enter the 1st string : ");
        String str1 = b.readLine();
        System.out.print("Enter the 2nd string : ");
        String str2 = b.readLine();

        //Printing the user input
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);

        //Performing backspace operations
        String res1 = backspace(str1);
        String res2 = backspace(str2);

        //Checking if strings are equal after performing backspace operations
        System.out.print("Result : " + res1.equals(res2));
    }
}