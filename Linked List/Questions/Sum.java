// Program to find the sum of nodes of a linked list.

package LinkedList.Questions;
import java.io.*;

class Sum
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


    /* Function to find the sum */
    static int sum()
    {
        Node temp = head;
        int sum = 0;

        while (temp != null)
        {
            sum = sum + temp.data;
            temp = temp.next;
        }

        return sum;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Sum ll = new Sum();
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

        //Printing the sum
        System.out.print("\nSum : " + sum());
    }
}