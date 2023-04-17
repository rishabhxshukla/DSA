/* Height of BT is the number of nodes along the longest path
from the root node down to the farthest leaf node. */

package Questions;
import java.util.*;

class HeightOfBT
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
        Node first  = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);
        Node fourth = new Node(4);
        Node fifth  = new Node(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
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


    /* Function to find the height of BT */
    static int heightOfBT(Node temp)
    {
        if (temp == null) {
            return 0;
        }

        //Height of each subtree
        int lheight = heightOfBT(temp.left);
        int rheight = heightOfBT(temp.right);

        //Using the larger one
        if (lheight > rheight)
            return (lheight + 1);
        else
            return (rheight + 1);
    }


    public static void main(String args[])
    {
        //Creating object of the class
        HeightOfBT t = new HeightOfBT();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing height of BT
        System.out.println("\nHeight : " + heightOfBT(root));
    }
}