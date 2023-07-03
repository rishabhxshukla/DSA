// Floyd’s Cycle Detection Algorithm Method

package LinkedList.Questions;


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
        //Creating object of the class
        Loop_Length ll = new Loop_Length();

        //Creating the LL
        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        //Linking the Nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;     // <----

        //Printing the LL
        System.out.println("Created Linked List : ");
        ll.printLL();

        //Printing the length of loop
        System.out.println("Loop length : " + isLoop());
    }
}