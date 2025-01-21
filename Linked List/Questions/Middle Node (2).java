// Find the middle node of a linked list
// TORTOISE & HARE ALGORITHM

package LinkedList.Questions;
import java.io.*;

class MiddleNode2
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


    /* Function to find the middle node */
    static Node middle()
    {
        //Slow pointer stands at middle node
        //when fast pointer reaches null
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MiddleNode2 ll = new MiddleNode2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i = 1; i <= 5; i++)
        {
            ll.create(i);
        }

        //Printing the LL
        System.out.println("Created Linked List :");
        ll.print();

        //Printing the middle node
        Node ans = middle();
        System.out.println("\nMiddle node : " + ans.data);
    }
}