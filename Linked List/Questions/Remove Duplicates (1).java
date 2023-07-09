// Remove duplicate nodes from a linked list
// Taking each element and comparing it with every other element in LL

package LinkedList.Questions;
import java.io.*;

class RemoveDuplicates1
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


    /* Function to remove duplicate nodes */
    void remove()
    {
        Node temp1 = head;
        Node temp2 = null;

        while (temp1 != null && temp1.next != null)
        {
            temp2 = temp1;

            while (temp2.next != null)
            {
                if (temp1.data == temp2.next.data)
                {
                    Node nextNode = temp2.next;
                    temp2.next = nextNode.next;
                    System.gc();    //Calling the garbage collector
                }
                else
                    temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        RemoveDuplicates1 ll = new RemoveDuplicates1();
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

        //Removing duplicate nodes
        System.out.println("\nRemoving duplicate nodes...");
        ll.remove();

        //Printing new LL
        System.out.println("New Linked List :");
        ll.print();
    }
}