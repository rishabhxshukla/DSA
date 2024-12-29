// Reverse a doubly linked list
// SWAP LINKS

package LinkedList.Questions;
import java.io.*;

class ReverseDLL2
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
        new_node.prev = temp;
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


    /* Function to reverse the DLL */
    void reverse()
    {
        Node temp = head;
        Node t = null;

        while (temp != null)
        {
            //Swap prev and next for all nodes
            //1 <-> 2 <-> 3 <-> 4
            t = temp.prev;
            temp.prev = temp.next;
            temp.next = t;

            //Moving to the next node (which is prev due to swapping)
            temp = temp.prev;
        }

        //Reset head to the last node
        head = t.prev;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ReverseDLL2 ll = new ReverseDLL2();
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