/*
Program to compare two strings lexicographically.
compareTo method compares the current string with anotherString lexicographically and returns :
1) If (string1 < string2) it returns a negative value.
2) If both the strings are equal i.e. (string1 == string2) it returns 0.
3) If (string1 > string2) it returns a positive value.
*/

package String.Questions;
import java.io.*;

class LexicographicalComparison
{
    /* Function to compare 2 strings */
    static int compare(String str1, String str2)
    {
        return str1.compareTo(str2);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user inputs
        System.out.print("Enter the 1st string : ");
        String str1 = b.readLine();
        System.out.print("Enter the 2nd string : ");
        String str2 = b.readLine();

        //Comparing the strings
        System.out.print("Result : ");
        int ans = compare(str1, str2);

        //str1 < str2
        if (ans < 0) {
            System.out.println("str1 is lexicographically less than str2");
        }
        //str1 > str2
        else if (ans > 0) {
            System.out.println("str1 is lexicographically greater than str2");
        }
        //str1 == str2
        else {
            System.out.println("str1 is lexicographically equal to str2");
        }
    }
}