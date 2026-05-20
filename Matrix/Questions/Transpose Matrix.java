/*
Transpose Matrix
Given a 2D matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example :
Input:
[
 [1, 2, 3],
 [4, 5, 6],
 [7, 8, 9]
]
Output:
[
 [1, 4, 7],
 [2, 5, 8],
 [3, 6, 9]
]
*/
// O(m × n)

package Matrix.Questions;
import java.util.*;

class TransposeMatrix
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


    static int[][] transpose(int matrix[][])
    {
        //Creating a 'n x m' ans matrix
        int ans[][] = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }


    public static void main(String args[])
    {
        //Input matrix
        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //Print original matrix
        System.out.println("Original Matrix :");
        print(matrix);

        //Transpose the matrix
        int result[][] = transpose(matrix);

        //Print the result
        System.out.println("Transpose Matrix :");
        print(result);
    }
}