/*
Flipping An Image
Given an n x n binary matrix, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the matrix is reversed.
For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0, 1, 1] results in [1, 0, 0].

Example :
Input:
[
 [1, 1, 0],
 [1, 0, 1],
 [0, 0, 0]
]
Output:
[
 [1, 0, 0],
 [0, 1, 0],
 [1, 1, 1]
]
Explanation: First reverse each row: [[0, 1, 1], [1, 0, 1],[0, 0, 0]]
Then, invert the image: [[1, 0, 0], [0, 1, 0], [1, 1, 1]]
*/
// O(N)²

package Matrix.Questions;
import java.util.*;

class FlippingAnImage
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


    static int[][] flipAndInvertImage(int image[][])
    {
        for (int i = 0; i < image.length; i++)
        {
            //Pointers for start and end of the row
            int left = 0;
            int right = image[i].length - 1;

            //Swap elements from both ends
            while (left <= right)
            {
                //Swap + Flip 0 & 1
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
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

        //Print original image
        System.out.println("Original Image :");
        print(image);

        //Flip the image
        int result[][] = flipAndInvertImage(image);

        //Print the result
        System.out.println("Flipped Image :");
        print(result);
    }
}