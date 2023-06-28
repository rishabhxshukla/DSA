/*
Pangram is a sentence containing every letter in the English alphabet.
Given a string, find all characters that are missing from the string.
*/
// HASHSET

package Hashing.Questions;
import java.io.*;
import java.util.*;

class Pangram
{
    /* Function to find the missing characters */
    void pangrams(String str)
    {
        HashSet<Character> hs = new HashSet<>();

        //Converting string to lower-case
        str = str.toLowerCase();

        //Storing string characters in HashSet
        for (int i=0; i<str.length(); i++)
        {
            hs.add(str.charAt(i));
        }

        //Printing the missing characters
        for (char i = 'a'; i<='z'; i++)
        {
            //If character not present, print it
            if (!hs.contains(i)) {
                System.out.print(i);
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Pangram obj = new Pangram();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the missing characters
        System.out.print("Missing characters : ");
        obj.pangrams(str);
    }
}