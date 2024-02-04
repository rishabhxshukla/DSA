/*
Find Words Containing Character
You are given a 0-indexed array of strings words[] and a character 'x'.
Return an array of indices representing the words that contain the character x.

Example :
Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
*/

package String.Questions;
import java.util.*;

class WordsContainingCharacter
{
    /* Function to print array of indices */
    void findWords(String words[], char x)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        //Converting character to string
        String letter = String.valueOf(x);

        for (int i=0; i<words.length; i++)
        {
            //Extracting each word
            String word = words[i];

            //Checking if letter is present
            if (word.contains(letter))
            {
                ans.add(i);
            }
        }

        System.out.println(ans);
    }


    public static void main(String args[])
    {
        //Creating object of the class
        WordsContainingCharacter obj = new WordsContainingCharacter();

        //Words array
        String words[] = {"abc","bcd","aaaa","cbc"};

        //Character to find
        char x = 'a';

        //Printing the indices
        System.out.println("Indices : ");
        obj.findWords(words, x);
    }
}