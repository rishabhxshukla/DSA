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
// SLIDING WINDOW -> O(N)

package Array.Questions;
import java.io.*;
import java.util.*;

class LongestSubstringWithoutRepeatingCharacters2
{
    static String str = "abcabcbb";


    /* Function to find the longest substring without duplicate characters */
    static int longestSubstring()
    {
        HashSet<Character> hs = new HashSet<>();
        int i = 0, max = 0;

        for (int j = 0; j < str.length(); j++)
        {
            //Extracting each character
            char ch = str.charAt(j);

            //Shrink window
            if (hs.contains(ch))
            {
                //Start removing chars from left till duplicate char is found
                while (hs.contains(ch))
                {
                    hs.remove(str.charAt(i));
                    i++;
                }
            }

            //Expand window
            hs.add(ch);

            //Update max
            max = Math.max(max, j - i + 1);
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