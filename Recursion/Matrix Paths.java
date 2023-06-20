/*
Find the total number of paths for traveling from top-left to bottom-right of the M X N
matrix with the constraint that you can either move Right or Down at each step.
Right move : M[i][j+1]
Down move  : M[i+1][j]
*/

package Recursion;
import java.io.*;

class MatrixPaths
{
    /* Function to find the total no. of paths */
    static int totalPaths(int m, int n)
    {
        if (m == 1 || n == 1) {
            return 1;
        }

        return (totalPaths(m-1, n) + totalPaths(m, n-1));
        //NOTE: If diagonal movements are allowed then, add totalPaths(m-1, n-1) above
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user inputs
        System.out.print("Enter the value of M : ");
        int m = Integer.parseInt(b.readLine());
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the total no. of paths
        System.out.println("Total no. of paths : " + totalPaths(m, n));
    }
}