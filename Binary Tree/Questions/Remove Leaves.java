package Questions;
import java.util.*;

class RemoveLeaves
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


    /* Function to remove leaves of BT */
    Node remove(Node temp)
    {
        if (temp == null) {
            return null;
        }

        //If node is a leaf node
        if (temp.left == null && temp.right == null) {
            return null;
        }

        Node left = remove(temp.left);
        Node right = remove(temp.right);

        //left and right of the parent node becomes null
        //Therefore the parent node points to null on both its sides
        temp.left = left;
        temp.right = right;

        return temp;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        RemoveLeaves t = new RemoveLeaves();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Removing leaf nodes of BT
        System.out.println("\nRemoving leaf nodes...");
        t.remove(root);

        System.out.println("New Binary Tree : ");
        t.print();
    }
}