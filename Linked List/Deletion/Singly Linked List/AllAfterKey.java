package LinkedList.SinglyLL.Deletion;
import java.io.*;

class AllAfterKey
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


    /* Deleting all nodes after a given node */
    void delete(int key)
    {
        Node temp = head;

        //Looping till the key node
        while (temp != null)
        {
            if (temp.data == key) {
                //Pointing the key node to null
                temp.next = null;
                return;
            }

            temp = temp.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        /* Creating object of the class */
        AllAfterKey ll = new AllAfterKey();
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

        /* Deleting the nodes */
        System.out.print("\nEnter the node after which you want to delete all nodes : ");
        int key = Integer.parseInt(b.readLine());
        ll.delete(key);

        /* New LL */
        System.out.println("*** New Linked List ***");
        ll.print();
    }
}