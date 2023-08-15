/*
Sum of Squares of Special Elements
You are given an array arr of length n.
An element arr[i] is called special if i divides n, i.e. n % i == 0.
Return the sum of the squares of all special elements of the array.

Input: arr = [1, 2, 3, 4]
Output: 21
Explanation: There are exactly 3 special elements in arr: 1 divides 4, 2 divides 4, and 4 divides 4.
Hence, the sum of the squares of all special elements of arr = 1 * 1 + 2 * 2 + 4 * 4 = 21.
*/

package Array.Questions;
import java.io.*;

class SpecialElements
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Creating the array */
    void create() throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }
    }


    /* Printing the array */
    void print()
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Function to find sum of squares */
    static int sumOfSquares()
    {
        int sum = 0;

        for (int i=0; i<size; i++)
        {
            if (size % (i + 1) == 0) {
                sum = sum + (arr[i] * arr[i]);
            }
        }

        return sum;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SpecialElements obj = new SpecialElements();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print();

        //Printing the sum of squares
        System.out.println("\nSum of squares : " + sumOfSquares());
    }
}