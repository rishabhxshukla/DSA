/*
Reverse a linked list
STEPS :
1) Initialize 3 pointers back = null, temp = head, and front = null.
2) Iterate through the linked list.
3) Follow these steps -
   a) Store the next node : front = temp.next
   b) Point temp to the previous node : temp.next = back
   c) Update back and temp variables : back = temp, temp = front
*/
// REVERSE LINKS (3 POINTERS)

package LinkedList.Questions;
import java.io.*;

class ReverseLL2
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
        Node back = null;
        Node temp = head;
        Node front = null;

        while (temp != null)
        {
            front = temp.next;
            temp.next = back;

            back = temp;
            temp = front;
        }

        //Changing the head node
        head = back;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ReverseLL2 ll = new ReverseLL2();
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