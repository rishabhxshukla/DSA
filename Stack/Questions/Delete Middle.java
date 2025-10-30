// Delete the middle element of a stack

package Stack.Questions;
import java.io.*;
import java.util.*;

class DeleteMiddle
{
    static Stack<Integer> s = new Stack<>();


    /* Function to delete the middle element */
    void deleteMiddle()
    {
        Stack<Integer> temp = new Stack<>();
        int mid = s.size()/2;
        int count = 0;

        //Storing elements in a temporary stack until mid is found
        while (count != mid)
        {
            temp.push(s.pop());
            count++;
        }

        //Popping out middle element
        s.pop();

        //Placing elements back to the main stack from temp stack
        while (!temp.isEmpty())
        {
            s.push(temp.pop());
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        DeleteMiddle obj = new DeleteMiddle();
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

        //Deleting middle element
        System.out.println("\nDeleting middle element...");
        obj.deleteMiddle();

        //Printing new stack
        System.out.println("\n*** New Stack ***");
        System.out.println(s);
    }
}