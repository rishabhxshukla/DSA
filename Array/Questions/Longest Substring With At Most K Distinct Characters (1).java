/*
Longest Substring with At Most K Distinct Characters
Given a string str and an integer k, find the length of the longest substring that contains at most k distinct characters.
A substring is a contiguous sequence of characters within a string.

Example 1 :
Input:  str = "aaabbbccd", k = 2
Output: 6
Explanation: The longest substrings with at most 2 distinct characters are
"aaabbb" and "bbbccd". Both have length 6.

Example 2 :
Input:  str = "eceba", k = 2
Output: 3
Explanation: The substring "ece" has at most 2 distinct characters.
*/
// NESTED LOOPS -> SLIDING WINDOW -> O(N)²

package Array.Questions;
import java.util.*;

class LongestSubstringWithAtMostKDistinctCharacters1
{
    static String str = "aaabbbccd";
    static int k = 2;


    /* Function to find the longest substring with at most k distinct characters */
    static int longestSubstring()
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        int max = 0;

        for (int i = 0; i < str.length(); i++)
        {
            //Reinitialize HashMap for every window
            hm.clear();

            //Sliding window starting from ith index
            for (int j = i; j < str.length(); j++)
            {
                //Extracting each character
                char ch = str.charAt(j);

                //Add char to HashMap
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);

                //If duplicate char found, break the loop
                if (hm.size() > k) {
                    break;
                }

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