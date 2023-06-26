// Program to check whether a string is palindrome or not
// 2 POINTERS

package Recursion.Questions.String;
import java.io.*;

class Palindrome
{
    /* Function to check for a palindrome string */
    static boolean palindrome(String str, int i, int j)
    {
        if (i >= j) {
            return true;
        }

        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }

        return palindrome(str, i+1, j-1);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the result
        System.out.println("Palindrome : " + palindrome(str, 0, str.length()-1));
    }
}