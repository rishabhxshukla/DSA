// Program to count the number of zeroes in a given number
// O(N)

package Recursion.Questions.Number;
import java.io.*;

class CountZeroes
{
    static int zeroes(int num)
    {
        int count = 0;

        //Base case: No digits left
        if (num == 0) {
            return count;
        }

        //If last digit is 0
        if (num % 10 == 0) {
            count++;
        }

        //Recurse for remaining digits
        count = count + zeroes(num / 10);

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int num = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("Zero count : " + zeroes(num));
    }
}