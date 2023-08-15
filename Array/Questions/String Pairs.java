/*
Find Maximum Number of String Pairs
You are given an array consisting of distinct strings.
The string arr[i] can be paired with the string words[j] if :
string arr[j] is the reverse of string arr[i]
Return the number of pairs that can be formed from the given array.

Input: words = ["cd","ac","dc","ca","zz"]
Output: 2
*/
// HASHSET

package Array.Questions;
import java.io.*;
import java.util.*;

class StringPairs
{
    static String arr[] = {"cd","ac","dc","ca","zz"};


    /* Printing the array */
    void print()
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Function to reverse a word */
    static String reverse(String word)
    {
        String str = "";

        for (int j=word.length()-1; j>=0; j--)
        {
            str = str + word.charAt(j);
        }

        return str;
    }


    /* Function to count the no. of string pairs */
    static int stringPairs()
    {
        int count = 0;
        HashSet<String> hs = new HashSet<>();

        //Storing all words in HashSet
        for (int i=0; i<arr.length; i++)
        {
            hs.add(arr[i]);
        }

        //Extracting each word
        for (int i=0; i<arr.length; i++)
        {
            String word = arr[i];

            //Reversing the word
            String str = reverse(word);

            //Removing the word from HashSet
            hs.remove(word);

            //Checking if reversed word is present in HashSet
            //If yes, then remove it from the HashSet
            if (hs.contains(str)) {
                count++;
                hs.remove(str);
            }
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        StringPairs obj = new StringPairs();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print();

        //Printing the no. of string pairs
        System.out.println("\nString pairs : " + stringPairs());
    }
}