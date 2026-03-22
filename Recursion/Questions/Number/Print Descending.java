// Program to print all the numbers from N to 1
// O(N)

package Recursion.Questions.Number;
import java.io.*;

class PrintDescending
{
    static void print(int n)
    {
        //Base case
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        print(n - 1);
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