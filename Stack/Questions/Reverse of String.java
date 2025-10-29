// Find the reverse of a given string

package Stack.Questions;
import java.io.*;
import java.util.*;

class StringReverse
{
    static Stack<Character> s = new Stack<>();


    /* Function to reverse a string */
    static String reverse(String str)
    {
        String newstr = "";

        //Pushing characters into the stack
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            s.push(ch);
        }

        //Popping character from the stack
        while (!s.isEmpty())
        {
            newstr = newstr + s.pop();
        }

        return newstr;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the reversed string
        System.out.print("Reverse of the string : " + reverse(str));
    }
}