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
        Node temp = root;
        Node parent;

        while (true)
        {
            parent = temp;

            //If the new node’s value is lower than the current node, go to the left child
            if (data < temp.data)
            {
                temp = temp.left;
                //When the current node is null, we have reached a leaf node,
                //we insert the new node in this position
                if (temp == null)
                {
                    parent.left = new_node;
                    return;
                }
            }

            //Else go to the right child
            else
            {
                temp = temp.right;
                //When the current node is null, we have reached a leaf node,
                //we insert the new node in this position
                if (temp == null)
                {
                    parent.right = new_node;
                    return;
                }
            }
        }
    }


    /* Preorder traversal of binary tree */
    void print(Node temp)
    {
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
        LL_Implementation t = new LL_Implementation();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Assigning the Nodes
        for (int i=0; i<7; i++)
        {
            System.out.print("Enter the node : ");
            int d = Integer.parseInt(b.readLine());
            t.add(d);
        }

        //Printing the Binary Tree
        System.out.println("*** Created Binary Tree ***");
        t.print(root);
    }
}