/*
Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four if there exists an integer x such that n == 4^x.

RECURSIVE STEP :
Keep dividing by 4 until you hit 1 or fail.
16 → 4 → 1 → true
8 → 2 → not divisible by 4 → false

Example 1 :
Input: n = 16
Output: true

Example 2 :
Input: n = 5
Output: false

Example 3 :
Input: n = 1
Output: true
*/
// TC: O(log₄ N), SC: O(log₄ N)

package Recursion.Questions.Number;
import java.io.*;

class PowerOfFour
{
    static boolean isPowerOfFour(int n)
    {
        //Base case
        if (n == 1) {
            return true;
        }

        /*
         Invalid cases:
         n <= 0 cannot be a power of four
         If n is not divisible by 4, it cannot be a power of four
        */
        if (n <= 0 || n % 4 != 0) {
            return false;
        }

        return isPowerOfFour(n / 4);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("isPowerOfFour : " + isPowerOfFour(n));
    }
}