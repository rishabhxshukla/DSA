// Print all the paths from root to leaf nodes
// Use Preorder traversal + Stack

package Questions;
import java.util.*;

class Root_to_Leaf
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


    /* Function to print the path from root to leaf nodes */

    //Initializing a Stack
    Stack<Integer> s = new Stack<>();
    void RootToLeaf(Node temp)
    {
        if (temp == null) {
            return;
        }

        //Pushing the current node in stack
        s.push(temp.data);

        //Printing the path if leaf node is encountered
        if (temp.left == null && temp.right == null) {
            System.out.println(s);
        }

        RootToLeaf(temp.left);
        RootToLeaf(temp.right);

        //Popping the leaf node
        s.pop();
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Root_to_Leaf t = new Root_to_Leaf();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing root to leaf path
        System.out.println("\nRoot to Leaves path : ");
        t.RootToLeaf(root);
    }
}