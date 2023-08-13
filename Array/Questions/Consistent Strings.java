/*
Count the Number of Consistent Strings
You are given a string 'allowed' consisting of distinct characters and an array of strings words.
A string is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words.

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
The remaining string contain characters other than the mentioned in the allowed string.
*/

package Array.Questions;
import java.io.*;

class ConsistentString
{
    static String words[] = {"ad","bd","aaab","baa","badab"};
    static String allowed = "ab";


    /* Printing the array */
    void print()
    {
        for (int i=0; i<words.length; i++)
        {
            System.out.print(words[i] + " ");
        }
    }


    /* Function to find the number of consistent strings */
    static int consistent()
    {
        int i, j;
        int count = 0;

        //Extracting words
        for (i=0; i<words.length; i++)
        {
            String word = words[i];

            //Looping over each word
            for (j=0; j<word.length(); j++)
            {
                //Extracting character
                char ch = word.charAt(j);

                //Converting character to string
                String c = Character.toString(ch);

                //If character not present then break
                if (!allowed.contains(c)) {
                    break;
                }
            }

            //If the word has been traversed till the end
            //which means that the loop did not break in b/w
            if (j == word.length()) {
                count++;
            }
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ConsistentString obj = new ConsistentString();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print();

        //Printing the number of consistent strings
        System.out.println("\nNumber of consistent strings : " + consistent());
    }
}