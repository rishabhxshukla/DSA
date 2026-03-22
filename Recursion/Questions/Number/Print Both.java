// Program to print all the numbers from N -> 1 and 1 -> N
// Demonstrates pre-recursive (descending) and post-recursive (ascending) work
// O(N)

package Recursion.Questions.Number;
import java.io.*;

class PrintBoth
{
    static void print(int n)
    {
        //Base case
        if (n == 0) {
            return;
        }

        //Pre-recursion :
        //Executes while recursion is going down the call stack
        System.out.println("Hello " + n);

        print(n - 1);

        //Post-recursion :
        //Executes while functions are being removed from call stack
        System.out.println("Bye " + n);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        print(n);
    }
}