/*
Program to count all the permutations of a given string
Example : ABC => ABC  ACB  BAC  BCA  CAB  CBA

permutations("ABC", "")
├── pick A → permutations("BC", "A")
│   ├── pick B → permutations("C", "AB")
│   │   └── pick C → permutations("", "ABC")  //count
│   └── pick C → permutations("B", "AC")
│       └── pick B → permutations("", "ACB")  //count
│
├── pick B → permutations("AC", "B")
│   ├── pick A → permutations("C", "BA")
│   │   └── pick C → permutations("", "BAC")  //count
│   └── pick C → permutations("A", "BC")
│       └── pick A → permutations("", "BCA")  //count
│
└── pick C → permutations("AB", "C")
    ├── pick A → permutations("B", "CA")
    │   └── pick B → permutations("", "CAB")  //count
    └── pick B → permutations("A", "CB")
        └── pick A → permutations("", "CBA")  //count
*/
// O(N × N!)

package Recursion.Questions.String;
import java.io.*;

class PermutationsCount
{
    static int permutations(String str)
    {
        int count = 0;

        //Base case
        if (str.length() == 0) {
            return 1;
        }

        for (int i = 0; i < str.length(); i++)
        {
            //Pick the current character
            char ch = str.charAt(i);

            /* Remove the picked character from the string
               substring(0, i)  → characters before index i
               substring(i + 1) → characters after index i */
            String rest = str.substring(0, i) + str.substring(i + 1);

            //Increment count & recurse with remaining characters
            count = count + permutations(rest);
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the permutations
        System.out.print("Permutations count : " + permutations(str));
    }
}