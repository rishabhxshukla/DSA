package LinkedList.Questions;
import java.io.*;

class Delete_Without_Head
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
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* Creating the LL */
    void add(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }


    /* Function to get the node which is to be deleted */
    static Node getNode(int key)
    {
        Node temp = head;

        while (temp != null)
        {
            if (temp.data == key) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }


    /* Function to delete a node without the head node */
    void delete(Node temp)
    {
        //If LL is empty
        if (temp == null) {
            return;
        }
        //If node to be deleted is the last node
        else if (temp.next == null) {
            System.out.println("Last node cannot be deleted without the head node!");
            return;
        }

        //Storing the next node in the current node
        //1->2->3->4  =>  1->3->3->4
        temp.data = temp.next.data;

        //Breaking link to the next node
        //1->3->4
        temp.next = temp.next.next;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Delete_Without_Head ll = new Delete_Without_Head();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        //Printing original LL
        System.out.println("Created Linked List : ");
        ll.printLL();

        //Taking user input
        System.out.print("\nEnter the node that you want to delete : ");
        int key = Integer.parseInt(b.readLine());
        Node temp = getNode(key);

        //Deleting desired node
        System.out.println("Deleting...");
        ll.delete(temp);
        /*
          We can directly pass node like this :
          ll.delete(head.next.next);
        */

        //Printing new LL
        System.out.println("New Linked List : ");
        ll.printLL();
    }
}