// Print all the paths from leaf to root node
// Use Preorder traversal + Stack Reverse

package BinaryTree.Questions;
import java.util.*;

class Leaf_to_Root
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


    /* Function to print the path from leaves to root node */

    //Initializing a Stack
    Stack<Integer> s = new Stack<>();
    void LeafToRoot(Node temp)
    {
        if (temp == null) {
            return;
        }

        //Pushing the current node in stack
        s.push(temp.data);

        //Printing the path if leaf node is encountered
        if (temp.left == null && temp.right == null)
        {
            //Copying the items in a temporary stack
            Stack<Integer> t = new Stack<>();
            t.addAll(s);

            //Printing the nodes in reverse order
            while (!t.isEmpty())
            {
                System.out.print(t.pop() + " ");
            }
            System.out.println();
        }

        LeafToRoot(temp.left);
        LeafToRoot(temp.right);

        //Popping the leaf node
        s.pop();
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Leaf_to_Root t = new Leaf_to_Root();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing leaf to root path
        System.out.println("\nLeaves to Root path : ");
        t.LeafToRoot(root);
    }
}