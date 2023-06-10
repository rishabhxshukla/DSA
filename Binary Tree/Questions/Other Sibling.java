// For 2 nodes to be siblings, their parent node must be same.

package BinaryTree.Questions;
import java.io.*;
import java.util.*;

class OtherSibling
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


    /* Function to return the other sibling of a given node */
    static Node otherSibling(Node temp, int x)
    {
        //Empty tree
        if (temp == null) {
            return null;
        }

        //Root node
        if (temp.data == x)
            return null;

        //If node is found
        if (temp.left != null && temp.left.data == x)
            return temp.right;
        if (temp.right != null && temp.right.data == x)
            return temp.left;

        //Checking in left subtree
        Node l = otherSibling(temp.left, x);
        if (l != null)
            return l;

        //Checking in right subtree
        l = otherSibling(temp.right, x);
        return l;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        OtherSibling t = new OtherSibling();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        System.out.print("\nEnter the node : ");
        int x = Integer.parseInt(b.readLine());

        //Getting the other sibling
        System.out.print("Result : ");
        Node other = otherSibling(root, x);

        if (other == null)
            System.out.println("null");
        else
            System.out.println(other.data);
    }
}