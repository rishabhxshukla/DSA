package Questions;
import java.io.*;

class Stack_Implementation
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


    /* isEmpty */
    static boolean isEmpty()
    {
        return head == null;
    }


    /* Push */
    static void push(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }


    /* Pop */
    static void pop()
    {
        head = head.next;
    }


    /* Peek */
    static int peek()
    {
        if (head == null) {
            return -1;
        }
        return head.data;
    }


    public static void main(String args[])
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Pushing nodes
        for (int i=10; i<=50; i=i+10)
        {
            System.out.println("Pushed " + i);
            push(i);
        }

        //Popping nodes
        for (int i=1; i<=2; i++)
        {
            System.out.println("Popped " +i+ " times");
            pop();
        }

        //Peeking node
        System.out.println("Top of the stack : " + peek());

        //Is stack empty
        System.out.println("isEmpty : " + isEmpty());
    }
}