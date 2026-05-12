/*
Program to print each digit of a number in words using recursion

Example :
Input: 123
Output : one two three
*/
// O(N)

package Recursion.Questions.Array;
import java.io.*;

class SayDigits
{
    //Mapping digits to their word representation
    static String words[] = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };


    static void say(int n)
    {
        //Base case
        if (n == 0) {
            return;
        }

        //Recursive call for remaining digits
        say(n / 10);

        //Extract & print last digit
        int digit = n % 10;
        System.out.print(words[digit] + " ");
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the output
        System.out.print("Integer to String : ");
        say(n);
    }
}