/*
Program to find the sum of all the even numbers till N

sum(5)    //odd → skip 5
└── sum(4)    //even → add 4
    └── sum(3)    //odd → skip 3
        └── sum(2)    //even → add 2
            └── sum(1)    //odd → skip 1
                └── sum(0)    //base case → return 0
*/
// O(N)

package Recursion.Questions.Number;
import java.io.*;

class EvenSum
{
    static int sum(int n)
    {
        //Base case
        if (n == 0) {
            return 0;
        }

        //If n is even
        if (n % 2 == 0) {
            return n + sum(n - 1);
        }

        //If n is odd
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