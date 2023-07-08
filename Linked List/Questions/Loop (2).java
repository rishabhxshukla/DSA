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


    /* Printing the LL */
    void printLL()
    {
        System.out.println("10 20 30 40 50");
    }


    /* Function to find loop in LL */
    static boolean isLoop()
    {
        HashSet<Node> set = new HashSet<>();
        Node temp = head;

        while (temp != null)
        {
            //If HashSet already contains the node
            if (set.contains(temp)) {
                return true;
            }
            //Otherwise, add it to the HashSet
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        DetectLoop2 ll = new DetectLoop2();

        //Creating the LL
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
        fifth.next  = third;     // <----

        //Printing the LL
        System.out.println("Created Linked List : ");
        ll.printLL();

        //Printing the result
        System.out.println("Loop : " + isLoop());
    }
}