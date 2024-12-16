package LinkedList.Deletion;
import java.util.Scanner;

class Key
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
        //If head node itself holds the key to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        while(temp != null)
        {
            if (temp.data == key) {
                prev.next = temp.next;
                return;
            }

            prev = temp;
            temp = temp.next;
        }
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
        Key ll = new Key();
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
        ll.printLL();

        /* Deleting key node */
        System.out.print("\nEnter the node that you want to delete : ");
        int key = sc.nextInt();
        ll.deleteNode(key);

        /* New LL */
        System.out.println("New Linked List :");
        ll.printLL();

        sc.close();
    }
}