/*
Check If Two String Arrays are Equivalent
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
*/

package Array.Questions;
import java.io.*;

class EquivalentStringArrays
{
    static String arr1[] = {"ab", "c"};
    static String arr2[] = {"a", "bc"};


    /* Printing the array */
    void print(String a[])
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + "  ");
        }
    }


    /* Function to check if strings are equivalent */
    static boolean equivalent()
    {
        String s1 = "", s2 = "";

        //First string
        for(int i=0; i<arr1.length; i++)
        {
            s1 = s1 + arr1[i];
        }

        //Second string
        for(int i=0; i<arr2.length; i++)
        {
            s2 = s2 + arr2[i];
        }

        return s1.equals(s2);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        EquivalentStringArrays obj = new EquivalentStringArrays();

        //Printing the arrays
        System.out.println("*** Created Array 1 ***");
        obj.print(arr1);
        System.out.println("\n*** Created Array 2 ***");
        obj.print(arr2);

        //Printing the result
        System.out.println("\nEquivalent : " + equivalent());
    }
}