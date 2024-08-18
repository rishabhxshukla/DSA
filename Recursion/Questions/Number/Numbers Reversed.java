// Program to print the first N natural numbers in reverse order

package Recursion.Questions.Number;
import java.io.*;

class NumbersReversed
{
    /* Function to print the reversed natural numbers */
    static void numbers(int N)
    {
        if (N == 0) {
            return;
        }

        System.out.println(N);
        numbers(N - 1);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the reversed natural numbers
        numbers(n);
    }
}