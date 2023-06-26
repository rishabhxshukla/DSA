// Program to check whether a number is palindrome or not

package Recursion.Questions;
import java.io.*;

class NumberPalindrome
{
    /* Function to check for a palindrome number */
    static int sum = 0;
    static int palindrome(int num)
    {
        if (num == 0) {
            return sum;
        }

        //Storing the reverse of num
        int r = num % 10;
        sum = (sum * 10) + r;

        return palindrome(num / 10);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int num = Integer.parseInt(b.readLine());

        //Printing the result
        boolean ans = num == palindrome(num);
        System.out.println("Palindrome : " + ans);
    }
}