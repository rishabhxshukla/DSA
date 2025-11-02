// Check if a Linked List is palindrome using a stack

package Stack.Questions;
import java.io.*;
import java.util.*;

class PalindromeLL
{
    static LinkedList<Integer> ll = new LinkedList<>();


    /* Function to reverse the stack */
    static boolean isPalindrome()
    {
        Stack<Integer> s = new Stack<>();

        //Push elements into the stack
        for (int i = 0; i < ll.size(); i++)
        {
            s.push(ll.get(i));
        }

        //Pop each element & Compare with LL
        for (int i = 0; i < s.size(); i++)
        {
            if (ll.get(i) != s.pop()) {
                return false;
            }
        }

        return true;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the linked list
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter the element : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        //Printing the stack
        System.out.println("\n*** Created Linked List ***");
        System.out.println(ll);

        //Checking if LL is palindrome
        System.out.println("\nisPalindrome : " + isPalindrome());
    }
}