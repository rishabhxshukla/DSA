// Program to count the digits of a given number

package Recursion.Questions.Number;
import java.io.*;

class CountDigits
{
    /* Function to find the count */
    static int count = 0;
    static int count(int num)
    {
        if (num == 0) {
            return count;
        }

        //Finding digits and increasing count
        int r = num % 10;
        count++;

        return count(num / 10);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int num = Integer.parseInt(b.readLine());

        //Printing the count
        System.out.println("Count of digits : " + count(num));
    }
}