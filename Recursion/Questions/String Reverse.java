// Program to reverse a string

package Recursion.Questions;
import java.io.*;

class StringReverse
{
    //Variable to store the reversed string
    static String newstr = "";

    /* Function to reverse a string */
    static String reverse(String str)
    {
        //Calculates last index of the string each time
        int last = str.length() - 1;

        if (last == 0)
            newstr =  newstr + str;
        else
        {
            //Adding last character to newstr
            newstr = newstr + str.charAt(last);
            //Sending back string after removing the last character
            reverse(str.substring(0, last));
        }

        return newstr;
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the reversed string
        System.out.print("Reversed string : " + reverse(str));
    }
}