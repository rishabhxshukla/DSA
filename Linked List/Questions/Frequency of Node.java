package LinkedList.Questions;
import java.io.*;

class Frequency
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


    /* Function to find frequency of a node */
    static int frequency(int key)
    {
        Node temp = head;
        int count = 0;

        while (temp != null)
        {
            if (temp.data == key) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Frequency ll = new Frequency();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        //Printing the LL
        System.out.println("Created Linked List : ");
        ll.printLL();

        //Taking user input
        System.out.print("\nEnter a node to check its frequency : ");
        int key = Integer.parseInt(b.readLine());

        //Printing the frequency
        System.out.println("Frequency of " +key+ " is " + frequency(key));
    }
}