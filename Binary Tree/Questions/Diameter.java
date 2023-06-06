// Diameter = No. of nodes on the longest path between two end nodes

package Questions;
import java.util.*;

class Diameter
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


    // TIME COMPLEXITY : O(N²)
    /* Function to find the diameter of BT */
    /*
    static int diameter(Node temp)
    {
        //Empty tree
        if (temp == null)
            return 0;

        int left = diameter(temp.left);                           //Ans in left subtree
        int right = diameter(temp.right);                         //Ans in right subtree
        int both = height(temp.left) + height(temp.right) + 1;    //Ans including root

        return Math.max(Math.max(left, right), both);
    }
    static int height(Node temp)
    {
        if (temp == null) {
            return 0;
        }

        int left = height(temp.left);
        int right = height(temp.right);

        return (Math.max(left, right) + 1);
    }
    */


    // TIME COMPLEXITY : O(N)
    /* Function to find the diameter of BT */
    static int diameter = 0;
    static int height(Node temp)
    {
        if (temp == null) {
            return 0;
        }

        int left = height(temp.left);
        int right = height(temp.right);
        diameter = Math.max(diameter, left+right+1);

        return (Math.max(left, right) + 1);
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Diameter t = new Diameter();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing diameter of BT using height function
        height(root);
        System.out.println("\nDiameter : " + diameter);
    }
}