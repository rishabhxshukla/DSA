// Find the reverse of a given number

package Stack.Questions;
import java.io.*;
import java.util.*;

class NumberReverse
{
    static Stack<Integer> s = new Stack<>();


    /* Function to find the reverse a number */
    static int reverse(int num)
    {
        int rem, sum = 0;

        //Pushing the digits into the stack
        for (int i = num; i > 0; i = i/10)
        {
            rem = i % 10;
            s.push(rem);
        }

        //Popping the digits from the stack
        int i = 1;
        while (!s.isEmpty())
        {
            sum = sum + (s.peek() * i);
            i = i * 10;
            s.pop();
        }

        return sum;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int num = Integer.parseInt(b.readLine());

        //Printing the reversed number
        System.out.print("Reverse of the number : " + reverse(num));
    }
}