package LinkedList.DoublyLL.Insertion;
import java.io.*;

class BeforeKey
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


    /* Inserting new node before a given key */
    void insert(int key, int data)
    {
        //Allocating memory for new node
        Node new_node = new Node(data);

        //If head node contains the key
        if(head.data == key)
        {
            //Link the new node to the head node
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
            return;
        }

        //Else iterate over the LL
        Node temp = head;
        while(temp != null)
        {
            if (temp.next.data == key)
            {
                //Link new node to the next of key node
                new_node.next = temp.next;
                temp.next.prev = new_node;

                //Link key node to the newly created node
                temp.next = new_node;
                new_node.prev = temp;
                return;
            }

            temp = temp.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        /* Creating object of the class */
        BeforeKey ll = new BeforeKey();
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
        System.out.print("\nEnter the data to be inserted : ");
        int data = Integer.parseInt(b.readLine());
        System.out.print("Enter the key before which the node is to be inserted : ");
        int key = Integer.parseInt(b.readLine());
        ll.insert(key, data);

        /* New LL */
        System.out.println("*** New Linked List ***");
        ll.print();
    }
}