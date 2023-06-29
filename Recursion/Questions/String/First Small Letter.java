// Program to find the first small letter in a string

package Recursion.Questions.String;
import java.io.*;

class FirstSmallLetter
{
    /* Function to find the first small letter */
    static char firstSmall(String str, int i)
    {
        //Break condition :
        if (i == str.length()) {
            System.out.println("No small letter found!");
            System.exit(0);
        }

        //Extracting each character
        char ch = str.charAt(i);

        //If current character is lower case
        if (Character.isLowerCase(ch)) {
            return ch;
        }

        return firstSmall(str, i + 1);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the first small letter
        System.out.println("First small letter : " + firstSmall(str, 0));
    }
}