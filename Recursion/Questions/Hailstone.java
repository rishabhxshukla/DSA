/*
Program to generate all the Hailstone numbers from a given number.
Also called the 3n + 1 problem.
Let N be an integer. According to Collatz conjecture, if we keep iterating N as following :
1) N = N / 2        (For Even N)
2) N = 3 * N + 1    (For Odd N)
Our number will eventually converge to 1 irrespective of the choice of N.
*/

package Recursion.Questions;
import java.io.*;

class Hailstone
{
    /* Function to find the hailstone numbers */
    static int count = 0;
    void hailstone(int n)
    {
        //Base case
        if (n == 1) {
            count++;
            System.out.print(n);
            System.out.print("\nSteps : " + count);
            return;
        }
        //Even
        if (n % 2 == 0) {
            count++;
            System.out.print(n + " ");
            hailstone(n / 2);
        }
        //Odd
        else {
            count++;
            System.out.print(n + " ");
            hailstone(3 * n + 1);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Hailstone obj = new Hailstone();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the hailstone numbers
        System.out.println("*** Hailstone numbers ***");
        obj.hailstone(n);
    }
}