/*
Longest Substring Without Repeating Characters
Given a string str, find the length of the longest substring without duplicate characters.

Example 1 :
Input: str = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

Example 2 :
Input: str = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3 :
Input: str = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
*/
// NESTED LOOPS -> SLIDING WINDOW -> O(N)²

package Array.Questions;
import java.io.*;
import java.util.*;

class LongestSubstringWithoutRepeatingCharacters1
{
    static String str = "abcabcbb";


    /* Function to find the longest substring without duplicate characters */
    static int longestSubstring()
    {
        HashSet<Character> hs = new HashSet<>();
        int max = 0;

        for (int i = 0; i < str.length(); i++)
        {
            //Reinitialize HashSet for every window
            hs.clear();

            //Sliding window starting from ith index
            for (int j = i; j < str.length(); j++)
            {
                //Extracting each character
                char ch = str.charAt(j);

                //If duplicate char found, break the loop
                if (hs.contains(ch))
                {
                    break;
                }

                //Otherwise, add char to HashSet
                hs.add(ch);

                //Update max
                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }


    public static void main(String args[])
    {
        //Printing the input string
        System.out.println("String : " + str);

        //Printing the result
        System.out.println("Longest substring : " + longestSubstring());
    }
}