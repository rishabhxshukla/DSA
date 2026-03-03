/*
Longest Repeating Character Replacement
You are given a string str and an integer k.
You can choose any character of the string and change it to any other uppercase English character.
You can perform this operation at most k times.
Return the length of the longest substring containing the same letter you can get after performing the above operations.

Example 1 :
Input: str = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

Example 2 :
Input: str = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exist other ways to achieve this answer too.
*/
// NESTED LOOPS -> SLIDING WINDOW -> O(N)²

package Array.Questions;
import java.io.*;
import java.util.*;

class LongestRepeatingCharacterReplacement1
{
    static String str = "AABABBA";
    static int k = 1;


    /* Function to find the length of longest substring after character replacement */
    static int longestSubstring()
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        int max = 0;

        for (int i = 0; i < str.length(); i++)
        {
            //Reinitialize HashMap & maxFreq for every window
            hm.clear();
            int maxFreq = 0;

            //Sliding window starting from ith index
            for (int j = i; j < str.length(); j++)
            {
                //Update frequency of current character
                char ch = str.charAt(j);
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);

                //Track the most common character in current substring
                maxFreq = Math.max(maxFreq, hm.get(ch));

                int windowSize = j - i + 1;
                int changes = windowSize - maxFreq;

                //Check if we can make all characters same
                if (changes <= k) {
                    max = Math.max(max, j - i + 1);
                }
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