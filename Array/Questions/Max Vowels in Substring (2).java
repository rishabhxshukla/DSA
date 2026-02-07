/*
Maximum number of vowels in a substring
Given a string str and an integer k, return the maximum number of vowel letters in any substring of str with length k.
Vowel letters in English are a, e, i, o, u.

Example 1 :
Input: str = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.

Example 2 :
Input: str = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.

Example 3 :
Input: str = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
*/
// SLIDING WINDOW -> O(N)

package Array.Questions;
import java.io.*;
import java.util.*;

class MaxVowelsInSubstring2
{
    static String str = "leetcode";
    static int k = 3;


    /* Helper function to check if a character is vowel or not */
    static boolean isVowel(char ch)
    {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }


    /* Function to find the maximum number of vowels in the substring */
    static int maxVowels()
    {
        int count = 0, max = 0;

        //First window
        for (int i = 0; i < k; i++)
        {
            char ch = str.charAt(i);

            //Increase count if char is a vowel
            if (isVowel(ch)) {
                count++;
            }
        }

        //1st max is the count of vowels in 1st window
        max = count;

        //Slide the window
        for (int i = k; i < str.length(); i++)
        {
            char ch1 = str.charAt(i - k);    //Front character
            char ch2 = str.charAt(i);        //Back character

            /* Update current count */
            //Decrease count if removed char is a vowel
            if (isVowel(ch1)) {
                count--;
            }
            //Increase count if added char is a vowel
            if (isVowel(ch2)) {
                count++;
            }

            //Update max
            if (count > max) {
                max = count;
            }
        }

        return max;
    }


    public static void main(String args[])
    {
        //Printing the input string
        System.out.println("String : " + str);

        //Printing the result
        System.out.println("Max vowels : " + maxVowels());
    }
}