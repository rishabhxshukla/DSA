/*
Given an integer N, print the first N rows of Pascal's triangle.
Pascal's Triangle is a triangular arrangement of numbers, where each number is the sum of
the two numbers directly above it from the previous row.
It is used to find Combinations (nCr).

Formula :
number = [(j)th element of previous row] + [(j - 1)th element of previous row]

       Columns
[ 1   2   3   4   5 ]
| 1 |
| 1 | 1 |
| 1 | 2 | 1 |
| 1 | 3 | 3 | 1 |
| 1 | 4 | 6 | 4 | 1 |
*/
// NESTED LOOPS

package Array.Questions;
import java.io.*;
import java.util.*;

class PascalTriangle
{
    /* Function to make the pascal's triangle */
    void pascalTriangle(int n)
    {
        //List to store each row of pascal's triangle
        List<List<Integer>> result = new ArrayList<>();

        //First row is always '1', add it to the result
        List<Integer> firstRow = new ArrayList<>(List.of(1));
        result.add(firstRow);

        for (int i=1; i<n; i++)
        {
            //Retrieving the previous row
            List<Integer> prevRow = result.get(i - 1);

            //New row
            List<Integer> newRow = new ArrayList<>();

            //Adding leftmost 1
            newRow.add(1);

            //Fill in the middle elements of the row
            for (int j=1; j<i; j++)
            {
                //Number = jth element + (j-1)th element of previous row
                newRow.add(prevRow.get(j) + prevRow.get(j - 1));
            }

            //Adding rightmost 1
            newRow.add(1);

            //Add this new row to final result
            result.add(newRow);
        }

        //Printing the pascal's triangle row-wise
        for (List<Integer> row : result)
        {
            System.out.println(row);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        PascalTriangle obj = new PascalTriangle();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the no. of rows : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the pascal triangle
        System.out.println("*** Pascal's Triangle (row-wise) ***");
        obj.pascalTriangle(n);
    }
}