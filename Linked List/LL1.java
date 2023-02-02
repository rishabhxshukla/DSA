/* A simple linked list representation with 3 nodes */

class LL1
{
    static Node head;

    static class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    
    /* Printing the LL */
    void printList()
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
        LL1 obj = new LL1();

        /* Assigning the Nodes */
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        /* Three nodes have been allocated dynamically.
          We have references to these 3 blocks as head, second and third */

        //Link 1st node with 2nd
        head.next = second;
        //Link 2nd node with 3rd
        second.next = third;

        /* Printing the Linked List */
        obj.printList();
    }
}