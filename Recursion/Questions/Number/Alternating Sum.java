/*
Program to find the alternating sum of first N natural numbers
Series: 1 − 2 + 3 − 4 + 5 − 6 + ... ±n

O(1) solution :
    if (n % 2 == 0)
        return -n / 2;
    else
        return (n + 1) / 2;
*/
// O(N)

package Recursion.Questions.Number;
import java.io.*;

class AlternatingSum
{
    static int sum(int n)
    {
        //Base case
        if (n == 0) {
            return 0;
        }

        //N is even
        if (n % 2 == 0) {
            return sum(n - 1) - n;
        }
        //N is odd
        else {
            return sum(n - 1) + n;
        }
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("Alternating Sum : " + sum(n));
    }
}