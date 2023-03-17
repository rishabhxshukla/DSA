package Deletion;
import java.util.Scanner;

class Delete_AllBeforeKey
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


    /* Deleting all nodes before a given node */
    void deleteNode(int key)
    {
        Node temp = head;

        //Looping till the key node
        while(temp.data != key)
        {
            temp = temp.next;
        }
        //Unlinking the nodes from linked list
        head = temp;
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
        Delete_AllBeforeKey obj = new Delete_AllBeforeKey();
        Scanner sc = new Scanner(System.in);

        /* Assigning the Nodes */
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        /* Linking the Nodes */
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        /* Original LL */
        System.out.println("Original Linked List :");
        obj.printLL();

        /* Deleting the nodes */
        System.out.print("\nEnter the node before which you want to delete all nodes : ");
        int key = sc.nextInt();
        obj.deleteNode(key);

        /* New LL */
        System.out.println("New Linked List :");
        obj.printLL();

        sc.close();
    }
}