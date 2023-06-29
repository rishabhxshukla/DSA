// Print all the k-digit numbers

package Recursion.Questions.Number;
import java.io.*;

class KDigitNumbers
{
    /* Function to print the k digit numbers */
    void print(int num, String ans)
    {
        if (num == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i=0; i<=9; i++)
        {
            String str = ans + i;
            print(num - 1, str);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        KDigitNumbers obj = new KDigitNumbers();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the no. of digit : ");
        int k = Integer.parseInt(b.readLine());

        //Printing the k digit numbers
        System.out.println("All K Digit Numbers : ");
        obj.print(k, "");
    }
}