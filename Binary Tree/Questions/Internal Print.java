// Print the internal nodes of a BT

package BinaryTree.Questions;
import java.util.*;

class InternalPrint
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


    /* Function to print the internal nodes of a BT */
    void printInternal(Node temp)
    {
        //Base case: empty tree
        if (temp == null) {
            return;
        }

        //Base case: internal node
        if (temp.left != null || temp.right != null) {
            System.out.print(temp.data + " ");
        }

        printInternal(temp.left);
        printInternal(temp.right);
    }


    public static void main(String args[])
    {
        //Creating object of the class
        InternalPrint t = new InternalPrint();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing the internal nodes
        System.out.println("\nInternal nodes : ");
        t.printInternal(root);
    }
}