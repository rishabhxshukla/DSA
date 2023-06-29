// Program to find the first capital letter in a string

package Recursion.Questions.String;
import java.io.*;

class FirstCapitalLetter
{
    /* Function to find the first capital letter */
    static char firstCapital(String str, int i)
    {
        //Break condition :
        if (i == str.length()) {
            System.out.println("No capital letter found!");
            System.exit(0);
        }

        //Extracting each character
        char ch = str.charAt(i);

        //If current character is upper case
        if (Character.isUpperCase(ch)) {
            return ch;
        }

        return firstCapital(str, i + 1);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the first capital letter
        System.out.println("First capital letter : " + firstCapital(str, 0));
    }
}