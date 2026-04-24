// Program to reverse a number
// O(N)

package Recursion.Questions.Number;
import java.io.*;

class Reverse
{
    static int reverse(int num, int S)
    {
        //Base case: No digits left
        if (num == 0) {
            return S;
        }

        //Extract last digit and build reversed number
        int r = num % 10;
        S = (S * 10) + r;

        //Recurse for remaining digits
        return reverse(num / 10, S);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int num = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.print("Reversed number : " + reverse(num, 0));
    }
}