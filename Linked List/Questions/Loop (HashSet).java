package LinkedList.Questions;

/* Floyd’s Cycle-Finding Algorithm Method */

import java.util.HashSet;

class Detect_Loop_HashSet
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


    /* Creating the LL */
    void add(int d)
    {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }


    /* Function to find loop in LL */
    static boolean isLoop()
    {
        //Creating a Hash Set
        HashSet<Node> set = new HashSet<>();
        Node temp = head;

        while (temp != null)
        {
            if (set.contains(temp)) {
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }


    public static void main(String args[])
    {
        /* Creating object of the class */
        Detect_Loop_HashSet ll = new Detect_Loop_HashSet();

        /* Assigning the Nodes */
        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        /* Linking the Nodes */
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;     // <-----

        System.out.println("Created Linked List : ");
        ll.printLL();

        System.out.println("Loop : " + isLoop());
    }
}