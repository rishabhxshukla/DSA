/*
For a tree to be balanced :
1) Left subtree should be balanced
2) Right subtree should be balanced
3) (Height of left subtree) - (Height of right subtree) <= 1
*/

package Questions;
import java.util.*;

class BalancedTree
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
            if(temp.right != null) {
                q.add(temp.right);
            }
        }
    }


    /* Function to find the height of BT */
    static int height(Node temp)
    {
        if (temp == null) {
            return 0;
        }

        //Height of each subtree
        int left = height(temp.left);
        int right = height(temp.right);

        //Using the larger one
        if (left > right)
            return (left + 1);
        else
            return (right + 1);
    }


    /* Function to find if BT is balanced */
    static boolean isBalanced(Node temp)
    {
        if (temp == null) {
            return true;
        }

        boolean left  = isBalanced(temp.left);
        boolean right = isBalanced(temp.right);
        boolean diff  = (height(temp.left) - height(temp.right)) <= 1;

        //If left & right subtrees are balanced + diff <= 1
        if (left && right && diff)
            return true;
        else
            return false;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        BalancedTree t = new BalancedTree();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Is BT balanced
        System.out.println("\nisBalanced : " + isBalanced(root));
    }
}