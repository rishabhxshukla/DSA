// A binary tree is symmetric if it is the mirror image of itself
/*
For two trees to be mirror images, they must follow these 3 conditions :
1) Their root node must be same.
2) left subtree of left tree and right subtree of right tree have to be mirror images.
3) right subtree of left tree and left subtree of right tree have to be mirror images.
*/

package Questions;
import java.util.*;

class Symmetric
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
        Node third   = new Node(2);
        Node fourth  = new Node(3);
        Node fifth   = new Node(4);
        Node sixth   = new Node(4);
        Node seventh = new Node(3);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

        /* Created BT :
             1
           /   \
          2     2
         / \   / \
        3   4 4   3
        */
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


    /* Function to check if a BT is mirror of itself */
    static boolean isMirror(Node a, Node b)
    {
        //If both trees are empty
        if (a == null && b == null) {
            return true;
        }

        //If both trees are non-empty
        if (a != null && b != null)
        {
            return (
                    a.data == b.data &&
                    isMirror(a.left, b.right) &&
                    isMirror(a.right, b.left)
            );
        }

        //Else return false
        return false;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Symmetric t = new Symmetric();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Checking if BT is symmetric
        if (isMirror(root, root))
            System.out.println("\nGiven binary tree is Symmetric.");
        else
            System.out.println("\nGiven binary tree is not Symmetric.");
    }
}