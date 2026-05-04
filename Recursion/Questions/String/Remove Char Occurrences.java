// Program to remove all occurrences of a particular character from a given string
// O(N)², because of substring() & string concatenation (+ch), use idx for O(N)

package Recursion.Questions.String;
import java.io.*;

class RemoveCharOccurrences
{
    static String remove(String str, String ans)
    {
        //Base case: No characters left
        if (str.length() == 0) {
            return ans;
        }

        //Add current char to ans if it is not 'a'
        char ch = str.charAt(0);
        if (ch != 'a') {
            ans = ans + ch;
        }

        //Recurse for remaining string
        return remove(str.substring(1), ans);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the result
        System.out.print("String after removing 'a' : " + remove(str, ""));
    }
}