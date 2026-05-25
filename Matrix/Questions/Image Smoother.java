/*
Image Smoother
You are given a 2D matrix called img that represents a grayscale image.
To smooth the image, we replace each cell with the average value of:
- the cell itself
- all of its surrounding neighbors (up to 8 neighbors)
So each cell looks at a 3 × 3 area around it.

Important:
If the cell is on an edge or corner, some neighbors may not exist.
In that case, only use the cells that are inside the matrix.

Example :
Input:
img = [
 [100, 200, 100],
 [200,  50, 200],
 [100, 200, 100]
]
Output:
[
 [137, 141, 137],
 [141, 138, 141],
 [137, 141, 137]
]
Explanation:
Corner cells use 4 numbers.
Edge cells use 6 numbers.
Middle cells use all 9 numbers.
Each result is the floor of the average.
*/
// O(m × n)

package Matrix.Questions;
import java.util.*;

class ImageSmoother
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


    static int calculateAvg(int matrix[][], int row, int col)
    {
        int sum = 0, count = 0;

        //Traverse the 3×3 neighborhood around (row, col)
        for (int i = (row - 1); i <= (row + 1); i++)
        {
            for (int j = (col - 1); j <= (col + 1); j++)
            {
                //Check boundaries
                if ((i >= 0 && i < matrix.length) &&
                        (j >= 0 && j < matrix[0].length))
                {
                    sum = sum + matrix[i][j];
                    count++;
                }
            }
        }

        return (sum / count);
    }


    static int[][] imageSmoother(int img[][])
    {
        int res[][] = new int[img.length][img[0].length];

        for (int i = 0; i < img.length; i++)
        {
            for (int j = 0; j < img[i].length; j++)
            {
                //Compute smoothed value
                res[i][j] = calculateAvg(img, i, j);
            }
        }

        return res;
    }


    public static void main(String args[])
    {
        //Input matrix
        int image[][] = {
                {100, 200, 100},
                {200,  50, 200},
                {100, 200, 100}
        };

        //Print original matrix
        System.out.println("Original Matrix :");
        print(image);

        //Smoothen the image
        int result[][] = imageSmoother(image);

        //Print the result
        System.out.println("Smoothened Matrix :");
        print(result);
    }
}