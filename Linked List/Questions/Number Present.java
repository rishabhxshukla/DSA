// Check if a given number is present in a linked list

package LinkedList.Questions;
import java.io.*;

class Number_Present
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


    /* Function to search the element */
    static boolean search(int key)
    {
        Node temp = head;

        //If head contains the key
        if(head.data == key)
        {
            return true;
        }

        //Otherwise loop the LL
        while (temp != null)
        {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Number_Present ll = new Number_Present();
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
        ll.print();

        //Taking user input
        System.out.print("\nEnter the node that you want to search : ");
        int key = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("isPresent : " + search(key));
    }
}