// Find the middle node of a linked list

package LinkedList.Questions;
import java.io.*;

class MiddleNode
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


    /* Function to find the length of LL */
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
    static int middle()
    {
        Node temp = head;
        int count = 0;
        int mid = length()/2;

        while (temp != null)
        {
            if (count == mid) {
                return temp.data;
            }
            count++;
            temp = temp.next;
        }

        return -1;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MiddleNode ll = new MiddleNode();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        //Printing the LL
        System.out.println("Created Linked List :");
        ll.print();

        //Printing the middle node
        System.out.println("\nMiddle node : " + middle());
    }
}