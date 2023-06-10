package LinkedList.Questions;
import java.io.*;
import java.util.HashSet;

class Remove_Duplicates_HashSet
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


    /* Function to remove duplicate nodes from LL */
    //Storing each element in HS and comparing it to other elements
    void RemoveDuplicates()
    {
        //Creating a Hash Set
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
        Remove_Duplicates_HashSet ll = new Remove_Duplicates_HashSet();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<6; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        System.out.println("Created Linked List :");
        ll.printLL();

        System.out.println("\nRemoving duplicate nodes...");
        ll.RemoveDuplicates();

        System.out.println("New Linked List :");
        ll.printLL();
    }
}