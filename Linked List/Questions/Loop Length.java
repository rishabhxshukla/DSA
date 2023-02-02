package Questions;

                    /* Floyd’s Cycle Detection Algorithm Method */

class Loop_Length
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
    static int isLoop()
    {
        Node slow = head;
        Node fast = head;

        //Stop the search when fast is null or fast points to null
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return lengthOfLoop(fast);
            }
        }
        return 0;
    }


    /* Function to find loop length in LL */
    static int lengthOfLoop(Node n)
    {
        Node temp = n;
        int count = 1;

        while (temp.next != n)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }


    public static void main(String args[])
    {
        /* Creating object of the class */
       Questions.Loop_Remove ll = new Questions.Loop_Remove();

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

        System.out.println("Loop length : " + isLoop());
    }
}