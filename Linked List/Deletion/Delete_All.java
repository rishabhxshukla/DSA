package Deletion;

class Delete_All
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


    /* Deleting the full Linked List */
    void deleteLL()
    {
        head = null;
    }


    /* Printing the LL */
    void printLL()
    {
        //Storing the value of head in a temp variable
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String args[])
    {
        /* Creating object of the class */
        Delete_All obj = new Delete_All();

        /* Assigning the Nodes */
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        /* Linking the Nodes */
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        /* Original List */
        System.out.println("Original Linked List :");
        obj.printLL();

        /* Deleting full linked list */
        obj.deleteLL();

        /* New list */
        System.out.println("\nNew Linked List :");
        obj.printLL();
    }
}