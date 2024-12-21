package LinkedList.SinglyLL.Insertion;
import java.io.*;

class Kth
{
    static Node head;
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data   = data;
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


    /* Inserting new node at Kth position */
    void insert(int k, int d)
    {
        //If LL is empty
        if(head == null) {
            System.out.println("ERROR : List is empty");
            return;
        }

        //If insertion is happening in the head node
        if (k == 1)
        {
            Node new_node = new Node(d);
            new_node.next = head;
            head = new_node;
        }

        //If insertion is happening in the last node
        else if (k == 5)
        {
            Node new_node = new Node(d);

            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = new_node;
            new_node.next = null;
        }

        //If insertion is happening in between
        else
        {
            Node new_node = new Node(d);

            Node temp = head;
            int count = 1;

            while (temp != null)
            {
                //Inserting at Kth node
                if (count == k - 1) {
                    new_node.next = temp.next;
                    temp.next = new_node;
                    return;
                }

                count++;
                temp = temp.next;
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        /* Creating object of the class */
        Kth ll = new Kth();
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
        int d = Integer.parseInt(b.readLine());
        System.out.print("Enter the value of K : ");
        int k = Integer.parseInt(b.readLine());
        if (k < 1 || k > 5) {
            System.out.println("ERROR : Invalid value of K");
            return;
        }
        ll.insert(k, d);

        /* New LL */
        System.out.println("*** New Linked List ***");
        ll.print();
    }
}