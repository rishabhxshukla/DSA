/*
You are keeping the scores for a baseball game with strange rules.
At the beginning of the game, you start with an empty record (scoreboard).
You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record.
Return the sum of all the scores on the record after applying all the operations.

Variables :
    An integer x :
        Record a new score of x.
    '+' :
        Record a new score that is the sum of the previous two scores.
    'D' :
        Record a new score that is the double of the previous score.
    'C' :
        Invalidate the previous score, removing it from the record.

Example :
Input: ops = ["5", "-2", "4", "C", "D", "9", "+", "+"]
Output: 27
Explanation:
"5" - Add 5 to the record, record is now [5].
"-2" - Add -2 to the record, record is now [5, -2].
"4" - Add 4 to the record, record is now [5, -2, 4].
"C" - Invalidate and remove the previous score, record is now [5, -2].
"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
"9" - Add 9 to the record, record is now [5, -2, -4, 9].
"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.

STEPS :
1) Scan each character.
2) If it's a number, push it in the stack.
3) If it's something else, remove last number from the stack and perform operation.
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class BaseballGame
{
    static Stack<Integer> s = new Stack<>();
    static String ops[] = {"5", "-2", "4", "C", "D", "9", "+", "+"};


    /* Utility function to perform operations */
    static void performOperation(String op)
    {
        //Keep previous 2 scores, and add a new score
        if (op.equals("+")) {
            int num1 = s.pop();
            int num2 = s.peek();
            s.push(num1);
            s.push(num1 + num2);
        }
        //Keep previous score, and add double of previous score
        else if (op.equals("D")) {
            int num = s.peek();
            s.push(2 * num);
        }
        //Remove previous score
        else if (op.equals("C")) {
            s.pop();
        }
    }


    /* Function to calculate final score of the game */
    static int score()
    {
        for (int i = 0; i < ops.length; i++)
        {
            String e = ops[i];

            //If element is a number, push it in stack
            if (Character.isDigit(e.charAt(0)) || e.charAt(0) == '-')
            {
                s.push(Integer.parseInt(e));
            }
            //If element is something else, perform operation
            else
            {
                performOperation(e);
            }
        }

        //Calculating the final score present in stack
        int score = 0;
        while (!s.isEmpty())
        {
            score = score + s.pop();
        }

        return score;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        BaseballGame obj = new BaseballGame();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Calculating the final score
        System.out.print("Final score : " + score());
    }
}