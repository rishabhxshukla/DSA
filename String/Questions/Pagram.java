/*
Check if the Sentence Is Pangram
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence
is a pangram, or false otherwise.
*/

package String.Questions;
import java.io.*;

class Pangram
{
    /* Function to find if the string is pangram or not */
    static boolean isPangram(String str)
    {
        for (char i='a'; i<='z'; i++)
        {
            String ch = Character.toString(i);

            if (!str.contains(ch)) {
                return false;
            }
        }

        return true;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Pangram obj = new Pangram();

        //Creating the string
        String str = "thequickbrownfoxjumpsoverthelazydog";

        //Printing the string
        System.out.println("Created string : ");
        System.out.println(str);

        //Checking if the string is pangram
        System.out.println("Is pangram : " + isPangram(str));
    }
}