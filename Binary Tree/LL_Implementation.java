/* Implementation of Binary Tree using a Linked List */
package BinaryTree;
import java.util.*;

class LL_Implementation
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
        Node first   = new Node(10);
        Node second  = new Node(20);
        Node third   = new Node(30);
        Node fourth  = new Node(40);
        Node fifth   = new Node(50);
        Node sixth   = new Node(60);
        Node seventh = new Node(70);

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


    public static void main(String args[])
    {
        //Creating object of the class
        LL_Implementation t = new LL_Implementation();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();
    }
}