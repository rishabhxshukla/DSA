// Add 1 to the number represented by the linked list
// REVERSE

package LinkedList.Questions;
import java.io.*;

class Add_1_To_LL
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


    /* Creating the LL */
    void create(int data)
    {
        Node new_node = new Node(data);

        if(head == null) {
            head = new_node;
            return;
        }

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = new_node;
        new_node.next = null;
    }


    /* Printing the LL */
    void print()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* Helper function to reverse a linked list */
    static Node reverse(Node head)
    {
        Node back = null;
        Node temp = head;
        Node front = null;

        while (temp != null)
        {
            front = temp.next;
            temp.next = back;

            back = temp;
            temp = front;
        }

        //Returning the new head
        return back;
    }


    /* Function to add 1 to the LL */
    void addOne()
    {
        int carry = 1;

        //Reverse the LL
        head = reverse(head);

        Node temp = head;
        while (temp != null)
        {
            //Add the carry
            temp.data = temp.data + carry;

            //If the sum < 10, break out
            if (temp.data < 10) {
                carry = 0;
                break;
            }
            else {
                carry = 1;
                temp.data = 0;
            }

            temp = temp.next;
        }

        //Reverse the LL
        head = reverse(head);

        //If carry is still 1, create a new node as head node
        if (carry == 1) {
            Node new_node = new Node(1);
            new_node.next = head;
            head = new_node;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Add_1_To_LL ll = new Add_1_To_LL();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        ll.create(1);
        ll.create(9);
        ll.create(9);

        //Printing the LL
        System.out.println("*** Created Linked List ***");
        ll.print();

        //Adding 1 to LL
        System.out.println("\nAdding 1 to LL...");
        ll.addOne();

        //Printing the LL
        System.out.println("*** New Linked List ***");
        ll.print();
    }
}