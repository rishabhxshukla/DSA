/*
Program to find the sum of all the odd numbers till N

sum(5)    //odd → add 5
└── sum(4)    //even → skip 4
    └── sum(3)    //odd → add 3
        └── sum(2)    //even → skip 2
            └── sum(1)    //odd → add 1
                └── sum(0)    //base case → return 0
*/
// O(N)

package Recursion.Questions.Number;
import java.io.*;

class OddSum
{
    static int sum(int n)
    {
        //Base case
        if (n == 0) {
            return 0;
        }

        //If n is odd
        if (n % 2 == 1) {
            return n + sum(n - 1);
        }

        //If n is even
        return sum(n - 1);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("Sum : " + sum(n));
    }
}