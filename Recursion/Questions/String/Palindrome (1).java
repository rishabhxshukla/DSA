// Program to check whether a string is palindrome or not
// O(N)², because of substring() & string concatenation (+ch), use 2 pointers for O(N)

package Recursion.Questions.String;
import java.io.*;

class Palindrome1
{
    static String reverse(String str)
    {
        //Base case
        if (str.length() == 0) {
            return "";
        }

        //Extract 1st character of each string
        char ch = str.charAt(0);

        //Recurse for remaining string + add extracted char at the last
        return reverse(str.substring(1)) + ch;
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the result
        if (str.equals(reverse(str))) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}