/*
Maximum Number of Words Found in Sentences
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.

Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
*/

package Array.Questions;
import java.io.*;

class MostWords
{
    static String arr[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};


    /* Printing the array */
    void print()
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }


    /* Function to find sentence with most words */
    static int mostWords()
    {
        int spaces = 0, max = 0;

        for (int i=0; i<arr.length; i++)
        {
            //Extracting each sentence
            String s = arr[i];

            //Counting the no. of spaces in each sentence
            for (int j=0; j<s.length(); j++)
            {
                if (s.charAt(j) == ' ') {
                    spaces++;
                }
            }

            //Sentences with most no. of spaces
            if (spaces > max) {
                max = spaces;
            }

            //Reinitializing spaces to 0
            spaces = 0;

        }

        //Words = spaces + 1
        return (max + 1);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MostWords obj = new MostWords();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print();

        //Printing the sentence with most words
        System.out.println("\nMost words : " + mostWords());
    }
}