/*
Faulty Keyboard
Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the
string that you have written. Typing other characters works as expected.
You are given a string s, and you type each character of s using your faulty keyboard.
Return the final string that will be present on your laptop screen.

Input: s = "string"
Output: "rtsng"
*/

package String.Questions;
import java.io.*;

class FaultyKeyboard
{
    /* Function to reverse a string */
    static String reverse(String str)
    {
        String ans = "";

        for (int i=str.length()-1; i>=0; i--)
        {
            char ch = str.charAt(i);
            ans = ans + ch;
        }

        return ans;
    }


    /* Function to return the final string */
    static String finalString(String s)
    {
        String str = "";

        for (int i=0; i<s.length(); i++)
        {
            //Extracting characters
            char ch = s.charAt(i);

            //If 'i' then reverse the string
            if (ch == 'i') {
                str = reverse(str);
            }
            //Otherwise, add normally
            else {
                str = str + ch;
            }
        }

        return str;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        FaultyKeyboard obj = new FaultyKeyboard();

        //Creating the string
        String s = "string";

        //Printing the string
        System.out.print("Created string : ");
        System.out.println(s);

        //Printing the final string
        System.out.print("Final string : ");
        System.out.println(finalString(s));
    }
}