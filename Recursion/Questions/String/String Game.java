/*
Find the K-th Character in String Game I
Start with the string "a".
Repeat the following operation until the string length is at least k :
  - Create a new string by shifting each character to the next English alphabet letter
  (a → b, b → c, ... z → a).
  - Append this new string to the original string.
Return the character present at the k-th position (1-based index) in the generated string.

Example :
Input: k = 5
Output: 'b'
Explanation:
"a"
→ "ab"
→ "abbc"
→ "abbcbccd"
The 5th character is 'b'
*/
// O(k)

package Recursion.Questions.String;
import java.io.*;

class StringGame
{
    static String word = "a";
    static int k = 5;


    static String generateWord(String word, int k)
    {
        StringBuilder sb = new StringBuilder();

        //Base case: Stop once you have enough characters
        if (word.length() >= k) {
            return word;
        }

        //Build the transformed string by shifting each character to next alphabet
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);

            //Wrap z → a
            if (ch == 'z') {
                sb.append("a");
            }
            //Shift character
            else {
                sb.append((char) (ch + 1));
            }
        }

        //Append generated string to the original word
        return generateWord(word + sb.toString(), k);
    }


    public static void main(String args[])
    {
        //Generating the string
        String str = generateWord(word, k);

        //Printing the result
        System.out.print("Char at Kth position : ");
        System.out.println(str.charAt(k - 1));
    }
}