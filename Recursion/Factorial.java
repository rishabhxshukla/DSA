// Program to find the factorial of n

package Recursion;
import java.io.*;

class Factorial
{
    /* Function to find the factorial */
    static int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n-1));
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the factorial
        System.out.println("Factorial : " + factorial(n));
    }
}