/*
Given an integer n and an integer k, return true if n is a power of k.
An integer n is a power of k if there exists an integer x such that n == k^x.

ITERATIVE IDEA :
Keep dividing n by k until it is no longer divisible.
If we reach 1 → valid power of k.
*/
// TC: O(logₖ N), SC: O(1)

package Recursion.Questions.Number;
import java.io.*;

class PowerOfK2
{
    static boolean isPowerOfK(int n, int k)
    {
        //Invalid inputs
        if (n <= 0 || k <= 1) {
            return false;
        }

        //Keep dividing until it no longer divides
        while (n % k == 0)
        {
            n = n / k;
        }

        //If we reached 1, it's a power of k
        return n == 1;
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("isPowerOfK : " + isPowerOfK(n, 2));
    }
}