/*
Number Complement
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement.

Example :
Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

Example :
Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
*/
// O(log N)

package String.Questions;
import java.io.*;

class NumberComplement
{
    /*
     1) Decimal -> Binary
     String bin = Integer.toBinaryString(n);
     System.out.println(bin);

     2) Binary -> Decimal
     int dec = Integer.parseInt(bin, 2);
     System.out.println(dec);
    */

    /* Function to find the complement of a given number */
    static int complement(int n)
    {
        //Edge case
        if (n == 0) {
            return 1;
        }

        //Converting decimal -> binary
        String bin = "";
        while (n > 0)
        {
            int r = n % 2;
            bin = r + bin;
            n = n / 2;
        }

        //Binary complement
        String comp = "";
        for (int i = 0; i < bin.length(); i++)
        {
            if (bin.charAt(i) == '0') {
                comp = comp + '1';
            }
            else {
                comp = comp + '0';
            }
        }

        //Converting binary (complement) -> decimal
        int dec = 0, pow = 0;
        for (int i = (comp.length() - 1); i >= 0; i--)
        {
            if (comp.charAt(i) == '1') {
                dec = dec + (int)Math.pow(2, pow);
            }

            pow++;
        }

        return dec;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.print("Complement : " + complement(n));
    }
}