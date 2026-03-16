// Program to print the multiple of a number k times
// O(k)

package Recursion.Questions.Number;
import java.io.*;

class Multiples
{
    static void multiples(int n, int k)
    {
        //Base case
        if (k == 0) {
            return;
        }

        multiples(n, k - 1);
        System.out.print(n * k + " ");
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.print("Multiples : ");
        multiples(n, 5);
    }
}