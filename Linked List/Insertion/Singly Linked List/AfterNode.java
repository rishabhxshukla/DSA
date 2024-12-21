package LinkedList.SinglyLL.Insertion;
import java.util.Scanner;

class AfterNode
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
        //Make next of new node as next of key node
        new_node.next = key.next;
        //Point the key node to the newly created node
        key.next = new_node;
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
        second.next = third;
        third.next = fourth;

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