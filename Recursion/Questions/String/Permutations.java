// Program to find all the permutations of a given string

package Recursion.Questions.String;
import java.io.*;

class Permutations
{
    /* Function to find the permutations */
    // ABC => ABC  ACB  BAC  BCA  CAB  CBA
    void permutations(String str, String ans)
    {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            permutations(newstr, ans+ch);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Permutations obj = new Permutations();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the string permutations
        System.out.print("Permutations of string : ");
        obj.permutations(str, "");
    }
}