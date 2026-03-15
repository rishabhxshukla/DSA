// Program to find the product of first N natural numbers
// O(N)

package Recursion.Questions.Number;
import java.io.*;

class Product
{
    static int prod(int n)
    {
        if (n == 0) {
            return 1;
        }

        return n * prod(n - 1);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("Product : " + prod(n));
    }
}