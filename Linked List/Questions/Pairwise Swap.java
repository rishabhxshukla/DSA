package LinkedList.Questions;
import java.io.*;

class Pairwise_Swap
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


    /* Function to swap nodes pairwise in a LL */
    void SwapPairwise()
    {
        Node temp = head;

        //1st one for Even, 2nd one for Odd length
        while (temp != null && temp.next != null)
        {
            //Storing data of 1st node in temporary variable
            int k = temp.data;
            //Placing data of 2nd node on the 1st node
            temp.data = temp.next.data;
            //Placing data of 1st node on the 2nd node
            temp.next.data = k;

            //Increasing the iterator by 2
            temp = temp.next.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Pairwise_Swap ll = new Pairwise_Swap();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i=0; i<6; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        //Printing original LL
        System.out.println("Created Linked List :");
        ll.print();

        //Swapping pairwise
        System.out.println("\nSwapping elements pairwise...");
        ll.SwapPairwise();

        //Printing new LL
        System.out.println("New Linked List :");
        ll.print();
    }
}