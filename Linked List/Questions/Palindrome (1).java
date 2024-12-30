// Check if a linked list is palindrome or not
// STACK

package LinkedList.Questions;
import java.io.*;
import java.util.Stack;

class Palindrome1
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


    /* Creating the LL */
    void create(int data)
    {
        Node new_node = new Node(data);

        if(head == null) {
            head = new_node;
            return;
        }

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = new_node;
        new_node.next = null;
    }


    /* Printing the LL */
    void print()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* Function to check for palindrome */
    static boolean isPalindrome()
    {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        //Pushing nodes in stack
        while (temp != null)
        {
            stack.push(temp.data);
            temp = temp.next;
        }

        //Checking for palindrome
        temp = head;
        while (temp != null)
        {
            if (temp.data != stack.pop()) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Palindrome1 ll = new Palindrome1();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i = 1; i <= 5; i++)
        {
            ll.create(i);
        }
        for (int i = 4; i >= 1; i--)
        {
            ll.create(i);
        }

        //Printing the LL
        System.out.println("*** Created Linked List ***");
        ll.print();

        //Printing the result
        System.out.println("\nisPalindrome : " + isPalindrome());
    }
}