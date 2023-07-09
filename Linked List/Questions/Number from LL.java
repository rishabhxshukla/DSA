package LinkedList.Questions;
import java.io.*;

class Number_from_LL
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


    /* Function to find number made from entire LL */
    static int number()
    {
        Node temp = head;
        String num = "";

        while (temp != null)
        {
            num = num + temp.data;
            temp = temp.next;
        }

        //Converting string to integer
        int ans = Integer.parseInt(num);
        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Number_from_LL ll = new Number_from_LL();
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

        //Printing the number
        System.out.printf("\nNumber created from LL is : " + number());
    }
}