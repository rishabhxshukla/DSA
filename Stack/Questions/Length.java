// Find the length of a stack

package Stack.Questions;
import java.io.*;
import java.util.*;

class Length
{
    static Stack<Integer> s = new Stack<>();


    /* Function to find the length of stack */
    static int length()
    {
        int count = 0;

        for (int i = 0; i <= s.size(); i++)
        {
            count++;
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the stack
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter the element : ");
            int d = Integer.parseInt(b.readLine());
            s.push(d);
        }

        //Printing the stack
        System.out.println("\nCreated Stack : " + s);

        //Printing the length of stack
        System.out.println("\nLength of stack is : " + length());
    }
}