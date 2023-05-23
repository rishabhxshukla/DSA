/*
For 2 nodes to be cousins :
1) Parent node should not be same.
2) Both should be on the same level.
*/

package Questions;
import java.io.*;
import java.util.*;

class Cousins
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


    /* Helper function */
    int xLevel = -1, yLevel = -1;
    Node xParent = null, yParent = null;
    void helper(Node temp, int x, int y, int level, Node parent)
    {
        if (temp == null) {
            return;
        }

        if (temp.data == x) {
            xParent = parent;
            xLevel = level;
        }
        if (temp.data == y) {
            yParent = parent;
            yLevel = level;
        }

        helper(temp.left, x, y, level+1, temp);
        helper(temp.right, x, y, level+1, temp);
    }


    /* Function to check if 2 given nodes are cousins */
    boolean cousins(Node temp, int x, int y)
    {
        Cousins t = new Cousins();
        t.helper(temp, x, y, 0, null);

        if ((xLevel == yLevel) && (xParent != yParent))
            return true;
        else
            return false;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Cousins t = new Cousins();
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

        //Checking if nodes are cousins
        System.out.println("Result : " + t.cousins(root, x, y));
    }
}