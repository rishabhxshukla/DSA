package LinkedList.Questions;
import java.io.*;

class Remove_Repeating
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


    /* Function to remove alternate nodes from LL */
    void RemoveRepeating()
    {
        Node temp = head;
        while (temp.next != null)
        {
            if (temp.data == temp.next.data)
            {
                //Storing the next node of the alternate node
                Node nextNode = temp.next;
                //Pointing the first occurrence to the next node of alternate node
                temp.next = nextNode.next;
                //Calling the garbage collector
                System.gc();
            }
            else
                temp = temp.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Remove_Repeating ll = new Remove_Repeating();
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
        ll.printLL();

        //Removing repetitive nodes
        System.out.println("\nRemoving repetitive nodes...");
        ll.RemoveRepeating();

        //Printing new LL
        System.out.println("New Linked List :");
        ll.printLL();
    }
}