package Recursion;
import java.io.*;

class Factorial
{
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

        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        System.out.println("Factorial : " + factorial(n));
    }
}