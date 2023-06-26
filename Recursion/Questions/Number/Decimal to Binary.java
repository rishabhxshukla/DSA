// Program to convert decimal number into its binary equivalent

package Recursion.Questions;
import java.io.*;

class Decimal_to_Binary
{
    /* Function to find the binary number */
    static String ans = "";
    static String convert(int num)
    {
        if (num == 0) {
            return ans;
        }

        //Finding the remainder
        int rem = num % 2;
        //Adding string afterwards since we traverse up for our answer
        ans = rem + ans;

        return convert(num / 2);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the binary form
        System.out.println("Binary form : " + convert(n));
    }
}