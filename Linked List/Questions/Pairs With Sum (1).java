// Find all the pairs with the given sum in a doubly linked list
// 2 POINTERS

package LinkedList.Questions;
import java.io.*;

class PairsWithSum1
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


    /* Function to find all the pairs with the given sum */
    void findPairs(int sum)
    {
        //1st pointer from head
        Node temp1 = head;

        while (temp1 != null)
        {
            //2nd pointer from next of temp1 to avoid duplicates
            Node temp2 = temp1.next;

            while (temp2 != null)
            {
                //If a pair is found, print it
                if (temp1.data + temp2.data == sum)
                {
                    System.out.print("(" + temp1.data + ", " + temp2.data + ") ");
                }

                temp2 = temp2.next;
            }

            temp1 = temp1.next;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        PairsWithSum1 ll = new PairsWithSum1();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i = 1; i <= 5; i++)
        {
            ll.create(i);
        }

        //Printing original LL
        System.out.println("Created Linked List : ");
        ll.print();

        //Finding the pairs
        System.out.println("\nPairs with sum 5 are :");
        ll.findPairs(5);
    }
}