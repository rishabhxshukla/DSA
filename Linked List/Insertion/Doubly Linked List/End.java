package LinkedList.DoublyLL.Insertion;
import java.io.*;

class End
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

    /* Inserting new node at the end */
    void insert(int data)
    {
        //Allocating memory for new node
        Node new_node = new Node(data);

        //If LL is empty
        if(head == null) {
            head = new_node;
            return;
        }

        //Traversing the LL
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        //Last node points to the newly created node
        temp.next = new_node;
        //New node points to null
        new_node.next = null;
        //New node points to last node
        new_node.prev = temp;
    }


    public static void main(String args[]) throws IOException
    {
        /* Creating object of the class */
        End ll = new End();
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
        System.out.print("\nEnter data to be inserted at the end: ");
        int data = Integer.parseInt(b.readLine());
        ll.insert(data);

        /* New LL */
        System.out.println("*** New Linked List ***");
        ll.print();
    }
}