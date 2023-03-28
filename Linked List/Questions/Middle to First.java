package Questions;
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


    /* Function to find length of LL */
    static int lengthOfLL()
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


    /* Function to make middle node the first node in a LL by using 2 pointers */
    void MiddleToFirst()
    {
        Node temp = head;     //Pointer 1
        Node prev = null;     //Pointer 2
        Node middle = null;   //To store middle element

        int mid = lengthOfLL()/2;
        int count = 0;

        while (temp != null)
        {
            //Checking if we are present at middle node's index
            if (count == mid) {
                //Storing the mid element in node middle
                middle = temp;
                break;
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
        //Linking the broken middle part
        prev.next = temp.next;

        //Making middle node the first node
        middle.next = head;
        head = middle;
    }


    public static void main(String args[]) throws IOException
    {
        /* Creating object of the class */
        Middle_to_First ll = new Middle_to_First();
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

        System.out.println("\nTaking out middle node and making it the head node...");
        ll.MiddleToFirst();

        System.out.println("New Linked List :");
        ll.printLL();
    }
}