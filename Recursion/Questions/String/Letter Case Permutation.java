/*
Given a string str, you can transform every letter individually to be lowercase or uppercase to create another string.
Return a list of all possible strings we could create. Return the output in any order.

Example :
Input: str = "a1b2"
Output: ["a1b2", "a1B2", "A1b2", "A1B2"]

STEPS :
1) Include
2) Recurse
3) Exclude

                   ""
              /          \
            a              A
            |              |
           a1             A1
         /    \         /    \
      a1b    a1B     A1b    A1B
       |       |       |       |
     a1b2    a1B2    A1b2    A1B2
*/
// O(N * 2ᵏ), where k = number of letters

package Recursion.Questions.String;
import java.util.*;

class LetterCasePermutation
{
    static String str = "a1b2";
    static ArrayList<String> result = new ArrayList<>();


    static void permutation(int i, StringBuilder ans)
    {
        //Base case
        if (i == str.length()) {
            result.add(ans.toString());
            return;
        }

        //Extracting each character
        char ch = str.charAt(i);

        if (Character.isLetter(ch))
        {
            //Lowercase
            ans.append(Character.toLowerCase(ch));
            permutation(i + 1, ans);
            ans.deleteCharAt(ans.length() - 1);

            //Uppercase
            ans.append(Character.toUpperCase(ch));
            permutation(i + 1, ans);
            ans.deleteCharAt(ans.length() - 1);
        }
        else
        {
            //Digit
            ans.append(ch);
            permutation(i + 1, ans);
            ans.deleteCharAt(ans.length() - 1);
        }
    }


    public static void main(String args[])
    {
        //Printing the string
        System.out.println("String : " + str);

        //Start recursion from index 0
        permutation(0, new StringBuilder());
        System.out.println("Letter Case Permutations : " + result);
    }
}