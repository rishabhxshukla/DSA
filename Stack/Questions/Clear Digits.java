/*
You are given a string. Your task is to remove all the digits by doing this operation repeatedly :
    - Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all the digits.
Note that the operation cannot be performed on a digit that does not have any non-digit character to its left.

Example :
Input: str = "a1bc23d4ee5f"
Output: "ef"

STEPS :
1) Scan each character.
2) If it's a letter, push it in the stack.
3) If it's a digit, remove it and the closest letter to its left present in stack.
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class ClearDigits
{
    static Stack<Character> s = new Stack<>();


    /* Function to clear the digits according to the given rules */
    void clearDigits(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            //Extracting each character
            char ch = str.charAt(i);

            //If char is letter push it in stack
            if (Character.isLetter(ch))
            {
                s.push(ch);
            }
            //If char is digit and stack has a letter, remove both
            else if (Character.isDigit(ch) && !s.isEmpty())
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

        System.out.println(ans);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ClearDigits obj = new ClearDigits();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the user input
        System.out.println("Original string : " + str);

        //Clearing the digits
        System.out.print("String after clearing the digits : ");
        obj.clearDigits(str);
    }
}