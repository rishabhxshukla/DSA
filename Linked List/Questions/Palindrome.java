// Check if a linked list is palindrome or not

package LinkedList.Questions;
import java.io.*;
import java.util.Stack;

class Palindrome
{
    static Node head;
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    /* Printing the LL */
    void print()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* Creating the LL */
    void add(int d)
    {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }


    /* Function to check for palindrome */
    static boolean isPalindrome()
    {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        boolean ans = false;

        //Pushing nodes in stack
        while (temp != null)
        {
            stack.push(temp.data);
            temp = temp.next;
        }

        //Checking for palindrome
        temp = head;    //Reassigning temp
        while (temp != null)
        {
            if (temp.data == stack.pop()) {
                ans = true;
            }
            else {
                ans = false;
            }

            temp = temp.next;
        }

        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Palindrome ll = new Palindrome();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        //Printing the LL
        System.out.println("Created Linked List :");
        ll.print();

        //Printing the result
        System.out.println("\nisPalindrome : " + isPalindrome());
    }
}