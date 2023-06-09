package Recursion;
import java.io.*;

class StringReverse
{
    static String newstr = "";
    static String reverse(String str)
    {
        //Calculates last index of the string each time
        int last = str.length() - 1;

        if (last == 0)
            newstr =  newstr + str;
        else
        {
            //Storing the last character
            char ch = str.charAt(last);
            newstr = newstr + ch;
            //Sending back string after removing the last character
            reverse(str.substring(0, last));
        }

        return newstr;
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        System.out.print("Enter the string : ");
        String str = b.readLine();

        System.out.print("Reversed string : " + reverse(str));
    }
}