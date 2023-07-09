// Detect loop or cycle in a linked list
// HASHSET

package LinkedList.Questions;
import java.util.HashSet;

class DetectLoop2
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


    /* Creating the LL */
    void create()
    {
        head = new Node(10);
        Node second = new Node(20);
        Node third  = new Node(30);
        Node fourth = new Node(40);
        Node fifth  = new Node(50);

        //Linking the Nodes
        head.next   = second;
        second.next = third;
        third.next  = fourth;
        fourth.next = fifth;
        fifth.next  = third;     //<---
    }


    /* Printing the LL */
    void printLL()
    {
        Node temp = head;   //Current node
        int n = 0;          //No. of nodes

        //Printing the nodes
        while (temp != null && n < 5)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
            n++;
        }
    }


    /* Function to find loop in LL */
    static boolean isLoop()
    {
        HashSet<Node> hs = new HashSet<>();
        Node temp = head;

        while (temp != null)
        {
            //If HashSet already contains the node
            if (hs.contains(temp)) {
                return true;
            }
            //Otherwise, add it to the HashSet
            hs.add(temp);
            temp = temp.next;
        }
        return false;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        DetectLoop2 ll = new DetectLoop2();

        //Creating the LL
        ll.create();

        //Printing the LL
        System.out.println("Created Linked List : ");
        ll.printLL();

        //Printing the result
        System.out.println("\nLoop : " + isLoop());
    }
}