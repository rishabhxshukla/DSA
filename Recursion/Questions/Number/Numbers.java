// Program to print the first N natural numbers

package Recursion.Questions.Number;
import java.io.*;

class Numbers
{
    /* Function to print the natural numbers */
    static void numbers(int N)
    {
        if (N == 0) {
            return;
        }

        numbers(N - 1);
        System.out.println(N);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the natural numbers
        numbers(n);
    }
}