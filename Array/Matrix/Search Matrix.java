/*
Search a 2D Matrix
You are given an m x n integer matrix. Given an integer target, return true if target is in
matrix or false otherwise.
*/

package Array.Questions;
import java.io.*;
import java.util.*;

class SearchMatrix
{
    static int matrix[][] ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};


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


    /* Function to search for the target element */
    static boolean search(int target)
    {
        ArrayList<Integer> al = new ArrayList<>();

        //Storing elements in ArrayList
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                al.add(matrix[i][j]);
            }
        }

        //Searching for the target element
        for(int i=0; i<al.size(); i++)
        {
            if (al.get(i) == target) {
                return true;
            }
        }

        return false;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SearchMatrix obj = new SearchMatrix();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Printing the array
        System.out.println("*** Created Matrix ***");
        obj.print();

        //Taking user input
        System.out.print("Enter the target element : ");
        int target = Integer.parseInt(b.readLine());

        //Searching the target element
        System.out.println("Result : " + search(target));
    }
}