package Insertion;
import java.util.Scanner;

class Insert_AfterKey
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


    /* Inserting new node after a given key */
    void insertNode(int key, int d)
    {
        //Allocating memory for new node
        Node new_node = new Node(d);

        /* If head node contains the key */
        if(head.data == key) {
            //Make next of new node as next of head node
            new_node.next = head.next;
            //Point the head node to the newly created node
            head.next = new_node;
            return;
        }

        /* Else iterate over the LL */
        Node temp = head;
        while(temp.data != key)
        {
            temp = temp.next;
            if(temp == null)
            {
                System.out.println("ERROR : Key not found!");
                return;
            }
        }
        //Make next of new node as next of key node
        new_node.next = temp.next;
        //Point the key node to the newly created node
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
        Insert_AfterKey obj = new Insert_AfterKey();
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

        /* Original List */
        System.out.println("Original Linked List :");
        obj.printLL();

        /* Inserting value */
        System.out.print("\nEnter the node data to be inserted: ");
        int d = sc.nextInt();
        System.out.print("Enter the key after which the node is to be inserted: ");
        int key = sc.nextInt();
        obj.insertNode(key, d);

        /* New list */
        System.out.println("New Linked List :");
        obj.printLL();

        sc.close();
    }
}