package LinkedList.DoublyLL.Insertion;
import java.io.*;

class Beginning
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


    /* Inserting new node at the beginning */
    void insert(int d)
    {
        //Allocating memory for new node
        Node new_node = new Node(d);

        //If LL is empty
        if(head == null) {
            head = new_node;
            return;
        }

        //New node points to the original head
        new_node.next = head;
        //Old head's previous pointer now points to the new node
        head.prev = new_node;
        //New node becomes the new head
        head = new_node;
    }


    public static void main(String args[]) throws IOException
    {
        /* Creating object of the class */
        Beginning ll = new Beginning();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        /* Creating the LL */
        for (int i = 1; i <= 5; i++)
        {
            ll.create(i);
        }

        /* Original LL */
        System.out.println("*** Original Linked List ***");
        ll.print();

        /* Inserting value */
        System.out.print("\nEnter data to be inserted at the beginning : ");
        int d = Integer.parseInt(b.readLine());
        ll.insert(d);

        /* New LL */
        System.out.println("*** New Linked List ***");
        ll.print();
    }
}