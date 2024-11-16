/*
Given 2 integers R and C, return the number present at Rth row and Cth column of Pascal's triangle.
Pascal's Triangle is a triangular arrangement of numbers, where each number is the sum of
the two numbers directly above it from the previous row.
It is used to find Combinations (nCr).

Formula :
n-1
   C
    r-1

(Doing -1 to convert to 0-based indexing)

       Columns
[ 1   2   3   4   5 ]
| 1
| 1 | 1 |
| 1 | 2 | 1 |
| 1 | 3 | 3 | 1 |
| 1 | 4 | 6 | 4 | 1 |


We can also use this formula :
     n!
-------------
r! * (n - r)!

Just create a function that returns the factorial of a given number and pass each value
to it one-by-one to get each factorial.
Then use the above formula.
But this would increase the time complexity of our code.
*/

package Array.Questions;
import java.io.*;

class PascalTriangle3
{
    /* Function to find the number at Rth row and Cth column of pascal's triangle */
    static int nCr(int n, int r)
    {
        //Edge cases: nCr(0, 0) = 1, nCr(X, 0) = 1 and nCr(X, X) = 1
        if (r == 0 || n == r) {
            return 1;
        }

        int ans = 1;

        //Calculating nCr
        for (int i=0; i<r; i++)
        {
            ans = ans * (n - i);
            ans = ans / (i + 1);
        }

        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        PascalTriangle3 obj = new PascalTriangle3();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user inputs
        System.out.print("Enter the row : ");
        int R = Integer.parseInt(b.readLine());
        System.out.print("Enter the column : ");
        int C = Integer.parseInt(b.readLine());

        //Printing the pascal's triangle
        System.out.println("Number at row " + R + ", column " + C + " : " + nCr(R-1, C-1));
    }
}