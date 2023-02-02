package Deletion;

class Delete_Beginning
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


    /* Deleting the first node */
    void deleteNode()
    {
        /* IF LL IS EMPTY */
        if(head == null) {
            System.out.println("ERROR : List is empty");
            return;
        }
        /* ELSE */
        //Pointing the head to the second node
        head = head.next;
    }


    /* Printing the LL */
    void printLL()
    {
        //Storing the value of head in a temp variable
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String args[])
    {
        /* Creating object of the class */
        Delete_Beginning obj = new Delete_Beginning();

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

        /* Deleting 1st node */
        obj.deleteNode();

        /* New list */
        System.out.println("\nNew Linked List :");
        obj.printLL();
    }
}