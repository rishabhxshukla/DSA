/*
Program to count all valid combinations of n pairs of parentheses.

parenthesis(3, 0, 0, "")
├── '(' → parenthesis(3, 1, 0, "(")
│   ├── '(' → parenthesis(3, 2, 0, "((")
│   │   ├── '(' → parenthesis(3, 3, 0, "(((")
│   │   │   └── ')' → parenthesis(3, 3, 1, "((()")
│   │   │       └── ')' → parenthesis(3, 3, 2, "((())")
│   │   │           └── ')' → parenthesis(3, 3, 3, "((()))")   //count
│   │   │
│   │   └── ')' → parenthesis(3, 2, 1, "(()")
│   │       ├── '(' → parenthesis(3, 3, 1, "(()(")
│   │       │   └── ')' → parenthesis(3, 3, 2, "(()()")
│   │       │       └── ')' → parenthesis(3, 3, 3, "(()())")   //count
│   │       │
│   │       └── ')' → parenthesis(3, 2, 2, "(())")
│   │           └── '(' → parenthesis(3, 3, 2, "(())(")
│   │               └── ')' → parenthesis(3, 3, 3, "(())()")  //count
│   │
│   └── ')' → parenthesis(3, 1, 1, "()")
│       ├── '(' → parenthesis(3, 2, 1, "()(")
│       │   ├── '(' → parenthesis(3, 3, 1, "()((")
│       │   │   └── ')' → parenthesis(3, 3, 2, "()(()")
│       │   │       └── ')' → parenthesis(3, 3, 3, "()(())")  //count
│       │   │
│       │   └── ')' → parenthesis(3, 2, 2, "()()")
│       │       └── '(' → parenthesis(3, 3, 2, "()()(")
│       │           └── ')' → parenthesis(3, 3, 3, "()()()")  //count
│       │
│       └── ')' → X invalid (close > open)
│
└── ')' → X invalid (close > open)
*/
// O(Cn), where C is Catalan number

package Recursion.Questions.Number;
import java.io.*;

class ValidParenthesisCount
{
    /*
     n     : total number of pairs of parentheses
     open  : number of '(' used so far
     close : number of ')' used so far
    */
    static int parenthesis(int n, int open, int close)
    {
        //Base case: All opening & closing parentheses have been used
        if (open == n && close == n) {
            return 1;
        }

        //Invalid: Too many parentheses or wrong ordering
        if (open > n || close > n  || close > open) {
            return 0;
        }

        int opening = parenthesis(n, open + 1, close);   //Left subtree '('
        int closing = parenthesis(n, open, close + 1);   //Right subtree ')'

        return (opening + closing);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.print("Parenthesis count : " + parenthesis(n, 0, 0));
    }
}