/*
Given an integer N, print the Nth row of Pascal's triangle.
Pascal's Triangle is a triangular arrangement of numbers, where each number is the sum of
the two numbers directly above it from the previous row.
It is used to find Combinations (nCr).

Formula :
              (row - col)
ans = ans X ---------------
                  col

       Columns
[ 1   2   3   4   5 ]
| 1 |
| 1 | 1 |
| 1 | 2 | 1 |
| 1 | 3 | 3 | 1 |
| 1 | 4 | 6 | 4 | 1 |
*/

package Array.Questions;
import java.io.*;

class PascalTriangle2
{
    /* Function to print particular row of pascal's triangle */
    void pascalTriangleRow(int n)
    {
        int ans = 1;

        //Print the remaining elements of the row
        for (int i=1; i<=n; i++)
        {
            System.out.print(ans + " ");
            ans = ans * (n - i) / i;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        PascalTriangle2 obj = new PascalTriangle2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the row number : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the nth row of pascal's triangle
        System.out.println("Row " + n + " of Pascal's triangle :");
        obj.pascalTriangleRow(n);
    }
}