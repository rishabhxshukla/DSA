package LinkedList.SinglyLL.Deletion;
import java.io.*;

class Key
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


    /* Deleting a particular node */
    void delete(int key)
    {
        //If head node itself holds the key to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        while(temp != null)
        {
            if (temp.data == key) {
                //Deleting the key node
                prev.next = temp.next;
                return;
            }

            prev = temp;
            temp = temp.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        /* Creating object of the class */
        Key ll = new Key();
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

        /* Deleting key node */
        System.out.print("\nEnter the node that you want to delete : ");
        int key = Integer.parseInt(b.readLine());
        ll.delete(key);

        /* New LL */
        System.out.println("*** New Linked List ***");
        ll.print();
    }
}