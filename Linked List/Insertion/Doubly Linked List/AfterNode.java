package LinkedList.DoublyLL.Insertion;
import java.util.Scanner;

class AfterNode
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

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* Inserting new node after a given node */
    void insert(Node key, int data)
    {
        //Allocating memory for new node
        Node new_node = new Node(data);

        //Link new node to the next of key node
        new_node.next = key.next;
        key.prev = new_node;

        //Link key node to the newly created node
        key.next = new_node;
        new_node.prev = key;
    }


    public static void main(String args[])
    {
        /* Creating object of the class */
        AfterNode ll = new AfterNode();
        Scanner sc = new Scanner(System.in);

        /* Assigning the Nodes */
        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        /* Linking the Nodes */
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        /* Original LL */
        System.out.println("*** Original Linked List ***");
        ll.print();

        /* Inserting value */
        System.out.print("\nEnter data to be inserted after the 2nd node : ");
        int data = sc.nextInt();
        //Inserting after the 2nd node
        ll.insert(second, data);

        /* New LL */
        System.out.println("*** New Linked List ***");
        ll.print();
    }
}