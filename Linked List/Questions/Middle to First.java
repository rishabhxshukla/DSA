// Make middle node the head of a linked list
// 2 POINTERS

package LinkedList.Questions;
import java.io.*;

class Middle_to_First
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


    /* Function to make middle node the head node of a LL */
    void MiddleToFirst()
    {
        Node temp = head;     //Pointer 1
        Node prev = null;     //Pointer 2
        Node middle = null;   //To store middle element

        int count = 0;
        int mid = length()/2;

        while (temp != null)
        {
            //Storing the mid-element
            if (count == mid) {
                middle = temp;
                break;
            }
            prev = temp;
            temp = temp.next;
            count++;
        }

        //Linking the broken middle part
        prev.next = temp.next;

        //Making middle node the head node
        middle.next = head;
        head = middle;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Middle_to_First ll = new Middle_to_First();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        //Printing original LL
        System.out.println("Created Linked List : ");
        ll.print();

        //Swapping nodes
        System.out.println("\nMaking middle node the head node...");
        ll.MiddleToFirst();

        //Printing new LL
        System.out.println("New Linked List :");
        ll.print();
    }
}