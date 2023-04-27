// Minimum node of BT = Compare (Min of left subtree), (Min of right subtree), (Current node)

package Questions;
import java.util.*;

class Min
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


    /* Function to find the minimum node of BT */
    static int min(Node temp)
    {
        //Returning highest integer value so that on comparing leaf node becomes the minimum of the two
        if (temp == null) {
            return Integer.MAX_VALUE;
        }

        //Min of each subtree
        int left = min(temp.left);
        int right = min(temp.right);

        return Math.min(Math.min(left, right), temp.data);
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Min t = new Min();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing min of BT
        System.out.println("\nMinimum node : " + min(root));
    }
}