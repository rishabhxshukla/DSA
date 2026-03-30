/*
Program to print all the permutations of a given string
Example : ABC => ABC  ACB  BAC  BCA  CAB  CBA

permutations("ABC", "")
├── pick A → permutations("BC", "A")
│   ├── pick B → permutations("C", "AB")
│   │   └── pick C → permutations("", "ABC")  //print
│   └── pick C → permutations("B", "AC")
│       └── pick B → permutations("", "ACB")  //print
│
├── pick B → permutations("AC", "B")
│   ├── pick A → permutations("C", "BA")
│   │   └── pick C → permutations("", "BAC")  //print
│   └── pick C → permutations("A", "BC")
│       └── pick A → permutations("", "BCA")  //print
│
└── pick C → permutations("AB", "C")
    ├── pick A → permutations("B", "CA")
    │   └── pick B → permutations("", "CAB")  //print
    └── pick B → permutations("A", "CB")
        └── pick A → permutations("", "CBA")  //print
*/
// O(N × N!)

package Recursion.Questions.String;
import java.io.*;

class PermutationsPrint
{
    static void permutations(String str, String ans)
    {
        //Base case
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++)
        {
            //Pick the current character
            char ch = str.charAt(i);

            /* Remove the picked character from the string
               substring(0, i)  → characters before index i
               substring(i + 1) → characters after index i */
            String rest = str.substring(0, i) + str.substring(i + 1);

            //Add current char to ans & recurse with remaining characters
            permutations(rest, ans + ch);
        }
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the permutations
        System.out.print("Permutations of string : ");
        permutations(str, "");
    }
}