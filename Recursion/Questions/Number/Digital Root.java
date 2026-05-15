/*
Given an integer n, repeatedly add all its digits until the result has only one digit left.

Example :
Input: n = 38
Output: 2
Explanation:
38 : 3 + 8 = 11
11 : 1 + 1 = 2
Since 2 has only one digit, return it.
*/
// O(log N)

package Recursion.Questions.Number;
import java.io.*;

class DigitalRoot
{
    static int sumOfDigits(int n)
    {
        //Base case: Single digit left
        if (n < 10) {
            return n;
        }

        //Calculate sum of digits
        int sum = 0;
        while (n > 0)
        {
            sum = sum + n % 10;
            n = n / 10;
        }

        //Recurse on sum
        return sumOfDigits(sum);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("Digital Root : " + sumOfDigits(n));
    }
}