package LinkedList.Questions;
import java.io.*;

class Zeros_to_Front
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


    /* Printing the LL */
    void printLL()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* Creating the LL */
    void add(int data)
    {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            return;
        }

        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.next = null;
    }


    /* Function to move 0's to the front of LL */
    void moveZeros()
    {
        //Traversing the LL from the 2nd node
        Node temp = head.next;
        Node prev = head;

        while (temp != null)
        {
            if (temp.data == 0)
            {
                //Storing the node 0
                Node zero = temp;

                //Breaking the link
                prev.next = temp.next;

                //Moving 0 to head of LL
                zero.next = head;
                head = zero;
            }
            prev = temp;
            temp = temp.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Zeros_to_Front ll = new Zeros_to_Front();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        //Printing original LL
        System.out.println("Created Linked List : ");
        ll.printLL();

        //Moving zeroes to front
        System.out.println("\nMoving zeros to the front...");
        ll.moveZeros();

        //Printing new LL
        System.out.println("New Linked List : ");
        ll.printLL();
    }
}