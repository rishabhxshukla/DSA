/*
Number of Steps to Reduce a Number to Zero
Given an integer num, return the number of steps to reduce it to zero.
In one step if the current number is even, you have to divide it by 2,
otherwise you have to subtract 1 from it.

Example :
Input: num = 14
Output: 6
Explanation:
1) 14 is even; divide by 2 and obtain 7.
2) 7 is odd; subtract 1 and obtain 6.
3) 6 is even; divide by 2 and obtain 3.
4) 3 is odd; subtract 1 and obtain 2.
5) 2 is even; divide by 2 and obtain 1.
6) 1 is odd; subtract 1 and obtain 0.
*/
// O(log N)

package Recursion.Questions.Number;
import java.io.*;

class ReduceNumberToZero
{
    static int reduce(int num)
    {
        //Base case
        if (num == 0) {
            return 0;
        }

        //Count current step + remaining steps
        if (num % 2 == 0) {
            return 1 + reduce(num / 2);
        }
        else {
            return 1 + reduce(num - 1);
        }
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int num = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.print("Number of steps : " + reduce(num));
    }
}