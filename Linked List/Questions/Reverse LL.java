/*
1) Initialize 3 pointers prev = null, temp = head, and next = null.
2) Iterate through the linked list.
3) Follow these steps -
   Store the next node : next = temp.next
   Point temp.next to the prev : temp.next = prev
   Update prev and temp variables : prev = temp, temp = next
*/

package LinkedList.Questions;
import java.io.*;

class Reverse
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
    void add(int d)
    {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }


    /* Function to reverse the LL */
    void reverse()
    {
        Node prev = null;
        Node temp = head;
        Node next = null;

        while (temp != null)
        {
            next = temp.next;
            temp.next = prev;

            prev = temp;
            temp = next;
        }
        //Changing head node
        head = prev;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Reverse ll = new Reverse();
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

        //Reversing the LL
        System.out.print("\nReversing Linked List...");
        ll.reverse();

        //Printing new LL
        System.out.println("\nNew Linked List : ");
        ll.printLL();
    }
}