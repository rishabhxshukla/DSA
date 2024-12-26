// Find the sum of 2 linked lists

package LinkedList.Questions;
import java.io.*;

class Add_Two_Numbers
{
    static Node head1;
    static Node head2;
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


    /* Creating the LL */
    Node create(int data, Node head)
    {
        Node new_node = new Node(data);

        if(head == null) {
            head = new_node;
            return head;
        }

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = new_node;
        new_node.next = null;

        return head;
    }


    /* Printing the LL */
    void print(Node head)
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* Function to find the sum of 2 LLs */
    static int add()
    {
        String num1 = "";
        String num2 = "";

        Node temp = head1;
        while (temp != null)
        {
            num1 = num1 + temp.data;
            temp = temp.next;
        }

        temp = head2;
        while (temp != null)
        {
            num2 = num2 + temp.data;
            temp = temp.next;
        }

        //Converting string to integer
        int ans = Integer.parseInt(num1) + Integer.parseInt(num2);
        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Add_Two_Numbers ll = new Add_Two_Numbers();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i = 1; i <= 5; i++)
        {
            head1 = ll.create(i, head1);
        }
        for (int i = 6; i <= 8; i++)
        {
            head2 = ll.create(i, head2);
        }

        //Printing the LL
        System.out.println("Created Linked Lists : ");
        ll.print(head1);
        System.out.println();
        ll.print(head2);

        //Printing the result
        System.out.printf("\nNumber created by adding the 2 LLs : " + add());
    }
}