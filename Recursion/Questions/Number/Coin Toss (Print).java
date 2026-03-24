/*
Program to print all possible outcomes of N coin tosses
3 coins : HHH, HHT, HTH, HTT, THH, THT, TTH, TTT

toss(3, "")
├── H → toss(2, "H")
│   ├── H → toss(1, "HH")
│   │   ├── H → toss(0, "HHH")   //print
│   │   └── T → toss(0, "HHT")   //print
│   │
│   └── T → toss(1, "HT")
│       ├── H → toss(0, "HTH")   //print
│       └── T → toss(0, "HTT")   //print
│
└── T → toss(2, "T")
    ├── H → toss(1, "TH")
    │   ├── H → toss(0, "THH")   //print
    │   └── T → toss(0, "THT")   //print
    │
    └── T → toss(1, "TT")
        ├── H → toss(0, "TTH")   //print
        └── T → toss(0, "TTT")   //print
*/
// O(2)ⁿ

package Recursion.Questions.Number;
import java.io.*;

class CoinTossPrint
{
    static void toss(int n, String ans)
    {
        //Base case
        if (n == 0) {
            System.out.print(ans + ", ");
            return;
        }

        toss(n - 1, ans + "H");   //Left subtree (H)
        toss(n - 1, ans + "T");   //Right subtree (T)
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        toss(n, "");
    }
}