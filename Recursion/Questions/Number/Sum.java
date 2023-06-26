// Program to find the sum of first n natural numbers

package Recursion.Questions;
import java.io.*;

class Sum
{
    /* Function to find the sum */
    static int sum = 0;
    static int sum(int n)
    {
        if (n == 0) {
            return sum;
        }

        sum = n + sum(n - 1);
        return sum;
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the sum
        System.out.println("Sum : " + sum(n));
    }
}