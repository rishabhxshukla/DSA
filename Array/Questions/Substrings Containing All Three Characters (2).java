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
// SLIDING WINDOW -> O(N)

package Array.Questions;
import java.io.*;
import java.util.*;

class SubstringsContainingAllThreeCharacters2
{
    static String str = "abcabc";


    /* Function to find the no. of substrings containing all 3 characters */
    static int numberOfSubstrings()
    {
        int i = 0, count = 0;
        int countA = 0, countB = 0, countC = 0;

        for (int j = 0; j < str.length(); j++)
        {
            //Expand window
            char ch = str.charAt(j);
            if (ch == 'a') {
                countA++;
            }
            else if (ch == 'b') {
                countB++;
            }
            else {
                countC++;
            }

            //When current window contains at least one a, b, c
            while (countA > 0 && countB > 0 && countC > 0)
            {
                //Update main count
                count = count + (str.length() - j);

                //Shrink window
                char leftCh = str.charAt(i);
                if (leftCh == 'a') {
                    countA--;
                }
                else if (leftCh == 'b') {
                    countB--;
                }
                else {
                    countC--;
                }

                i++;
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