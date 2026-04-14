/*
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2^x.

RECURSIVE STEP :
Keep dividing by 2 until you hit 1 or fail.
16 → 8 → 4 → 2 → 1 → true
3 → odd → false

Example 1 :
Input: n = 1
Output: true
Explanation: 2^0 = 1

Example 2 :
Input: n = 16
Output: true
Explanation: 2^4 = 16

Example 3 :
Input: n = 3
Output: false
*/
// TC: O(log₂ N), SC: O(log₂ N)

package Recursion.Questions.Number;
import java.io.*;

class PowerOfTwo
{
    static boolean isPowerOfTwo(int n)
    {
        //Base case
        if (n == 1) {
            return true;
        }

        /*
         Invalid cases:
         n <= 0 cannot be a power of two
         Odd numbers (except 1) cannot be powers of two
        */
        if (n <= 0 || n % 2 != 0) {
            return false;
        }

        return isPowerOfTwo(n / 2);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("isPowerOfTwo : " + isPowerOfTwo(n));
    }
}