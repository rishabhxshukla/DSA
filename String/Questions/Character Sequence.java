// Program to check if a given string contains a specified sequence of char values.

package String.Questions;
import java.io.*;

class CharacterSequence
{
    /* Function to check is string contains character sequence */
    static boolean containsSequence(String str, String seq)
    {
        return str.contains(seq);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        CharacterSequence obj = new CharacterSequence();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();
        System.out.print("Enter the sequence : ");
        String seq = b.readLine();

        //Checking if sequence is present
        System.out.println("Contains Sequence : " + containsSequence(str, seq));
    }
}