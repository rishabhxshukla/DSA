// Program to copy one string to another

package Recursion.Questions;
import java.io.*;

class CopyString
{
    /* Function to find the copy the string */
    static String newstr = "";
    static String copy(String str, int i)
    {
        if (i == str.length()) {
            return newstr;
        }

        newstr = newstr + str.charAt(i);

        return copy(str, i + 1);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the new string
        System.out.println("Copied string : " + copy(str, 0));
    }
}