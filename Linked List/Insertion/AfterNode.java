package LinkedList.Insertion;
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


    /* Inserting new node after a given node */
    void insertNode(Node prev, int d)
    {
        //Allocating memory for new node
        Node new_node = new Node(d);
        //Make next of new node as next of previous node
        new_node.next = prev.next;
        //Point the previous node to the newly created node
        prev.next = new_node;
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
        System.out.println("Original Linked List :");
        ll.printLL();

        /* Inserting value */
        System.out.print("\nEnter data to be inserted after the 2nd node: ");
        int d = sc.nextInt();
        //Inserting after the 2nd node
        Node prev = second;
        ll.insertNode(prev, d);

        /* New LL */
        System.out.println("New Linked List :");
        ll.printLL();

        sc.close();
    }
}