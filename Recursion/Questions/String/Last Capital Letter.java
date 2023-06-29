// Program to find the last capital letter in a string

package Recursion.Questions.String;
import java.io.*;

class LastCapitalLetter
{
    /* Function to find the last capital letter */
    static char ans;
    static char lastCapital(String str, int i)
    {
        //Break condition :
        if (i == str.length()) {
            return ans;
        }

        //Extracting each character
        char ch = str.charAt(i);

        //If current character is upper case
        if (Character.isUpperCase(ch)) {
            ans = ch;
        }

        return lastCapital(str, i + 1);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the last capital letter
        System.out.println("Last capital letter : " + lastCapital(str, 0));
    }
}