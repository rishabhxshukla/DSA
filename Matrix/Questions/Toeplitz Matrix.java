/*
Toeplitz Matrix
Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.

Example :
Input: matrix =
[
  [1, 2, 3, 4],
  [5, 1, 2, 3],
  [9, 5, 1, 2]
]
Output: true
Explanation: Diagonals -> [9], [5, 5], [1, 1, 1], [2, 2, 2], [3, 3], [4]
All elements in each diagonal are equal.
*/
// O(m × n)

package Matrix.Questions;
import java.util.*;

class ToeplitzMatrix
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


    static boolean isToeplitzMatrix(int matrix[][])
    {
        //Start from row 1 and column 1
        for (int i = 1; i < matrix.length; i++)
        {
            for (int j = 1; j < matrix[0].length; j++)
            {
                //Check if current element matches the element
                //diagonally above it (top-left neighbor)
                if (matrix[i][j] != matrix[i - 1][j - 1])
                {
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String args[])
    {
        //Input matrix
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };

        //Print original matrix
        System.out.println("Original Matrix :");
        print(matrix);

        //Print the result
        System.out.println("isToeplitzMatrix : " + isToeplitzMatrix(matrix));
    }
}