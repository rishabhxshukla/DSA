/*
Program to count all possible outcomes of N coin tosses
3 coins : HHH, HHT, HTH, HTT, THH, THT, TTH, TTT

toss(3, "")
├── H → toss(2, "H")
│   ├── H → toss(1, "HH")
│   │   ├── H → toss(0, "HHH")   //count
│   │   └── T → toss(0, "HHT")   //count
│   │
│   └── T → toss(1, "HT")
│       ├── H → toss(0, "HTH")   //count
│       └── T → toss(0, "HTT")   //count
│
└── T → toss(2, "T")
    ├── H → toss(1, "TH")
    │   ├── H → toss(0, "THH")   //count
    │   └── T → toss(0, "THT")   //count
    │
    └── T → toss(1, "TT")
        ├── H → toss(0, "TTH")   //count
        └── T → toss(0, "TTT")   //count
*/
// O(2)ⁿ

package Recursion.Questions.Number;
import java.io.*;

class CoinTossCount
{
    static int toss(int n)
    {
        //Base case
        if (n == 0) {
            return 1;
        }

        int left = toss(n - 1);    //Left subtree (H)
        int right = toss(n - 1);   //Right subtree (T)

        return (left + right);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("Count : " + toss(n));
    }
}