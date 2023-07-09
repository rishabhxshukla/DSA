// Detect and remove loop in a linked list
// Floyd’s Cycle Detection Algorithm

package LinkedList.Questions;

class LoopRemove
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
        fifth.next  = third;     // <----
    }


    /* Printing the LL */
    void print()
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
                //Storing the node where slow and fast pointers meet
                Node temp = fast;
                //Pointing that node to null to end the loop
                temp.next = null;
                return true;
            }
        }

        return false;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        LoopRemove ll = new LoopRemove();

        //Creating the LL
        ll.create();

        //Printing the LL
        System.out.println("Created Linked List : ");
        ll.print();

        //Removing the loop
        System.out.println("\nLoop removed : " + removeLoop());
    }
}