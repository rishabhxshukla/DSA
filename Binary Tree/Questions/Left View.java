package Questions;
import java.util.*;

class LeftView
{
    static int maxlevel = 0;
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


    /* Function to print the left view of BT */
    void leftView(Node temp, int level)
    {
        //Base case
        if (temp == null) {
            return;
        }

        //If this is the first node of the level
        if (maxlevel < level) {
            System.out.print(temp.data + " ");
            maxlevel = level;
        }

        //Recur for left and right subtrees
        leftView(temp.left, level + 1);
        leftView(temp.right, level + 1);
    }


    public static void main(String args[])
    {
        //Creating object of the class
        LeftView t = new LeftView();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing left view of BT
        System.out.println("\nLeft View Of Binary Tree : ");
        t.leftView(root, 1);
    }
}