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
// SLIDING WINDOW -> O(N)

package Array.Questions;
import java.util.*;

class LongestSubstringWithAtMostKDistinctCharacters2
{
    static String str = "aaabbbccd";
    static int k = 2;


    /* Function to find the longest substring with at most k distinct characters */
    static int longestSubstring()
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0, max = 0;

        for (int j = 0; j < str.length(); j++)
        {
            //Expand window
            char ch = str.charAt(j);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

            //Shrink window
            if (hm.size() > k)
            {
                //Start removing chars from left till HashMap size > k
                while (hm.size() > k)
                {
                    char leftCh = str.charAt(i);

                    //Decrease freq
                    hm.put(leftCh, hm.get(leftCh) - 1);

                    //If freq is 0, remove char
                    if (hm.get(leftCh) == 0) {
                        hm.remove(leftCh);
                    }

                    i++;
                }
            }

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