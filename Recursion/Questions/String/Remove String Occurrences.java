// Program to remove all occurrences of a particular string from a given string
// O(N)², because of substring() & string concatenation (+ch), use idx for O(N)

package Recursion.Questions.String;
import java.io.*;

class RemoveStringOccurrences
{
    static String remove(String str, String target, String ans)
    {
        //Base case: No characters left
        if (str.length() == 0) {
            return ans;
        }

        //If string starts with "abc", skip it
        if (str.startsWith(target)) {
            return remove(str.substring(target.length()), target, ans);
        }

        //Add current char to ans
        ans = ans + str.charAt(0);

        //Recurse for remaining string
        return remove(str.substring(1), target, ans);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the result
        System.out.print("String after removing 'abc' : " + remove(str, "abc", ""));
    }
}