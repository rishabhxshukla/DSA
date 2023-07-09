// Delete alternate nodes of a linked list

package LinkedList.Questions;
import java.io.*;

class RemoveAlternate
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


    /* Function to remove alternate nodes */
    void remove()
    {
        Node temp = head;

        //1st one for Even, 2nd one for Odd length
        while (temp != null && temp.next != null)
        {
            //Storing 2nd node in temporary variable
            Node k = temp.next;
            //Pointing 1st node to next of 2nd node
            temp.next = k.next;
            //Making 2nd node null
            k = null;

            //Increasing the iterator
            temp = temp.next;
        }
    }
    /*
    Here we can also use : temp.next = temp.next.next;
    */


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        RemoveAlternate ll = new RemoveAlternate();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i=0; i<6; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        //Printing original LL
        System.out.println("Created Linked List :");
        ll.print();

        //Removing alternate nodes
        System.out.println("\nRemoving alternate nodes...");
        ll.remove();

        //Printing new LL
        System.out.println("New Linked List :");
        ll.print();
    }
}