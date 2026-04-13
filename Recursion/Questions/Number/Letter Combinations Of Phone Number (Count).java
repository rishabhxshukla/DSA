/*
Letter Combinations of a Phone Number
Given a string containing digits from 2-9, return the count of all possible letter combinations that the number could represent.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
Telephone Keypad Mapping :
   ┌─────┬─────┬─────┐
   │  1  │  2  │  3  │
   │     │ abc │ def │
   ├─────┼─────┼─────┤
   │  4  │  5  │  6  │
   │ ghi │ jkl │ mno │
   ├─────┼─────┼─────┤
   │  7  │  8  │  9  │
   │pqrs │ tuv │wxyz │
   └─────┴─────┴─────┘

Example 1 :
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2 :
Input: digits = "2"
Output: ["a","b","c"]

combinations("23", "")
│
├── take 'a' from "abc"
│   └── combinations("3", "a")
│       ├── take 'd'
│       │   └── combinations("", "ad")  → add "ad"  //count
│       ├── take 'e'
│       │   └── combinations("", "ae")  → add "ae"  //count
│       └── take 'f'
│           └── combinations("", "af")  → add "af"  //count
│
├── take 'b' from "abc"
│   └── combinations("3", "b")
│       ├── take 'd'
│       │   └── combinations("", "bd")  → add "bd"  //count
│       ├── take 'e'
│       │   └── combinations("", "be")  → add "be"  //count
│       └── take 'f'
│           └── combinations("", "bf")  → add "bf"  //count
│
└── take 'c' from "abc"
    └── combinations("3", "c")
        ├── take 'd'
        │   └── combinations("", "cd")  → add "cd"  //count
        ├── take 'e'
        │   └── combinations("", "ce")  → add "ce"  //count
        └── take 'f'
            └── combinations("", "cf")  → add "cf"  //count
*/
// O(3)^[(n−m) X 4^m)], worst case: O(4^n), where n is digits length and m is count of digits 7 or 9

package Recursion.Questions.Number;
import java.io.*;
import java.util.*;

class LetterCombinationsOfPhoneNumberCount
{
    static HashMap<Integer, String> hm = createHashMap();

    /* Function to create the required digit-to-letters mapping */
    static HashMap<Integer, String> createHashMap()
    {
        HashMap<Integer, String> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char j = 'a';

        for (int i = 2; i <= 9; i++)
        {
            //Reinitialize StringBuilder for each digit
            sb.setLength(0);

            while (j <= 'z')
            {
                //Digits 7 and 9 map to 4 letters instead of 3
                if (sb.length() == 3 && (i == 7 || i == 9)) {
                    sb.append(j++);
                    break;
                }

                //Break when string is formed
                if (sb.length() == 3) {
                    break;
                }

                sb.append(j++);
            }

            //Store mapping for current digit
            hm.put(i, sb.toString());
        }

        return hm;
    }


    /* Recursive function to generate all letter combinations */
    static int combinations(String digits)
    {
        int count = 0;

        //Base case: No digits left
        if (digits.length() == 0) {
            return 1;
        }

        //Edge case: Skip digits that don't have letter mapping
        if (digits.charAt(0) == '0' || digits.charAt(0) == '1') {
            return combinations(digits.substring(1));
        }

        //Fetching string corresponding to the digit
        char d = digits.charAt(0);
        int digit = d - '0';
        String str = hm.get(digit);

        for (int i = 0; i < str.length(); i++)
        {
            //Extracting each character
            char ch = str.charAt(i);

            //Add char to ans & recurse for remaining digits
            count = count + combinations(digits.substring(1));
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        LetterCombinationsOfPhoneNumberCount obj = new LetterCombinationsOfPhoneNumberCount();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the digits : ");
        String digits = b.readLine();

        //Printing the result
        System.out.println("Count : " + combinations(digits));
    }
}