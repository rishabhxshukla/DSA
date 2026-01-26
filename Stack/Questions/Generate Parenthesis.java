/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example :
Input: n = 3
Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class GenerateParenthesis
{
    /* Function to generate N pairs of parenthesis */
    static ArrayList<String> generate(int n)
    {
        ArrayList<String > ans = new ArrayList<>();   //To store all the pairs
        Stack<Character> s = new Stack<>();           //To store the current pair

        //Start recursive generation
        generateHelper(ans, s, 0, 0, n);

        return ans;
    }

    /* Helper function to generate each pair */
    /*
      Only add '(' parenthesis if open < N
      Only add ')' parenthesis if close < open
      Stop adding when open == close == N
    */
    static void generateHelper(ArrayList<String > ans, Stack<Character> s,
                               int open, int close, int n)
    {
        //If we used all '(' and ')', create and return the resultant string
        if (open == n && close == n)
        {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.size(); i++)
            {
                sb.append(s.get(i));
            }

            ans.add(sb.toString());
            return;
        }

        //Add '(' if we still can
        if (open < n)
        {
            s.push('(');
            generateHelper(ans, s, open + 1, close, n);
            s.pop();    //backtrack
        }

        //Add ')' only if valid
        if (close < open)
        {
            s.push(')');
            generateHelper(ans, s, open, close + 1, n);
            s.pop();    //backtrack
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the value of N (<10) : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the output
        System.out.println("Generated pairs : " + generate(n));
    }
}