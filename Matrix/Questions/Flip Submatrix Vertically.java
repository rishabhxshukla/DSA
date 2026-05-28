/*
Flip Square Submatrix Vertically
Given an m x n matrix `grid` and integers x, y, and k,
reverse the rows of the k x k submatrix whose top-left corner is (x, y).
The operation flips the submatrix vertically (top row ↔ bottom row).

Example :
Input:
[
  [ 1,  2,  3,  4],
  [ 5,  6,  7,  8],
  [ 9, 10, 11, 12],
  [13, 14, 15, 16]
],
x = 1, y = 0, k = 3

Submatrix (rows 1→3, cols 0→2):
[
  [ 5,  6,  7],
  [ 9, 10, 11],
  [13, 14, 15]
]

After vertical flip:
[
  [13, 14, 15],
  [ 9, 10, 11],
  [ 5,  6,  7]
]

Output:
[
  [ 1,  2,  3,  4],
  [13, 14, 15,  8],
  [ 9, 10, 11, 12],
  [ 5,  6,  7, 16]
]
*/
// O(k)²

package Matrix.Questions;
import java.util.*;

class FlipSubmatrixVertically
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


    static int[][] reverseSubmatrix(int grid[][], int x, int y, int k)
    {
        //Starting & Ending row of submatrix
        int top = x;
        int bottom = x + k - 1;

        //Keep swapping until both pointers meet
        while (top < bottom)
        {
            //Iterate through all columns of the submatrix
            for (int j = y; j < (y + k); j++)
            {
                int temp = grid[top][j];
                grid[top][j] = grid[bottom][j];
                grid[bottom][j] = temp;
            }

            //Move pointers inward
            top++;
            bottom--;
        }

        return grid;
    }


    public static void main(String args[])
    {
        //Input matrix
        int matrix[][] = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        //Print original matrix
        System.out.println("Original Matrix :");
        print(matrix);

        //Flip the submatrix vertically
        int result[][] = reverseSubmatrix(matrix, 1, 0, 3);

        //Print the result
        System.out.println("Flipped Matrix :");
        print(result);
    }
}