/*
Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three if there exists an integer x such that n == 3^x.

RECURSIVE STEP :
Keep dividing by 3 until you hit 1 or fail.
27 → 9 → 3 → 1 → true
6 → 2 → not divisible by 3 → false

Example 1 :
Input: n = 27
Output: true
Explanation: 27 = 3^3

Example 2 :
Input: n = 0
Output: false
Explanation: There is no x where 3^x = 0.

Example 3 :
Input: n = -1
Output: false
Explanation: There is no x where 3^x = (-1).
*/
// TC: O(log₃ N), SC: O(log₃ N)

package Recursion.Questions.Number;
import java.io.*;

class PowerOfThree
{
    static boolean isPowerOfThree(int n)
    {
        //Base case
        if (n == 1) {
            return true;
        }

        /*
         Invalid cases:
         n <= 0 cannot be a power of three
         If n is not divisible by 3, it cannot be a power of three
        */
        if (n <= 0 || n % 3 != 0) {
            return false;
        }

        return isPowerOfThree(n / 3);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("isPowerOfThree : " + isPowerOfThree(n));
    }
}