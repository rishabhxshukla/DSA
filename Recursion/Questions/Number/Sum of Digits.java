// Program to find the sum of digits of a number
// O(N)

package Recursion.Questions.Number;
import java.io.*;

class SumOfDigits
{
    static int sum(int num)
    {
        //Base case: No digits left
        if (num == 0) {
            return 0;
        }

        //Last digit + sum of remaining digits
        return (num % 10) + sum(num / 10);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int num = Integer.parseInt(b.readLine());

        //Printing the sum
        System.out.println("Sum of digits : " + sum(num));
    }
}