// Program to print your name N times

package Recursion.Questions;
import java.io.*;

class Name
{
    /* Function to print the name N times */
    static void print(int N)
    {
        if (N == 0) {
            return;
        }

        System.out.println("Rishabh");
        print(--N);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the name N times
        print(n);
    }
}