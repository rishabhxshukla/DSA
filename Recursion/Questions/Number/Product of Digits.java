// Program to find the product of digits of a number
// O(N)

package Recursion.Questions.Number;
import java.io.*;

class ProductOfDigits
{
    static int prod(int num)
    {
        //Edge case: num is 0
        if (num == 0) {
            return 0;
        }

        //Base case: Single digit left
        if (num < 10) {
            return num;
        }

        //Last digit * product of remaining digits
        return (num % 10) * prod(num / 10);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int num = Integer.parseInt(b.readLine());

        //Printing the product
        System.out.println("Product of digits : " + prod(num));
    }
}