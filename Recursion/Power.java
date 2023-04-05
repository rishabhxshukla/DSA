package Recursion;
import java.io.*;

class Power
{
    static int power(int n, int p)
    {
        if (p == 0)
            return 1;
        else
            return (n * power(n, p-1));
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        System.out.print("Enter the number (n) : ");
        int n = Integer.parseInt(b.readLine());
        System.out.print("Enter the power (^p) : ");
        int p = Integer.parseInt(b.readLine());

        System.out.println("Power : " + power(n, p));
    }
}