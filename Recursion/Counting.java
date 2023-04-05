package Recursion;
import java.io.*;

class Counting
{
    void counting(int n)
    {
        if (n == 0)
            return;

        counting(n-1);
        System.out.print(n + " ");
    }


    public static void main(String args[]) throws IOException
    {
        Counting obj = new Counting();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        System.out.print("Counting : ");
        obj.counting(n);
    }
}