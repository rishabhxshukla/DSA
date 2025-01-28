// Delete the middle node of the linked list
// TORTOISE & HARE ALGORITHM

package LinkedList.Questions;
import java.io.*;

class DeleteMiddleNode2
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


    /* Function to delete the middle node */
    void deleteMiddle()
    {
        /* If LL is empty or has only one node */
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        //Stop the search when fast is null or fast points to null
        while (fast != null && fast.next != null)
        {
            //Track the node before slow
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        //Deleting the middle node
        prev.next = slow.next;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        DeleteMiddleNode2 ll = new DeleteMiddleNode2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i = 1; i <= 5; i++)
        {
            ll.create(i);
        }

        //Printing the LL
        System.out.println("*** Created Linked List ***");
        ll.print();

        //Deleting the middle node
        System.out.print("\nDeleting the middle node...");
        ll.deleteMiddle();

        //Printing the LL
        System.out.println("\n*** New Linked List ***");
        ll.print();
    }
}