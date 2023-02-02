package Questions;

/* Floyd’s Cycle Detection Algorithm Method */

class Loop_Remove
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


    /* Function to remove loop from a LL */
    static boolean removeLoop()
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
            {
                //Storing the value of node where slow and fast pointer meet
                Node temp = fast;
                //Pointing the value to null to end the loop
                temp.next = null;
                return true;
            }
        }
        return false;
    }


    public static void main(String args[])
    {
        /* Creating object of the class */
        Loop_Remove ll = new Loop_Remove();

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

        System.out.println("Loop removed output : " + removeLoop());
    }
}