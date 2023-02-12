// PREORDER : (+ab) : Root --> Left --> Right

package Traversals;
import java.io.*;

class Preorder
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

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;
    }


    /* Preorder traversal of binary tree */
    void print(Node temp)
    {
        //1 2 4 5 3
        if (temp == null) {
            return;
        }
        System.out.print(temp.data + " ");
        print(temp.left);
        print(temp.right);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Preorder t = new Preorder();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print(root);
    }
}