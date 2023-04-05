package Recursion;
import java.io.*;

class Fibonacci
{
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

        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        System.out.println("Fibonacci : " + fibonacci(n));
    }
}