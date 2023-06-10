package LinkedList.Questions;
import java.io.*;

class Nth_Node
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


    /* Function to find the Nth node from the start of LL */
    static int GetNth(int index)
    {
        Node temp = head;
        int count = 0;

        while (temp != null)
        {
            if(count == index) {
                return temp.data;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }


    public static void main(String args[]) throws IOException
    {
        /* Creating object of the class */
        Nth_Node ll = new Nth_Node();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        System.out.println("*** Created Linked List ***");
        ll.printLL();

        System.out.print("\nEnter the index that you want to find : ");
        int index = Integer.parseInt(b.readLine());
        int nodeAtIndex = GetNth(index);
        System.out.println("Node present at index " +index+ " is " +nodeAtIndex);
    }
}