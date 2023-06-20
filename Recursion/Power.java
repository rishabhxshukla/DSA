// Program to find the number(n) raised to the power(p)

package Recursion;
import java.io.*;

class Power
{
    /* Function to find the power */
    static int power(int n, int p)
    {
        if (p == 0) {
            return 1;
        }

        return (n * power(n, p-1));
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user inputs
        System.out.print("Enter the number (n) : ");
        int n = Integer.parseInt(b.readLine());
        System.out.print("Enter the power (^p) : ");
        int p = Integer.parseInt(b.readLine());

        //Printing the power
        System.out.println("Power : " + power(n, p));
    }
}