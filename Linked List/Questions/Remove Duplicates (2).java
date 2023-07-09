// Remove duplicate nodes from a linked list
// Storing each element in HashSet and comparing it with other elements

package LinkedList.Questions;
import java.io.*;
import java.util.HashSet;

class RemoveDuplicates2
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
    void RemoveDuplicates()
    {
        HashSet<Integer> set = new HashSet<>();
        Node temp = head;
        Node prev = null;

        while (temp != null)
        {
            if (set.contains(temp.data)) {
                prev.next = temp.next;
            }
            else {
                set.add(temp.data);
                prev = temp;
            }
            temp = temp.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        RemoveDuplicates2 ll = new RemoveDuplicates2();
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
        ll.RemoveDuplicates();

        //Printing new LL
        System.out.println("New Linked List :");
        ll.print();
    }
}