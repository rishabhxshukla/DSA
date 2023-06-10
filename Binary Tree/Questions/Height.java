/* Height of BT is the number of nodes along the longest path
from the root node down to the farthest leaf node. */

package BinaryTree.Questions;
import java.util.*;

class Height
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


    /* Function to find the height of BT */
    static int height(Node temp)
    {
        if (temp == null) {
            return 0;
        }

        //Height of each subtree
        int left = height(temp.left);
        int right = height(temp.right);

        //Using the larger one
        return (Math.max(left, right) + 1);
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Height t = new Height();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing height of BT
        System.out.println("\nHeight : " + height(root));
    }
}