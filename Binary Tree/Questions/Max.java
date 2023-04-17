// Maximum node of BT = Compare (Max of left subtree), (Max of right subtree), (Current node)

package Questions;
import java.util.*;

class Max
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


    /* Function to find the maximum node of BT */
    static int max(Node temp)
    {
        if (temp == null) {
            return 0;
        }

        //Max of each subtree
        int left = max(temp.left);
        int right = max(temp.right);

        return Math.max(Math.max(left, right), temp.data);
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Max t = new Max();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing max of BT
        System.out.println("\nMaximum node : " + max(root));
    }
}