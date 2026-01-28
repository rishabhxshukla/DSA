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
*/

package String.Questions;
import java.io.*;

class BackspaceStringCompare
{
    /* Function to perform the backspace operation */
    static String backspace(String str)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
        {
            //Extracting each character
            char ch = str.charAt(i);

            //If char is '#', perform backspace operation
            if (ch == '#') {
                //Only delete if there's something to delete
                if (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            //Otherwise keep adding the letters in answer string
            else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the 1st string : ");
        String str1 = b.readLine();
        System.out.print("Enter the 2nd string : ");
        String str2 = b.readLine();

        //Performing backspace operation
        String res1 = backspace(str1);
        String res2 = backspace(str2);

        //Checking if strings are equal after performing backspace operations
        System.out.print("Result : " + res1.equals(res2));
    }
}