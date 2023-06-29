// Program to print even and odd numbers of a given range

package Recursion.Questions.Number;
import java.io.*;

class EvenOdd
{
    /* Function to print even & odd numbers */
    void even_odd(int from, int to)
    {
        int i = from;

        //If i comes out of range
        if (i > to) {
            return;
        }

        System.out.print(i + " ");
        even_odd(i + 2, to);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        EvenOdd obj = new EvenOdd();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the lower bound : ");
        int from = Integer.parseInt(b.readLine());
        System.out.print("Enter the upper bound : ");
        int to = Integer.parseInt(b.readLine());

        /* Printing the even & odd numbers */
        //If lower bound is odd, then even no. will start from lb + 1
        if (from % 2 != 0) {
            System.out.println("Even :");
            obj.even_odd(from + 1, to);
            System.out.println("\nOdd :");
            obj.even_odd(from, to);
        }
        //If lower bound is even, then odd no. will start from lb + 1
        else {
            System.out.println("Even :");
            obj.even_odd(from, to);
            System.out.println("\nOdd :");
            obj.even_odd(from + 1, to);
        }
    }
}