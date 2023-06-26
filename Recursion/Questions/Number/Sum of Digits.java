// Program to find the sum of digits of a number

package Recursion.Questions.Number;
import java.io.*;

class Sum_of_Digits
{
    /* Function to find the sum */
    static int sum = 0;
    static int sum(int num)
    {
        if (num == 0) {
            return sum;
        }

        //Adding last digit to sum
        sum = sum + num % 10;

        return sum(num / 10);
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