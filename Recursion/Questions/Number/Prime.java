// Program to check if a number is prime or not
// NOTE : Count-based approach is not efficient for large numbers.

package Recursion.Questions.Number;
import java.io.*;

class Prime
{
    /* Function to check for prime number */
    static boolean isPrime(int n)
    {
        int count = 0;

        //If number <= 1
        if (n <= 1) {
            return false;
        }

        //Counting the factors
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0) {
                count++;
            }
        }

        //If count is 2 then no. is prime
        return (count == 2);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("isPrime : " + isPrime(n));
    }
}