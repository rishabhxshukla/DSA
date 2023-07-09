/*
Program to move the last node to the front of linked list.
STEPS :
1) Traverse till the last node.
   Use two pointers - 'prev & last' :
   a) Store the 2nd last node in prev.
   b) Store the last node in last.
2) Make prev the last node.
3) Make last the head node.
*/

package LinkedList.Questions;
import java.io.*;

class Last_to_First
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
    void print()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* Creating the LL */
    void add(int d)
    {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }


    /* Function to make last node the first node of a LL */
    void LastToFirst()
    {
        Node temp = head;
        while (temp.next.next != null)
        {
            temp = temp.next;
        }

        //Storing 2nd last node in prev
        Node prev = temp;
        //Storing last node in last
        Node last = temp.next;

        //Pointing 2nd last node to null
        prev.next = null;

        //Making last node the first node
        last.next = head;
        head = last;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Last_to_First ll = new Last_to_First();
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
        System.out.println("Created Linked List :");
        ll.print();

        //Swapping nodes
        System.out.println("\nSwapping last and first node...");
        ll.LastToFirst();

        //Printing new LL
        System.out.println("New Linked List :");
        ll.print();
    }
}