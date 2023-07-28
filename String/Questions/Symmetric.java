/*
A string of even length, made of 2 characters "<" and ">" is called symmetric if all characters
in its first half are "<" and all characters in its second half are ">".
Examples: "" (empty string), "<>", "<<>>", "<<<>>>".
*/

package String.Questions;
import java.io.*;

class Symmetric
{
    /* Function to check if a string is symmetric */
    static boolean symmetric(String str)
    {
        int mid = str.length() / 2;

        //If '>' is found in 1st half
        for (int i=0; i<mid; i++)
        {
            if (str.charAt(i) == '>') {
                return false;
            }
        }

        //If '<' is found in 2nd half
        for (int i=mid; i<str.length(); i++)
        {
            if (str.charAt(i) == '<') {
                return false;
            }
        }

        return true;
    }


    public static void main(String args[]) throws IOException
    {
        //Input string
        String str;

        //Checking if the string is symmetric
        str = "<<>>";
        System.out.printf(str + " : " + symmetric(str) + "\n");
        str = "<<<>>>";
        System.out.printf(str + " : " + symmetric(str));
    }
}