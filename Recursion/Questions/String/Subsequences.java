/*
Program to print all subsequences of a given string

STEPS :
1) Include
2) Recurse
3) Backtrack
4) Exclude

                    ""
              /            \
            A                ""
         /     \          /      \
       AB       A        B        ""
      /  \     / \      / \      / \
   ABC  AB   AC  A    BC  B     C   ""
*/
// O(N * 2ᴺ)

package Recursion.Questions.String;
import java.util.*;

class Subsequences
{
    static String str = "ABC";


    static void subsequence(int i, StringBuilder ans)
    {
        //Base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        //Choice 1: Include current char
        ans.append(str.charAt(i));
        subsequence(i + 1, ans);

        //Backtrack: Remove last added char
        ans.deleteCharAt(ans.length() - 1);

        //Choice 2: Exclude current char
        subsequence(i + 1, ans);
    }


    public static void main(String args[])
    {
        //Printing the string
        System.out.println("String : " + str);

        //Start recursion from index 0
        System.out.println("Subsequences : ");
        subsequence(0, new StringBuilder());
    }
}