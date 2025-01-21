/*
Find the intersection point of 2 linked list

               80 - 90
              /
   10 - 20 - 30 - 40 - 50
            /
     60 - 70
*/
// HASHSET

package LinkedList.Questions;
import java.io.*;
import java.util.HashSet;

class IntersectionPoint
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

        //Other nodes
        Node fourth1 = new Node(40);
        Node fifth1  = new Node(50);
        Node fourth2 = new Node(80);
        Node fifth2  = new Node(90);

        //Linking the shared part
        common.next  = fourth1;   // 30 -> 40
        fourth1.next = fifth1;    // 40 -> 50
        fourth2.next = fifth2;    // 80 -> 90

        //1st Linked List
        head1 = new Node(10);
        Node second1 = new Node(20);

        head1.next   = second1;
        second1.next = common;    // 10 -> 20 -> 30 -> ...

        // 2nd Linked List
        head2 = new Node(60);
        Node second2 = new Node(70);

        head2.next   = second2;
        second2.next = common;    // 60 -> 70 -> 30 -> ...
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


    /* Function to find the intersection point */
    Node intersection(Node head1, Node head2)
    {
        HashSet<Node> hs = new HashSet<>();

        //Storing all the nodes of 1st LL
        Node temp = head1;
        while (temp != null)
        {
            hs.add(temp);
            temp = temp.next;
        }

        //Comparing with nodes of 2nd LL
        temp = head2;
        while (temp != null)
        {
            if (hs.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        IntersectionPoint ll = new IntersectionPoint();
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