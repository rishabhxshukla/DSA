/*
Print all possible strings of length k that can be formed from a given character array.
Example :
Input: arr[] = {'a', 'b'}, k = 3
Output: aaa, aab, aba, abb, baa, bab, bba, bbb

permutations("")
├── pick 'a' → permutations("a")
│   ├── pick 'a' → permutations("aa")
│   │   ├── pick 'a' → permutations("aaa")  //print
│   │   └── pick 'b' → permutations("aab")  //print
│   └── pick 'b' → permutations("ab")
│       ├── pick 'a' → permutations("aba")  //print
│       └── pick 'b' → permutations("abb")  //print
│
└── pick 'b' → permutations("b")
    ├── pick 'a' → permutations("ba")
    │   ├── pick 'a' → permutations("baa")  //print
    │   └── pick 'b' → permutations("bab")  //print
    └── pick 'b' → permutations("bb")
        ├── pick 'a' → permutations("bba")  //print
        └── pick 'b' → permutations("bbb")  //print
*/
// O(size of arr)^k -> O(N)^K

package Recursion.Questions.String;
import java.io.*;

class CharPermutationsPrint
{
    static char arr[] = {'a', 'b'};
    static int k = 3;

    static void permutations(char arr[], String ans)
    {
        //Base case
        if (ans.length() == k) {
            System.out.print(ans + ", ");
            return;
        }

        for (int i = 0; i < arr.length; i++)
        {
            //Pick the current character
            char ch = arr[i];

            //Add current char to ans & recurse for remaining chars
            permutations(arr, ans + ch);
        }
    }


    public static void main(String args[])
    {
        //Printing the permutations
        System.out.print("Permutations : ");
        permutations(arr, "");
    }
}