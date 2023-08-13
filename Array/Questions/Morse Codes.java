/*
Unique Morse Code Words
International Morse Code defines a standard encoding where each letter is mapped to a series of
dots and dashes, as follows :
1) 'a' maps to ".-",
2) 'b' maps to "-..."
3) 'c' maps to "-.-."
and so on...

Given an array of strings words where each word can be written as a concatenation of the Morse
code of each letter. For example, "cab" can be written as "-.-..--...", which is the concatenation
of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words present in the array.

Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".
*/
// HASHSET

package Array.Questions;
import java.io.*;
import java.util.*;

class MorseCodes
{
    static String words[] = {"gin","zen","gig","msg"};
    static String arr[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                           "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
                           "...-",".--","-..-","-.--","--.."};


    /* Printing the array */
    void print()
    {
        for (int i=0; i<words.length; i++)
        {
            System.out.print(words[i] + " ");
        }
    }


    /* Function to count the unique morse codes */
    static int uniqueCodes()
    {
        HashSet<String> hs = new HashSet<>();
        String code = "";

        /*
        0...25  Morse codes
        0...25  Letters
        */

        //Extracting words
        for (int i=0; i<words.length; i++)
        {
            String word = words[i];

            //Looping over each word
            for (int j=0; j<word.length(); j++)
            {
                //Extracting character
                char ch = word.charAt(j);

                //Index of each character
                int index = (int)ch - 97;

                //Getting the morse code of index
                code = code + arr[index];
            }

            //Adding morse code of word in HashSet
            hs.add(code);
            //Resetting the morse code for new word
            code = "";
        }

        return hs.size();
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MorseCodes obj = new MorseCodes();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print();

        //Printing the no. of unique codes
        System.out.print("\nNo. of unique code : " + uniqueCodes());
    }
}