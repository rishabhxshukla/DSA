// For 2 nodes to be siblings, their parent node must be same.

package Questions;
import java.io.*;
import java.util.*;

class Siblings
{
    static Node root;
    static class Node
    {
        int data;
        Node left, right;

        Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }


    /* Creating the BT */
    void create()
    {
        Node first   = new Node(1);
        Node second  = new Node(2);
        Node third   = new Node(3);
        Node fourth  = new Node(4);
        Node fifth   = new Node(5);
        Node sixth   = new Node(6);
        Node seventh = new Node(7);

        root = first;
        first.left   = second;
        first.right  = third;
        second.left  = fourth;
        second.right = fifth;
        third.left   = sixth;
        third.right  = seventh;
    }


    /* Printing the BT */
    void print()
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty())
        {
            Node temp = q.remove();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }


    /* Function to check if 2 given nodes are siblings */
    boolean siblings(Node temp, int x, int y)
    {
        if (temp == null) {
            return false;
        }

        if (temp.left != null && temp.right != null)
        {
            if ((temp.left.data == x && temp.right.data == y) ||
                    (temp.left.data == y && temp.right.data == x) ||
                    (siblings(temp.left, x, y)) ||
                    (siblings(temp.right, x, y)))
            {
                return true;
            }
        }

        return false;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Siblings t = new Siblings();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        System.out.print("\nEnter 1st node : ");
        int x = Integer.parseInt(b.readLine());
        System.out.print("Enter 2nd node : ");
        int y = Integer.parseInt(b.readLine());

        //Checking if nodes are siblings
        System.out.println("Result : " + t.siblings(root, x, y));
    }
}