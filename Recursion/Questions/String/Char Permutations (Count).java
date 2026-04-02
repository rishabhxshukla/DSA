/*
Count all possible strings of length k that can be formed from a given character array.
Example :
Input: arr[] = {'a', 'b'}, k = 3
Output: 8 [aaa, aab, aba, abb, baa, bab, bba, bbb]

permutations("")
├── pick 'a' → permutations("a")
│   ├── pick 'a' → permutations("aa")
│   │   ├── pick 'a' → permutations("aaa")  //count
│   │   └── pick 'b' → permutations("aab")  //count
│   └── pick 'b' → permutations("ab")
│       ├── pick 'a' → permutations("aba")  //count
│       └── pick 'b' → permutations("abb")  //count
│
└── pick 'b' → permutations("b")
    ├── pick 'a' → permutations("ba")
    │   ├── pick 'a' → permutations("baa")  //count
    │   └── pick 'b' → permutations("bab")  //count
    └── pick 'b' → permutations("bb")
        ├── pick 'a' → permutations("bba")  //count
        └── pick 'b' → permutations("bbb")  //count
*/
// O(size of arr)^k -> O(N)^K

package Recursion.Questions.String;
import java.io.*;

class CharPermutationsCount
{
    static char arr[] = {'a', 'b'};
    static int k = 3;

    static int permutations(char arr[], String ans)
    {
        int count = 0;

        //Base case
        if (ans.length() == k) {
            return 1;
        }

        for (int i = 0; i < arr.length; i++)
        {
            //Pick the current character
            char ch = arr[i];

            //Increment count & recurse for remaining chars
            count = count + permutations(arr, ans + ch);
        }

        return count;
    }


    public static void main(String args[])
    {
        //Printing the permutations count
        System.out.print("Permutations count : " + permutations(arr, ""));
    }
}