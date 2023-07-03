package LinkedList.Questions;
import java.io.*;
import java.util.*;

class Sum_Last_N_Nodes2
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
    void add(int d)
    {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }


    /* Function to find length of LL */
    static int lengthOfLL()
    {
        Node temp = head;
        int count = 0;

        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }


    /* Function to find sum of last N nodes */
    static int sum(int N)
    {
        //Creating a stack
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        int sum = 0;

        //Storing all nodes in the stack
        while (temp != null)
        {
            stack.push(temp.data);
            temp = temp.next;
        }

        //Taking out nodes from stack and calculating the sum
        for (int i=0; i<N; i++)
        {
            sum = sum + stack.peek();
            stack.pop();
        }
        return sum;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Sum_Last_N_Nodes2 ll = new Sum_Last_N_Nodes2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            ll.add(d);
        }

        //Printing the LL
        System.out.println("Created Linked List : ");
        ll.printLL();

        //Taking user input
        System.out.print("\nEnter the value of N : ");
        int N = Integer.parseInt(b.readLine());

        //Printing the sum
        System.out.print("Sum of last n nodes : " + sum(N));
    }
}