// Reverse a doubly linked list
// STACK

package LinkedList.Questions;
import java.io.*;
import java.util.Stack;

class ReverseDLL1
{
    static Node head;
    static class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.prev = null;
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
        //If LL is empty
        if (head == null) {
            Node new_node = new Node(d);
            head = new_node;
            return;
        }

        Node new_node = new Node(d);
        new_node.next = head;
        head.prev = new_node;
        head = new_node;
    }


    /* Function to reverse the DLL */
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
        ReverseDLL1 ll = new ReverseDLL1();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        //Printing original LL
        System.out.println("Created Linked List : ");
        ll.print();

        //Reversing the LL
        System.out.print("\nReversing Linked List...");
        ll.reverse();

        //Printing new LL
        System.out.println("\nNew Linked List : ");
        ll.print();
    }
}