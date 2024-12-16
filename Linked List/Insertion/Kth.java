package LinkedList.Insertion;
import java.util.Scanner;

class Kth
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


    /* Inserting new node at Kth position */
    void insertNode(int k, int d)
    {
        //If list is empty
        if(head == null) {
            System.out.println("ERROR : List is empty");
            return;
        }

        //If insertion is happening in the head node
        if (k == 1)
        {
            Node new_node = new Node(d);
            new_node.next = head;
            head = new_node;
        }

        //If insertion is happening in the last node
        else if (k == 5)
        {
            Node new_node = new Node(d);

            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = new_node;
            new_node.next = null;
        }

        //If insertion is happening in between
        else
        {
            Node new_node = new Node(d);

            Node temp = head;
            int count = 1;

            while (temp != null)
            {
                //Inserting at Kth node
                if (count == k - 1) {
                    new_node.next = temp.next;
                    temp.next = new_node;
                    return;
                }

                count++;
                temp = temp.next;
            }
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
        Kth ll = new Kth();
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
        System.out.print("Enter the value of K : ");
        int k = sc.nextInt();
        if (k > 5) {
            System.out.println("ERROR : Invalid value of K");
            return;
        }
        ll.insertNode(k, d);

        /* New LL */
        System.out.println("New Linked List :");
        ll.printLL();

        sc.close();
    }
}