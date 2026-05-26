/*
Reshape the Matrix
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
If the reshape operation with given parameters is possible and legal, output the new reshaped matrix. Otherwise, output the original matrix.

Example 1 :
Input:
matrix =
[
 [1, 2],
 [3, 4]
]
Reshape to r = 1, c = 4
Output:
[
 [1, 2, 3, 4]
]

Example 2 :
Input:
mat =
[
 [1, 2],
 [3, 4]
]
Reshape to r = 2, c = 4
Since total elements = 4 but new matrix requires 8 elements, reshape is NOT possible.
Output : Return original matrix
*/
// O(m × n)

/*
1) BRUTE FORCE: Use List -> Store values -> Recreate matrix

2) Treat the matrix like a continuous list of numbers.
Use a counter k to track the position of elements.

res[k / c][k % c]

Example :
k = 0 → (0/4, 0%4) = (0,0)
k = 1 → (1/4, 1%4) = (0,1)
k = 2 → (2/4, 2%4) = (0,2)
k = 3 → (3/4, 3%4) = (0,3)
k = 4 → (4/4, 4%4) = (1,0)
*/

package Matrix.Questions;
import java.util.*;

class ReshapeMatrix
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


    static int[][] reshapeMatrix(int matrix[][], int r, int c)
    {
        //If reshape not possible, return original
        if ((matrix.length * matrix[0].length) != (r * c)) {
            return matrix;
        }

        int res[][] = new int[r][c];
        int k = 0;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                //Convert 1D index k to 2D position in new matrix
                res[k / c][k % c] = matrix[i][j];
                k++;
            }
        }

        return res;
    }


    public static void main(String args[])
    {
        //Input matrix
        int matrix[][] = {
                {1, 2},
                {3, 4}
        };

        //Print original matrix
        System.out.println("Original Matrix :");
        print(matrix);

        //Reshape the matrix
        int result[][] = reshapeMatrix(matrix, 1, 4);

        //Print the result
        System.out.println("Reshaped Matrix :");
        print(result);
    }
}