/*
Program to check if a number is Emirp number or not
An Emirp Number (prime spelled backwards) is a number which is prime forwards and backwards.
Example : 13 is a prime number, reverse of 13 is 31 which is also a prime number.
Thus, 13 is an Emirp number.
NOTE : Count-based approach is not efficient for large numbers.
*/

package Recursion.Questions;
import java.io.*;

class Emirp
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


    /* Function to check for emirp number */
    static boolean isEmirp(int n)
    {
        //If no. is not prime then no need to check further
        if (!isPrime(n)) {
            return false;
        }

        //Reversing the number
        int r = 0, S = 0;
        while (n != 0)
        {
            r = n % 10;
            S = (S * 10) + r;
            n = n / 10;
        }

        //If reversed number is also prime then it is Emirp
        return isPrime(S);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("isEmirp : " + isEmirp(n));
    }
}