// Reverse a stack

package Stack.Questions;
import java.io.*;
import java.util.*;

class Reverse
{
    static Stack<Integer> s = new Stack<>();


    /* Function to reverse the stack */
    void reverse()
    {
        //Using a temp stack to store the elements
        Stack<Integer> temp = new Stack<>();

        while (!s.isEmpty())
        {
            temp.push(s.pop());
        }

        s = temp;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Reverse obj = new Reverse();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the stack
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter the element : ");
            int d = Integer.parseInt(b.readLine());
            s.push(d);
        }

        //Printing original stack
        System.out.println("\n*** Original Stack ***");
        System.out.println(s);

        //Reversing the stack
        System.out.println("\nReversing the stack...");
        obj.reverse();

        //Printing new stack
        System.out.println("\n*** New Stack ***");
        System.out.println(s);
    }
}