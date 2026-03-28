/*
Program to count all possible ways to climb N stairs
Allowed steps : 1, 2, 3

climb(3, "")
├── take 1 → climb(2, "1")
│   ├── take 1 → climb(1, "11")
│   │   ├── take 1 → climb(0, "111")   //count
│   │   ├── take 2 → climb(-1, "112")  //invalid
│   │   └── take 3 → climb(-2, "113")  //invalid
│   │
│   ├── take 2 → climb(0, "12")        //count
│   └── take 3 → climb(-1, "13")       //invalid
│
├── take 2 → climb(1, "2")
│   ├── take 1 → climb(0, "21")        //count
│   ├── take 2 → climb(-1, "22")       //invalid
│   └── take 3 → climb(-2, "23")       //invalid
│
└── take 3 → climb(0, "3")             //count
*/
// O(steps)ⁿ -> O(3)ⁿ

package Recursion.Questions.Number;
import java.io.*;

class ClimbingStairsCount
{
    static int climb(int n)
    {
        //Reached exactly N steps -> valid path
        if (n == 0) {
            return 1;
        }

        //Crossed N steps -> invalid path
        if (n < 0) {
            return 0;
        }

        //Take 1, 2, or 3 steps
        int one =  climb(n - 1);
        int two =  climb(n - 2);
        int three = climb(n - 3);

        return (one + two + three);
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("Count : " + climb(n));
    }
}