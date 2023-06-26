// Program to find the LCM of 2 numbers

package Recursion.Questions.Number;
import java.io.*;

class LCM
{
    /* Function to find the LCM */
    static int lcm(int a, int b)
    {
        //If any no. is 0
        if (a == 0 || b == 0) {
            return 0;
        }

        //Increment lcm until it is divisible by both a and b
        int lcm = Math.max(a, b);
        while (lcm % a != 0 || lcm % b != 0)
        {
            lcm++;
        }

        return lcm;
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user inputs
        System.out.print("Enter the 1st number : ");
        int n1 = Integer.parseInt(b.readLine());
        System.out.print("Enter the 2nd number : ");
        int n2 = Integer.parseInt(b.readLine());

        //Printing the LCM
        System.out.println("LCM : " + lcm(n1, n2));
    }
}