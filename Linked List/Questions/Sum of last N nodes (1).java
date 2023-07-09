// Find the sum of last n nodes of a given linked list
// Formula

package LinkedList.Questions;
import java.io.*;

class Sum_Last_N_Nodes1
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


    /* Function to find sum of last N nodes */
    static int sum(int N)
    {
        //1 -> 2 -> 3 -> 4 -> 5
        Node temp = head;
        int index = lengthOfLL() - N + 1;   //5-3+1=3
        int count = 1, sum = 0;

        while (temp != null)
        {
            if (count == index)
            {
                while (temp != null)
                {
                    sum = sum + temp.data;
                    temp = temp.next;
                }
                return sum;
            }

            temp = temp.next;
            count++;
        }
        return 0;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Sum_Last_N_Nodes1 ll = new Sum_Last_N_Nodes1();
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