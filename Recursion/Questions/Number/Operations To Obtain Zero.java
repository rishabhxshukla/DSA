/*
Count Operations to Obtain Zero
You are given two non-negative integers num1 and num2.
In one operation, if num1 >= num2, you must subtract num2 from num1,
otherwise subtract num1 from num2.
Return the number of operations required to make either num1 = 0 or num2 = 0.

Example :
Input: num1 = 2, num2 = 3
Output: 3
Explanation:
1) num1 = 2, num2 = 3. Since num1 < num2, we subtract num1 from num2 and get num1 = 2, num2 = 3 - 2 = 1.
2) num1 = 2, num2 = 1. Since num1 > num2, we subtract num2 from num1.
3) num1 = 1, num2 = 1. Since num1 == num2, we subtract num2 from num1.
Now num1 = 0 and num2 = 1. Since num1 == 0, we do not need to perform any further operations.
*/
// O(log N)

package Recursion.Questions.Number;
import java.io.*;

class OperationsToObtainZero
{
    static int operations(int num1, int num2)
    {
        //Base case: Stop when any number becomes 0
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        //Count current step + remaining steps
        if (num1 >= num2) {
            return 1 + operations(num1 - num2, num2);
        }
        else {
            return 1 + operations(num1, num2 - num1);
        }
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the 1st number : ");
        int num1 = Integer.parseInt(b.readLine());
        System.out.print("Enter the 2nd number : ");
        int num2 = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.print("Number of operations : " + operations(num1, num2));
    }
}