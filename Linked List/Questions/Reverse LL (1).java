// Reverse a linked list
// STACK

package LinkedList.Questions;
import java.io.*;
import java.util.Stack;

class ReverseLL1
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


    /* Function to reverse the LL */
    void reverse()
    {
        Stack<Integer> stack = new Stack<>();

        //Push all the nodes into the stack
        Node temp = head;
        while (temp != null)
        {
            stack.push(temp.data);
            temp = temp.next;
        }

        //Pop data from stack and assign it back to the nodes
        temp = head;
        while (temp != null)
        {
            temp.data = stack.pop();
            temp = temp.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ReverseLL1 ll = new ReverseLL1();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i = 1; i <= 5; i++)
        {
            ll.create(i);
        }

        //Printing original LL
        System.out.println("*** Created Linked List ***");
        ll.print();

        //Reversing the LL
        System.out.print("\nReversing Linked List...");
        ll.reverse();

        //Printing new LL
        System.out.println("\n*** New Linked List ***");
        ll.print();
    }
}