// POSTORDER : (ab+) : Left --> Right --> Root

package BinaryTree.Traversals;
import java.io.*;

class Postorder
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


    /* Postorder traversal of binary tree */
    void print(Node temp)
    {
        //4 5 2 3 1
        if (temp == null) {
            return;
        }
        print(temp.left);
        print(temp.right);
        System.out.print(temp.data + " ");
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Postorder t = new Postorder();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print(root);
    }
}