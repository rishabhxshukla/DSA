package Linked_List;
/* BOILERPLATE PROGRAM FOR LINKED LIST */

/* The inner class is made static so that main() method can access it.
We can also put this class in a different file and access it from there */

/* Here we use a constructor call inside the node class to minimize the memory allocation work */


/* METHOD 1 */
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedList
{
    static Node head;
    //Your code starts here..
}



/* <<---------------------------------------  OR  ------------------------------------------------>> */



/* METHOD 2 */
class LinkedList2
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
}