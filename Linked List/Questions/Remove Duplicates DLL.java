// Remove duplicate nodes from a sorted doubly linked list
// 2 POINTERS

package LinkedList.Questions;
import java.io.*;

class RemoveDuplicatesDLL
{
    static Node head;
    static class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.prev = null;
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
        new_node.prev = temp;
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


    /* Function to remove the duplicates from DLL */
    //Here, the time complexity is O(N) and not O(N²)
    void removeDuplicates()
    {
        Node temp = head;   //1st Pointer

        while (temp != null && temp.next != null)
        {
            Node nextNode = temp.next;   //2nd Pointer

            //Keep moving nextNode till we find a different value or reach the end
            while ((nextNode != null) && (nextNode.data == temp.data))
            {
                nextNode = nextNode.next;
            }

            //Point temp to the new different node
            temp.next = nextNode;

            //Update previous pointer if nextNode is not null
            if (nextNode != null) {
                nextNode.prev = temp;
            }

            //Move temp forward
            temp = temp.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        RemoveDuplicatesDLL ll = new RemoveDuplicatesDLL();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        ll.create(1);
        ll.create(1);
        ll.create(1);
        ll.create(2);
        ll.create(3);
        ll.create(3);
        ll.create(4);
        ll.create(5);

        //Printing original LL
        System.out.println("Created Linked List : ");
        ll.print();

        //Reversing the LL
        System.out.print("\nRemoving the duplicates...");
        ll.removeDuplicates();

        //Printing new LL
        System.out.println("\nNew Linked List : ");
        ll.print();
    }
}