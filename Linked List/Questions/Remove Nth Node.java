// Remove the Nth node from the start of a linked list

package LinkedList.Questions;
import java.io.*;

class Remove_Nth_Node
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


    /* Function to find length of LL */
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


    /* Function to delete the Nth node from start */
    void deleteNth(int index)
    {
        Node temp = head;
        Node prev = null;
        int length = length();
        int count = 1;

        //Invalid index
        if (index <= 0 || index > length) {
            System.out.println("Invalid index! Please enter a value between 1 and " + length);
            System.exit(1);
        }

        //Deleting 1st node
        if (index == 1) {
            head = head.next;
            return;
        }

        while (temp != null)
        {
            if (count == index) {
                prev.next = temp.next;
                return;
            }
            count++;
            prev = temp;
            temp = temp.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Remove_Nth_Node ll = new Remove_Nth_Node();
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

        //Taking user input
        System.out.print("\nEnter the index from start : ");
        int index = Integer.parseInt(b.readLine());

        //Deleting the node present at 'index' from start
        System.out.println("Deleting node present at index " + index + " from start...");
        ll.deleteNth(index);

        //Printing the LL
        System.out.println("*** New Linked List ***");
        ll.print();
    }
}