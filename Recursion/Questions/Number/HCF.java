// Program to find the HCF or GCD of 2 numbers

package Recursion.Questions.Number;
import java.io.*;

class HCF
{
    /* Function to find the HCF */
    static int hcf(int a, int b)
    {
        if (b == 0) {
            return a;
        }

        return hcf(b, a % b);
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

        //Printing the HCF
        System.out.println("HCF : " + hcf(n1, n2));
    }
}