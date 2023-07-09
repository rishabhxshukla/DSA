// Find the sum of last n nodes of a given linked list
// REVERSE

package LinkedList.Questions;
import java.io.*;

class Sum_Last_N_Nodes3
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


    /* Function to reverse the LL */
    void reverse()
    {
        Node prev = null;
        Node temp = head;
        Node next = null;

        while (temp != null)
        {
            next = temp.next;
            temp.next = prev;

            prev = temp;
            temp = next;
        }

        //Changing head node
        head = prev;
    }


    /* Function to find sum of last N nodes */
    static int sum(int N)
    {
        //Creating object & calling reverse function
        Sum_Last_N_Nodes3 ll = new Sum_Last_N_Nodes3();
        ll.reverse();

        Node temp = head;
        int count = 0, sum = 0;

        while (count != N)
        {
            sum = sum + temp.data;
            temp = temp.next;
            count++;
        }

        return sum;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Sum_Last_N_Nodes3 ll = new Sum_Last_N_Nodes3();
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
        System.out.print("\nEnter the value of N : ");
        int N = Integer.parseInt(b.readLine());

        //Printing the sum
        System.out.print("Sum of last n nodes : " + sum(N));
    }
}