package Insertion;
import java.util.Scanner;

class BeforeKey
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


    /* Inserting new node before a given key */
    void insertNode(int key, int d)
    {
        //Allocating memory for new node
        Node new_node = new Node(d);

        /* If head node contains the key */
        if(head.data == key) {
            //Point the next of new node to the head node
            new_node.next = head;
            //Point the head node to the newly created node
            head = new_node;
            return;
        }

        /* Else iterate over the LL */
        Node temp = head;
        while(temp.next.data != key)
        {
            temp = temp.next;
        }
        //Place new node before the key node
        new_node.next = temp.next;
        //Point node before the key node to the newly created node
        temp.next = new_node;
    }


    /* Printing the LL */
    void printLL()
    {
        //Storing the value of head in a temp variable
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String args[])
    {
        /* Creating object of the class */
        BeforeKey ll = new BeforeKey();
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
        System.out.println("Original Linked List :");
        ll.printLL();

        /* Inserting value */
        System.out.print("\nEnter the data to be inserted: ");
        int d = sc.nextInt();
        System.out.print("Enter the key before which the node is to be inserted: ");
        int key = sc.nextInt();
        ll.insertNode(key, d);

        /* New LL */
        System.out.println("New Linked List :");
        ll.printLL();

        sc.close();
    }
}