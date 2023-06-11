/* Implementation of Stack using a Linked List */
package Stack;
import java.io.*;

class LL_Implementation
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


    /* Print Stack */
    void printStk()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* Function to check if stack is empty */
    boolean isEmpty()
    {
        if (head == null)
            return true;
        else
            return false;
    }


    /* PUSH */
    void push(int d)
    {
        Node new_node = new Node(d);

        if (head == null) {
            head = new_node;
        }
        else {
            Node temp = head;
            head = new_node;
            new_node.next = temp;
        }
    }


    /* POP */
    int pop()
    {
        int popped = Integer.MIN_VALUE;
        if (head == null) {
            System.out.println("Stack Underflow!");
        }
        else {
            popped = head.data;
            head = head.next;
        }
        return popped;
    }


    /* PEEK */
    int peek()
    {
        if (head == null) {
            System.out.println("Stack Underflow!");
            return Integer.MIN_VALUE;
        }
        else {
            return head.data;
        }
    }


    public static void main(String[] args) throws IOException
    {
        //Creating object of the class
        LL_Implementation s = new LL_Implementation();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the stack
        for (int i=0; i<6; i++)
        {
            System.out.print("Enter the data : ");
            int d = Integer.parseInt(b.readLine());
            s.push(d);
        }

        //Printing original stack
        System.out.println("*** Original Stack ***");
        s.printStk();

        //Performing operations
        System.out.println("\n\nTop element : " + s.peek());
        System.out.println("Removing " +s.peek()+ " from stack..");
        s.pop();
        System.out.println("Top element : " + s.peek());
        System.out.println("Removing " +s.peek()+ " from stack..");
        s.pop();

        //Printing new stack
        System.out.println("\n*** New Stack ***");
        s.printStk();
    }
}