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