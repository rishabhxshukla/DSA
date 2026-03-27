/*
Program to print all possible ways to climb N stairs
Allowed steps : 1, 2, 3

climb(3, "")
├── take 1 → climb(2, "1")
│   ├── take 1 → climb(1, "11")
│   │   ├── take 1 → climb(0, "111")   //print
│   │   ├── take 2 → climb(-1, "112")  //invalid
│   │   └── take 3 → climb(-2, "113")  //invalid
│   │
│   ├── take 2 → climb(0, "12")        //print
│   └── take 3 → climb(-1, "13")       //invalid
│
├── take 2 → climb(1, "2")
│   ├── take 1 → climb(0, "21")        //print
│   ├── take 2 → climb(-1, "22")       //invalid
│   └── take 3 → climb(-2, "23")       //invalid
│
└── take 3 → climb(0, "3")             //print
*/
// O(steps)ⁿ -> O(3)ⁿ

package Recursion.Questions.Number;
import java.io.*;

class ClimbingStairsPrint
{
    static void climb(int n, String ans)
    {
        //Reached exactly N steps -> valid path
        if (n == 0) {
            System.out.print(ans + ", ");
            return;
        }

        //Crossed N steps -> invalid path
        if (n < 0) {
            return;
        }

        //Take 1, 2, or 3 steps
        climb(n - 1, ans + "1");
        climb(n - 2, ans + "2");
        climb(n - 3, ans + "3");
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        climb(n, "");
    }
}