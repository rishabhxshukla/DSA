package Deletion;
import java.util.Scanner;

class Delete_Key
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


    /* Deleting a particular node */
    void deleteNode(int key)
    {
        Node temp = head;
        Node prev = null;

        //If head node itself holds the key to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        while(temp != null  && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }
        //If key is not present in linked list
        if (temp == null) {
            System.out.println("Key not found!");
            return;
        }
        //Unlink the node from linked list
        prev.next = temp.next;
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
        Deletion.Delete_AllAfterKey obj = new Deletion.Delete_AllAfterKey();
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

        /* Original List */
        System.out.println("Original Linked List :");
        obj.printLL();

        /* Deleting 1st node */
        System.out.print("\nEnter the node that you want to delete : ");
        int key = sc.nextInt();
        obj.deleteNode(key);

        /* New list */
        System.out.println("\nNew Linked List :");
        obj.printLL();

        sc.close();
    }
}