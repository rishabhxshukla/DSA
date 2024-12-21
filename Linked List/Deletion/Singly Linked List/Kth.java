package LinkedList.SinglyLL.Deletion;
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


    /* Deleting node present at Kth position */
    void delete(int k)
    {
        //If LL is empty
        if(head == null) {
            System.out.println("ERROR : List is empty");
            return;
        }

        //If the node to be deleted is the head node
        if (k == 1)
        {
            head = head.next;
        }

        //If the node to be deleted is the last node
        else if (k == 5)
        {
            Node temp = head;

            while (temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;
        }

        //If the node to be deleted is in between
        else
        {
            Node temp = head;
            int count = 1;

            while (temp != null)
            {
                //Deleting the Kth node
                if (count == k - 1) {
                    temp.next = temp.next.next;
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

        /* Deleting key node */
        System.out.print("\nEnter the value of K : ");
        int k = Integer.parseInt(b.readLine());
        if (k < 1 || k > 5) {
            System.out.println("ERROR : Invalid value of K");
            return;
        }
        ll.delete(k);

        /* New LL */
        System.out.println("*** New Linked List ***");
        ll.print();
    }
}