// Program to reverse a string
// O(N), because of 2 pointers

package Recursion.Questions.String;
import java.io.*;

class Reverse2
{
    static String reverse(StringBuilder sb, int i, int j)
    {
        //Base case: Pointers crossed
        if (i >= j) {
            return sb.toString();
        }

        //Swap characters
        char front = sb.charAt(i);
        char back  = sb.charAt(j);
        sb.setCharAt(i, back);
        sb.setCharAt(j, front);

        //Recursive call for remaining characters
        return reverse(sb, i + 1, j - 1);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the result
        System.out.print("Reversed string : " + reverse(new StringBuilder(str), 0, str.length() - 1));
    }
}