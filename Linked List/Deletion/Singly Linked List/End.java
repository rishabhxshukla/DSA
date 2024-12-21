package LinkedList.SinglyLL.Deletion;

class End
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


    /* Deleting the last node */
    void delete()
    {
        //If we have 0 or 1 node
        if (head == null || head.next == null) {
            System.out.println("ERROR : Not enough nodes present");
            return;
        }

        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }

        //Deleting the last node
        temp.next = null;
    }


    public static void main(String args[])
    {
        /* Creating object of the class */
        End ll = new End();

        /* Creating the LL */
        for (int i = 1; i <= 5; i++)
        {
            ll.create(i);
        }

        /* Original LL */
        System.out.println("*** Original Linked List ***");
        ll.print();

        /* Deleting last node */
        ll.delete();

        /* New LL */
        System.out.println("\n*** New Linked List ***");
        ll.print();
    }
}