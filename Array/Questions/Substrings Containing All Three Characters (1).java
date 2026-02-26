/*
Number of Substrings Containing All Three Characters
Given a string str consisting only of characters a, b and c.
Return the number of substrings containing at least one occurrence of all these characters a, b and c.

Example 1 :
Input: str = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).

Example 2 :
Input: str = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb".

Example 3 :
Input: str = "abc"
Output: 1
*/
// NESTED LOOPS -> SLIDING WINDOW -> O(N)²

package Array.Questions;
import java.io.*;
import java.util.*;

class SubstringsContainingAllThreeCharacters1
{
    static String str = "abcabc";


    /* Function to find the no. of substrings containing all 3 characters */
    static int numberOfSubstrings()
    {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;

        for (int i = 0; i < str.length(); i++)
        {
            //Reinitialize HashSet for every window
            hs.clear();

            //Sliding window starting from ith index
            for (int j = i; j < str.length(); j++)
            {
                char ch = str.charAt(j);
                hs.add(ch);

                //Increase count when HashSet contains all 3 chars
                if (hs.size() == 3) {
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String args[])
    {
        //Printing the input string
        System.out.println("String : " + str);

        //Printing the result
        System.out.println("No. of substrings : " + numberOfSubstrings());
    }
}