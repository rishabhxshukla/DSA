/*
Final Value of Variable After Performing Operations
There is a programming language with only four operations and one variable X:
1) ++X and X++ increments the value of the variable X by 1.
2) --X and X-- decrements the value of the variable X by 1.

Initially, the value of X is 0.
Given an array of strings operations containing a list of operations,
return the final value of X after performing all the operations.
*/

package Array.Questions;
import java.io.*;

class PerformOperations
{
    static String arr[] = {"X++","++X","++X","X++", "X--", "--X"};
    static final int size = arr.length;


    /* Printing the array */
    void print()
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Function to perform the operations */
    static int operations()
    {
        int X = 0;
        int len = arr.length;

        for (int i=0; i<len; i++)
        {
            String ch = arr[i];

            switch(ch)
            {
                case "++X":
                    ++X;
                    break;

                case "X++":
                    X++;
                    break;

                case "--X":
                    --X;
                    break;

                case "X--":
                    X--;
                    break;

                default:
                    break;
            }
        }

        return X;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        PerformOperations obj = new PerformOperations();

        //Printing the array
        System.out.println("*** Operations ***");
        obj.print();

        //Printing the final value
        System.out.println("\nFinal value : " + operations());
    }
}