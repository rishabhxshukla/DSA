package LinkedList.SinglyLL.Deletion;
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
            this.data = data;
            this.next = null;
        }
    }


    /* Deleting node present at Kth position */
    void deleteNode(int k)
    {
        //If list is empty
        if(head == null) {
            System.out.println("ERROR : List is empty");
            return;
        }

        //If the node to be deleted is the head node
        if (k == 1)
        {
            head = head.next;
        }

        //If the node to be deleted is the last node
        else if (k == 5)
        {
            Node temp = head;

            while (temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;
        }

        //If the node to be deleted is in between
        else
        {
            Node temp = head;
            int count = 1;

            while (temp != null)
            {
                //Deleting the Kth node
                if (count == k - 1) {
                    temp.next = temp.next.next;
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
        System.out.print("\nEnter the value of K : ");
        int k = sc.nextInt();
        if (k > 5) {
            System.out.println("ERROR : Invalid value of K");
            return;
        }
        ll.deleteNode(k);

        /* New LL */
        System.out.println("New Linked List :");
        ll.printLL();

        sc.close();
    }
}