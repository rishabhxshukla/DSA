/*
1. Instead of printing the node, we push that node into a stack.
2. Remove elements from the stack one-by-one and print them.
*/

package BinaryTree.Questions;
import java.util.*;

class Last_to_First_Traversal
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


    /* Function to print BT nodes from last to first */
    void lastToFirst()
    {
        Stack<Node> s = new Stack<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty())
        {
            Node temp = q.remove();
            s.push(temp);

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }

        while (!s.isEmpty())
        {
            Node temp = s.pop();
            System.out.print(temp.data + " ");
        }
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Last_to_First_Traversal t = new Last_to_First_Traversal();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        System.out.println("\nLast to First Node Traversal of BT :");
        t.lastToFirst();
    }
}