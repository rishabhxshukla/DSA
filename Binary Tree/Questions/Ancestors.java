package BinaryTree.Questions;
import java.util.*;

class Ancestors
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


    /* Function to find the ancestors of a given node */
    boolean ancestors(Node temp, int key)
    {
        //Base case
        if (temp == null) {
            return false;
        }

        //If node is found
        if (temp.data == key) {
            return true;
        }

        //Else check in both left & right subtrees
        boolean left = ancestors(temp.left, key);
        boolean right = ancestors(temp.right, key);
        if (left || right) {
            System.out.print(temp.data + " ");
            return true;
        }

        return false;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Ancestors t = new Ancestors();
        Scanner sc = new Scanner(System.in);

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        System.out.print("\nEnter the node for which you want to find the ancestors : ");
        int key = sc.nextInt();

        //Printing ancestors of the given node
        System.out.println("Ancestors : ");
        t.ancestors(root, key);
    }
}