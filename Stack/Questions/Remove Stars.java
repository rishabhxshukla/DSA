/*
You are given a string str, which contains stars *.
In one operation, you can :
Choose a star in str.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

STEPS :
1) Scan each character.
2) If it's a letter, push it in the stack.
3) If it's '#', remove last letter from the stack and perform backspace.
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class RemoveStars
{
    /* Function to remove the stars from the string */
    static String removeStars(String str)
    {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++)
        {
            //Extracting each character
            char ch = str.charAt(i);

            //If char is a letter, push it in stack
            if (Character.isLetter(ch))
            {
                s.push(ch);
            }
            //If char is '*', perform backspace operation
            else if (ch == '*' && !s.isEmpty())
            {
                s.pop();
            }
        }

        //Building the result string present in stack
        StringBuilder ans = new StringBuilder();
        while (!s.isEmpty())
        {
            ans.append(s.pop());
        }

        //Reverse ans because stack reverses order
        return ans.reverse().toString();
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Removing the stars from the string
        String ans = removeStars(str);

        //Printing the result
        System.out.print("Result : " + ans);
    }
}