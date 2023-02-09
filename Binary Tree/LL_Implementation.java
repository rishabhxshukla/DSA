/* Implementation of Binary Tree using a Linked List */
package BinaryTree;
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


    /* Adding new node in the binary tree */
    void add(int data)
    {
        //Allocating memory for new node
        Node new_node = new Node(data);
        /* IF TREE IS EMPTY */
        if (root == null) {
            root = new_node;
            return;
        }
        /* ELSE */
        Node focus = root;
        Node parent;

        while (true)
        {
            parent = focus;

            if (data < focus.data)
            {
                focus = focus.left;
                if (focus == null)
                {
                    parent.left = new_node;
                    return;
                }
            }
            else
            {
                focus = focus.right;
                if (focus == null)
                {
                    parent.right = new_node;
                    return;
                }
            }
        }
    }


    /* Preorder traversal of binary tree */
    void traversal(Node focus)
    {
        if (focus != null)
        {
            System.out.print(focus.data + " ");
            traversal(focus.left);
            traversal(focus.right);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        LL_Implementation bt = new LL_Implementation();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Assigning the Nodes
        for (int i=0; i<7; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            bt.add(d);
        }

        //Printing the Binary Tree
        System.out.println("*** Created Binary Tree ***");
        bt.traversal(root);
    }
}