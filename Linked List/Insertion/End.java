package LinkedList.Insertion;
import java.util.Scanner;

class End
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

    /* Inserting new node at the end */
    void insertNode(int d)
    {
        //Allocating memory for new node
        Node new_node = new Node(d);

        //If LL is empty then make new node as head of the list
        if(head == null) {
            head = new_node;
            return;
        }

        //Traversing the LL
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        //Last node points to the newly created node
        temp.next = new_node;
        //New node points to null
        new_node.next = null;
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
        End ll = new End();
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
        System.out.print("\nEnter data to be inserted at the end: ");
        int d = sc.nextInt();
        ll.insertNode(d);

        /* New LL */
        System.out.println("New Linked List :");
        ll.printLL();

        sc.close();
    }
}