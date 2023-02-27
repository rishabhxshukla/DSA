/* Implementation of Binary Search Tree using a Linked List */
package BinarySearchTree;
import java.io.*;

class LL_Implementation
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


    /* Creating the BST */
    Node add(Node temp, int data)
    {
        //Allocating memory for new node
        Node new_node = new Node(data);

        /* IF TREE IS EMPTY */
        if (root == null) {
            root = new_node;
            return root;
        }

        /* ELSE */
        if (data < temp.data)
        {
            temp.left = add(temp.left, data);
        }
        else
        {
            temp.right = add(temp.right, data);
        }

        return new_node;
    }


    /* Printing the BST */
    void print(Node temp)
    {
        if (temp == null) {
            return;
        }
        print(temp.left);
        System.out.print(temp.data + " ");
        print(temp.right);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        LL_Implementation t = new LL_Implementation();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Assigning the Nodes
//        for (int i=0; i<7; i++)
//        {
//            System.out.print("Enter the node : ");
//            int d = Integer.parseInt(b.readLine());
//            t.add(root, d);
//        }

        root = null;
        root = t.add(root, 10);
        t.add(root, 20);
        t.add(root, 30);
        t.add(root, 40);
        t.add(root, 50);
        t.add(root, 60);
        t.add(root, 70);
        t.add(root, 80);

        //Printing the Binary Tree
        System.out.println("*** Created Binary Search Tree ***");
        t.print(root);
    }
}