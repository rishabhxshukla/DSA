package BinaryTree;
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
            this.left = this.right = null;
        }
    }


    /* Function to create a binary tree */
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
        if (temp != null)
        {
            System.out.print(temp.data + " ");
            print(temp.left);
            print(temp.right);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Preorder t = new Preorder();

        //Creating the binary tree
        t.create();

        //Printing the Binary Tree
        System.out.println("*** Created Binary Tree ***");
        t.print(root);
    }
}