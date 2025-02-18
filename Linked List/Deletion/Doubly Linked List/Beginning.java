package LinkedList.DoublyLL.Deletion;

class Beginning
{
    static Node head;
    static class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }


    /* Creating the LL */
    void create(int data)
    {
        Node new_node = new Node(data);

        if(head == null) {
            head = new_node;
            return;
        }

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = new_node;
        new_node.next = null;
        new_node.prev = temp;
    }


    /* Printing the LL */
    void print()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* Deleting the first node */
    void delete()
    {
        //If LL is empty
        if(head == null) {
            System.out.println("ERROR : List is empty");
            return;
        }

        //If only one node exists
        if(head.next == null) {
            head = null;
            return;
        }

        //Pointing head to the second node
        head = head.next;
        //Pointing prev of head to null
        head.prev = null;
    }


    public static void main(String args[])
    {
        /* Creating object of the class */
        Beginning ll = new Beginning();

        /* Creating the LL */
        for (int i = 1; i <= 5; i++)
        {
            ll.create(i);
        }

        /* Original LL */
        System.out.println("*** Original Linked List ***");
        ll.print();

        /* Deleting 1st node */
        ll.delete();

        /* New LL */
        System.out.println("\n*** New Linked List ***");
        ll.print();
    }
}