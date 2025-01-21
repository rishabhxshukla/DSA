// Find the middle node of a linked list
// LENGTH / 2

package LinkedList.Questions;
import java.io.*;

class MiddleNode1
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


    /* Helper function to find the length of LL */
    static int length()
    {
        Node temp = head;
        int count = 0;

        while (temp != null)
        {
            count++;
            temp = temp.next;
        }

        return count;
    }


    /* Function to find the middle node */
    static Node middle()
    {
        Node temp = head;
        int count = 0;
        int mid = length()/2;

        while (temp != null)
        {
            if (count == mid) {
                return temp;
            }
            count++;
            temp = temp.next;
        }

        return null;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MiddleNode1 ll = new MiddleNode1();
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