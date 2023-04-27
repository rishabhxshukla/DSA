// Mirror of Binary Tree = Left and Right child of all non-leaf nodes interchanged

package Questions;
import java.util.*;

class Mirror2
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


    /* Function to mirror the BT */
    void mirror()
    {
        //Creating a queue
        Queue<Node> q = new LinkedList<>();
        //Adding root node
        q.add(root);

        while (!q.isEmpty())
        {
            //Popping out top node from queue
            Node temp = q.remove();

            //Swapping the left and right child
            Node t = temp.left;
            temp.left = temp.right;
            temp.right = t;

            //Enqueue left child
            if (temp.left != null) {
                q.add(temp.left);
            }
            //Enqueue right child
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Mirror2 t = new Mirror2();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing mirror of BT
        System.out.println("\nMirror : ");
        t.mirror();
        t.print();
    }
}