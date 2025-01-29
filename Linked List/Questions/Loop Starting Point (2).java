// Find the starting point of a loop in the linked list
// TORTOISE & HARE ALGORITHM (or) FLOYD’S CYCLE DETECTION ALGORITHM

package LinkedList.Questions;

class LoopStartingPoint2
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


    /* Function to find the starting point of a loop the LL */
    static Node startingPoint()
    {
        Node slow = head;
        Node fast = head;

        //Stop the search when fast is null or fast points to null
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            //If a loop is detected in the LL
            if (slow == fast)
            {
                //To find the starting point, move slow pointer to head
                slow = head;

                //Again move the slow & fast pointers but this time by 1 step
                while (slow != fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }

                //Return the collision node
                return slow;
            }
        }

        return null;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        LoopStartingPoint2 ll = new LoopStartingPoint2();

        //Creating the LL
        ll.create();

        //Printing the LL
        System.out.println("Created Linked List : ");
        ll.print();

        //Printing the result
        Node ans = startingPoint();
        if (ans != null) {
            System.out.println("\nStarting Point : " + ans.data);
        }
        else {
            System.out.println("\nNo loop detected in the linked list.");
        }
    }
}