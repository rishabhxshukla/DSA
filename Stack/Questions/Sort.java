// Sort a stack without modifying the original one.

package Stack.Questions;
import java.io.*;
import java.util.*;

class Sort
{
    static Stack<Integer> s = new Stack<>();
    static Stack<Integer> ans = new Stack<>();


    /* Function to sort the given stack */
    void sort()
    {
        //Copying original stack into temp stack
        Stack<Integer> temp = new Stack<>();
        temp.addAll(s);

        while (!temp.isEmpty())
        {
            //Top element from temp
            int stkTop = temp.pop();

            while (!ans.isEmpty() && stkTop < ans.peek())
            {
                //Move elements from sorted stack back to temp if they are larger
                temp.push(ans.pop());
            }

            //Otherwise, insert the current element into the correct position
            ans.push(stkTop);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating objects of the class
        Sort obj = new Sort();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the stack
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            s.push(d);
        }

        //Printing original stack
        System.out.println("\n*** Original Stack ***");
        System.out.println(s);

        //Sorting the stack
        System.out.println("\nSorting the Stack...");
        obj.sort();

        //Printing new stack
        System.out.println("\n*** New Stack ***");
        System.out.println(ans);
    }
}