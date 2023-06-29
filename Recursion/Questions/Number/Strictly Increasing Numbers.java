/*
Print all n-digit numbers whose digits are strictly increasing from left to right.
Input: n = 2
Output:
01 02 03 04 05 06 07 08 09 12 13 14 15 16 17 18 19 23 24 25 26 27 28
29 34 35 36 37 38 39 45 46 47 48 49 56 57 58 59 67 68 69 78 79 89
*/

package Recursion.Questions.Number;
import java.io.*;

class StrictlyIncreasing
{
    /* Function to print strictly increasing numbers */
    void print(int num, String ans, int start)
    {
        if (num == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i=start; i<=9; i++)
        {
            String str = ans + i;
            print(num - 1, str, i + 1);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        StrictlyIncreasing obj = new StrictlyIncreasing();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the no. of digit : ");
        int num = Integer.parseInt(b.readLine());

        //Printing the strictly increasing numbers
        System.out.println("Strictly Increasing Numbers : ");
        obj.print(num, "", 0);
    }
}