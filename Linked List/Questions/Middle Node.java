package LinkedList.Questions;
import java.io.*;

class Middle_Node
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
            temp = temp.next;
            count++;
        }
        return count;
    }


    /* Function to find middle node of LL */
    static int middleNode()
    {
        int mid = lengthOfLL()/2;
        Node temp = head;
        int count = 0;

        while (temp != null)
        {
            if (count == mid) {
                return temp.data;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Middle_Node ll = new Middle_Node();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("How many nodes do you want to enter? : ");
        int n = Integer.parseInt(b.readLine());

        //Creating the LL
        for (int i=0; i<n; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        //Printing the LL
        System.out.println("Created Linked List :");
        ll.printLL();

        //Printing the middle node
        System.out.println("\nMiddle node is : " + middleNode());
    }
}