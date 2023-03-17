package Insertion;
import java.util.Scanner;

class Beginning
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


    /* Inserting new node at the beginning */
    void insertNode(int d)
    {
        //Allocating memory for new node
        Node new_node = new Node(d);
        /* IF LL IS EMPTY */
        if(head == null) {
            head = new_node;
            return;
        }
        /* ELSE */
        //New node points to original head
        new_node.next = head;
        //New node is now the new head
        head = new_node;
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
        Beginning ll = new Beginning();
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
        fourth.next = null;

        /* Original LL */
        System.out.println("Original Linked List :");
        ll.printLL();

        /* Inserting value */
        System.out.print("\nEnter data to be inserted at the beginning: ");
        int d = sc.nextInt();
        ll.insertNode(d);

        /* New LL */
        System.out.println("New Linked List :");
        ll.printLL();

        sc.close();
    }
}