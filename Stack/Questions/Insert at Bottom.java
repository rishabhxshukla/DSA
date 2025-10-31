// Write a function to insert an element at the bottom of a stack

package Stack.Questions;
import java.io.*;
import java.util.*;

class InsertBottom
{
    static Stack<Integer> s = new Stack<Integer>();


    /* Function to insert element at the bottom of the stack */
    void insertAtBottom(int k)
    {
        Stack<Integer> temp = new Stack<Integer>();

        //Shifting all elements from main stack to temp stack
        while (!s.isEmpty())
        {
            temp.push(s.pop());
        }

        //Inserting the last element
        s.push(k);

        //Re-shifting all elements from temp stack to main stack
        while (!temp.isEmpty())
        {
            s.push(temp.pop());
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InsertBottom obj = new InsertBottom();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the stack
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            s.push(d);
        }

        //Printing original stack
        System.out.println("\n*** Original Stack ***");
        System.out.println(s);

        //Taking user input
        System.out.print("\nEnter the element that you want to insert : ");
        int k = Integer.parseInt(b.readLine());
        obj.insertAtBottom(k);

        //Printing new stack
        System.out.println("\n*** New Stack ***");
        System.out.println(s);
    }
}