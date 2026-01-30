// Swap 2 variables a and b using a single line only.

package Recursion.Questions.Number;
import java.io.*;

class SingleLineSwap
{
    public static void main(String args[])
    {
        int a = 10, b = 20;

        System.out.println("A: " +a+ ", " + "B: " +b);

        //Swapping the variables
        a = (a + b) - (b = a);

        System.out.println("A: " +a+ ", " + "B: " +b);
    }
}