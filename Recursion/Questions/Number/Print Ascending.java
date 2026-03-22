// Program to print all the numbers from 1 to N
// O(N)

package Recursion.Questions.Number;
import java.io.*;

class PrintAscending
{
    static void print(int n)
    {
        //Base case
        if (n == 0) {
            return;
        }

        print(n - 1);
        System.out.print(n + " ");
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.print("Numbers : ");
        print(n);
    }
}