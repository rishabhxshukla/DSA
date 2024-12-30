// Reverse a linked list
// RECURSION

package LinkedList.Questions;
import java.io.*;

class ReverseLL3
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
    Node reverse(Node temp)
    {
        //Base case: If list is empty or has only one node
        if (temp == null || temp.next == null) {
            return temp;
        }

        //Reverse the rest of the list
        Node newHead = reverse(temp.next);

        //Rearrange the current node's pointers
        Node front = temp.next;
        front.next = temp;
        temp.next = null;

        //Return the new head of the reversed list
        return newHead;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ReverseLL3 ll = new ReverseLL3();
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
        head = ll.reverse(head);

        //Printing new LL
        System.out.println("\n*** New Linked List ***");
        ll.print();
    }
}