package LinkedList.Questions;
import java.io.*;

class Number_Present
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


    /* Function to search the element */
    static boolean search(int key)
    {
        Node temp = head;

        if(head.data == key)
        {
            return true;
        }

        while (temp != null)
        {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Number_Present ll = new Number_Present();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        System.out.println("Created Linked List : ");
        ll.printLL();

        System.out.print("\nEnter the node that you want to search : ");
        int key = Integer.parseInt(b.readLine());
        System.out.println( search(key) );
    }
}