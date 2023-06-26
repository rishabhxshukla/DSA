// Program to reverse a number

package Recursion.Questions.Number;
import java.io.*;

class NumberReverse
{
    /* Function to reverse a number */
    static int sum = 0;
    static int reverse(int num)
    {
        if (num == 0) {
            return sum;
        }

        //Storing the reverse of num
        int r = num % 10;
        sum = (sum * 10) + r;

        return reverse(num / 10);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int num = Integer.parseInt(b.readLine());

        //Printing the reversed number
        System.out.print("Reversed number : " + reverse(num));
    }
}