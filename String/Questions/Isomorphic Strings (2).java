/*
Given two strings s and t of same length, determine if they are isomorphic or not.
Two strings are isomorphic if the characters in s can be replaced to get t.
No two characters may map to the same character, but a character may map to itself.

Example 1 :
Input: s = "dad", t = "mom"
Output: true
Explanation:
The strings s and t can be made identical by:
    Mapping 'd' to 'm'.
    Mapping 'a' to 'o'.

Example 2 :
Input: s = "a11", t = "b23"
Output: false
Explanation:
The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.
*/
// 2 HASHMAPS (two-way mapping) -> O(N)

package String.Questions;
import java.io.*;
import java.util.*;

class IsomorphicStrings2
{
    /* Function to check if the given strings are isomorphic */
    static boolean isIsomorphic(String str1, String str2)
    {
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++)
        {
            //Extracting characters from both strings
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            //Forward mapping :
            //If 1st HashMap contains the key, its value must match with ch2
            if (hm1.containsKey(ch1) && hm1.get(ch1) != ch2) {
                return false;
            }

            //Reverse mapping :
            //If 2nd HashMap contains the key, its value must match with ch1
            if (hm2.containsKey(ch2) && hm2.get(ch2) != ch1) {
                return false;
            }

            //Add the pair to both HashMaps
            hm1.put(ch1, ch2);
            hm2.put(ch2, ch1);

            System.out.println(hm1 + " -> " + hm2);
        }

        return true;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the 1st string : ");
        String str1 = b.readLine();
        System.out.print("Enter the 2nd string : ");
        String str2 = b.readLine();

        //Checking if strings are isomorphic or not
        System.out.print("isIsomorphic : " + isIsomorphic(str1, str2));
    }
}