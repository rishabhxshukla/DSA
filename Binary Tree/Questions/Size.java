// Size of BT = (Size of left subtree) + (Size of right subtree) + 1

package Questions;
import java.util.*;

class Size
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


    /* Function to find the size of BT */
    static int size(Node temp)
    {
        if (temp == null) {
            return 0;
        }

        //Size of each subtree
        int left = size(temp.left);
        int right = size(temp.right);

        return left + right + 1;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Size t = new Size();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing size of BT
        System.out.println("\nSize : " + size(root));
    }
}