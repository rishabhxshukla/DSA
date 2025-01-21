/*
Find the intersection point of 2 linked list

               10 -> 20
                       \
                        30 -> 40 -> 50
                       /
   60 -> 70 -> 80 -> 90
*/
// SAME START POINT

package LinkedList.Questions;
import java.io.*;

class IntersectionPoint2
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
    void create()
    {
        //Common node for intersection
        Node common = new Node(30);

        //1st Linked List
        head1 = new Node(10);
        Node second1 = new Node(20);
        Node fourth1 = new Node(40);
        Node fifth1  = new Node(50);

        head1.next   = second1;
        second1.next = common;
        common.next  = fourth1;
        fourth1.next = fifth1;

        //2nd Linked List
        head2 = new Node(60);
        Node second2 = new Node(70);
        Node third2  = new Node(80);
        Node fourth2 = new Node(90);

        head2.next   = second2;
        second2.next = third2;
        third2.next  = fourth2;
        fourth2.next = common;
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


    /* Helper function to find the length of linked list */
    static int length(Node head)
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


    /* Function to find the intersection point */
    Node intersection(Node head1, Node head2)
    {
        Node temp1 = head1;
        Node temp2 = head2;

        //Find the length of the linked lists
        int length1 = length(head1);
        int length2 = length(head2);

        //Calculate the difference in lengths
        int diff = Math.abs(length1 - length2);

        //Move the pointer of the longer list ahead by the difference
        if (length1 > length2)
        {
            while (diff > 0)
            {
                temp1 = temp1.next;
                diff--;
            }
        }
        else
        {
            while (diff > 0)
            {
                temp2 = temp2.next;
                diff--;
            }
        }

        //Now traverse both lists simultaneously to find the intersection point
        while (temp1 != null && temp2 != null)
        {
            //If both nodes are same, that means it is the intersection point
            if (temp1 == temp2) {
                return temp1;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        IntersectionPoint2 ll = new IntersectionPoint2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        ll.create();

        //Printing the LL
        System.out.println("Created Linked Lists : ");
        ll.print(head1);
        System.out.println();
        ll.print(head2);

        //Finding the intersection point
        Node ans = ll.intersection(head1, head2);
        if (ans != null) {
            System.out.println("\nThe intersection point is : " + ans.data);
        }
        else {
            System.out.println("\nThe 2 given linked lists do not intersect.");
        }
    }
}