// Program to check whether a string is palindrome or not
// O(N), because of 2 pointers

package Recursion.Questions.String;
import java.io.*;

class Palindrome2
{
    static boolean palindrome(String str, int i, int j)
    {
        //If i crosses j
        if (i >= j) {
            return true;
        }

        //If characters are not same
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }

        return palindrome(str, i + 1, j - 1);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the result
        System.out.println("Palindrome : " + palindrome(str, 0, str.length() - 1));
    }
}