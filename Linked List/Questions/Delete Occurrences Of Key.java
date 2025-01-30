// Delete all the occurrences of a key in a doubly linked list

package LinkedList.Questions;
import java.io.*;

class DeleteOccurrencesOfKey
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


    /* Function to delete all the occurrences of key in DLL */
    void deleteOccurrences(int key)
    {
        //Delete all the occurrences of key at the head
        while (head != null && head.data == key)
        {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }


        //Traverse and delete occurrences in the rest of the DLL
        // 1 <-> 2 <-> 1 <-> 3 <-> 1
        Node temp = head;
        while (temp != null)
        {
            if (temp.data == key)
            {
                //Storing the next & prev nodes
                Node front = temp.next;
                Node back  = temp.prev;

                if (back != null) {
                    back.next = front;
                }
                if (front != null) {
                    front.prev = back;
                }
            }

            temp = temp.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        DeleteOccurrencesOfKey ll = new DeleteOccurrencesOfKey();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        ll.create(1);
        ll.create(2);
        ll.create(1);
        ll.create(3);
        ll.create(1);

        //Printing original LL
        System.out.println("Created Linked List : ");
        ll.print();

        //Reversing the LL
        System.out.print("\nDeleting all the occurrences of 1...");
        ll.deleteOccurrences(1);

        //Printing new LL
        System.out.println("\nNew Linked List : ");
        ll.print();
    }
}