// Find the nth node from the end of a linked list

package LinkedList.Questions;
import java.io.*;

class Nth_Node_from_end
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

        return  count;
    }


    /* Function to find the Nth node from end */
    static int GetNth(int index)
    {
        Node temp = head;
        int count = length();

        while (temp != null)
        {
            if (count == index) {
                return temp.data;
            }
            count--;
            temp = temp.next;
        }

        return -1;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Nth_Node_from_end ll = new Nth_Node_from_end();
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
        System.out.println("*** Created Linked List ***");
        ll.print();

        //Taking user input
        System.out.print("\nEnter the index from end : ");
        int index = Integer.parseInt(b.readLine());

        //Printing the node present at 'index' from last
        System.out.println("Node present at index " +index+ " from last is : " + GetNth(index));
    }
}