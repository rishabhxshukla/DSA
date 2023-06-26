// Program to find the fibonacci of n

package Recursion.Questions;
import java.io.*;

class Fibonacci
{
    /* Function to find the fibonacci */
    static int fibonacci(int n)
    {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else
            return (fibonacci(n-1) + fibonacci(n-2));
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the fibonacci
        System.out.println("Fibonacci : " + fibonacci(n));
    }
}