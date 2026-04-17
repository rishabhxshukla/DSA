/*
Given an integer n and an integer k, return true if n is a power of k.
An integer n is a power of k if there exists an integer x such that n == k^x.

RECURSIVE IDEA :
Keep dividing n by k until
  - We reach 1 → valid power of k
  - n becomes <= 0 or not divisible by k → invalid
*/
// TC: O(logₖ N), SC: O(logₖ N)

package Recursion.Questions.Number;
import java.io.*;

class PowerOfK1
{
    static boolean isPowerOfK(int n, int k)
    {
        //Invalid base: k must be greater than 1
        if (k <= 1) {
            return false;
        }

        //Base case
        if (n == 1) {
            return true;
        }

        /*
         Invalid cases:
         n <= 0 cannot be a power of k
         If n is not divisible by k, it cannot be a power of k
        */
        if (n <= 0 || n % k != 0) {
            return false;
        }

        return isPowerOfK(n / k, k);
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