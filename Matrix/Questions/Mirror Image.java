/*
Given a binary matrix containing only 0s and 1s, your task is to flip the image horizontally.
Flipping horizontally means reversing each row of the matrix.

Example :
Input Matrix:
1 1 0
1 0 1
0 0 0
After Flipping:
0 1 1
1 0 1
0 0 0
*/
// O(N)²

package Matrix.Questions;
import java.util.*;

class MirrorImage
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


    static int[][] flipImage(int image[][])
    {
        for (int i = 0; i < image.length; i++)
        {
            //Pointers for start and end of the row
            int left = 0;
            int right = image[i].length - 1;

            //Swap elements from both ends
            while (left <= right)
            {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                //Move pointers toward the center
                left++;
                right--;
            }
        }

        return image;
    }


    public static void main(String args[])
    {
        //Input matrix
        int image[][] = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        //Print original matrix
        System.out.println("Original Matrix :");
        print(image);

        //Create the mirror image
        int result[][] = flipImage(image);

        //Print the result
        System.out.println("Mirrored Matrix :");
        print(result);
    }
}