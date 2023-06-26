// Program to count numbers from 1 to n

package Recursion.Questions.Number;
import java.io.*;

class Counting
{
    /* Function to count numbers */
    void counting(int n)
    {
        if (n == 0) {
            return;
        }

        counting(n-1);
        System.out.print(n + " ");
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Counting obj = new Counting();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the counting
        System.out.print("Counting : ");
        obj.counting(n);
    }
}