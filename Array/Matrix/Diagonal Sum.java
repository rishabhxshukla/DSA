/*
Diagonal Sum of Matrix
Given a square matrix, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the
secondary diagonal that are not part of the primary diagonal.
*/

package Array.Questions;
import java.io.*;
import java.util.*;

class DiagonalSum
{
    static int matrix[][] ={{1,2,3},{4,5,6},{7,8,9}};


    /* Printing the matrix */
    void print()
    {
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    /* Function to find the sum of 2 diagonals of matrix */
    static int diagonalSum()
    {
        int sum = 0;
        int n = matrix.length;

        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                if (i == j || j == n - 1 - i)
                {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        DiagonalSum obj = new DiagonalSum();

        //Printing the array
        System.out.println("*** Created Matrix ***");
        obj.print();

        //Printing the diagonal sum
        System.out.println("Diagonal sum : " + diagonalSum());
    }
}