// Program to find the last small letter in a string

package Recursion.Questions.String;
import java.io.*;

class LastSmallLetter
{
    /* Function to find the last small letter */
    static char ans;
    static char lastSmall(String str, int i)
    {
        //Break condition :
        if (i == str.length()) {
            return ans;
        }

        //Extracting each character
        char ch = str.charAt(i);

        //If current character is lower case
        if (Character.isLowerCase(ch)) {
            ans = ch;
        }

        return lastSmall(str, i + 1);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the last small letter
        System.out.println("Last small letter : " + lastSmall(str, 0));
    }
}