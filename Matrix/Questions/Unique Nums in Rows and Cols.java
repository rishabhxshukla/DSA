/*
Check If Every Row and Column Contains All Numbers
An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
Given an n x n integer matrix, return true if the matrix is valid. Otherwise, return false.

Example 1 :
Input:
[
 [1, 2, 3],
 [3, 1, 2],
 [2, 3, 1]
]
Output: true
Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
Hence, we return true.

Example 2 :
Input:
[
 [1, 1, 1],
 [1, 2, 3],
 [1, 2, 3]
]
Output: false
Explanation: In this case, n = 3, but the first row and the first column do not contain the numbers 2 or 3.
Hence, we return false.
*/
// O(N)²

package Matrix.Questions;
import java.util.*;

class UniqueNumsInRowsCols
{
    /* Helper function to print a given matrix */
    static void print(int matrix[][])
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    /* Check if every row has unique values */
    static boolean rows(int matrix[][])
    {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < matrix.length; i++)
        {
            //Clear HashSet for each row
            hs.clear();

            for (int j = 0; j < matrix[i].length; j++)
            {
                //Duplicate found
                if (hs.contains(matrix[i][j])) {
                    return false;
                }
                //Otherwise, add element in HashSet
                else {
                    hs.add(matrix[i][j]);
                }
            }
        }

        return true;
    }


    /* Check if every column has unique values */
    static boolean cols(int matrix[][])
    {
        HashSet<Integer> hs = new HashSet<>();

        for (int j = 0; j < matrix[0].length; j++)
        {
            //Clear HashSet for each col
            hs.clear();

            for (int i = 0; i < matrix.length; i++)
            {
                //Duplicate found
                if (hs.contains(matrix[i][j])) {
                    return false;
                }
                //Otherwise, add element in HashSet
                else {
                    hs.add(matrix[i][j]);
                }
            }
        }

        return true;
    }


    static boolean checkValid(int matrix[][])
    {
        //Validate rows and columns
        boolean rows = rows(matrix);
        boolean cols = cols(matrix);

        return (rows && cols);
    }


    public static void main(String args[])
    {
        //Input matrix
        int matrix[][] = {
                {1, 2, 3},
                {3, 1, 2},
                {2, 3, 1}
        };

        //Print original matrix
        System.out.println("Original Matrix :");
        print(matrix);

        //Print the result
        System.out.println("Contains unique nums in rows & cols : " + checkValid(matrix));
    }
}