/*
1. Instead of printing the node, we push that node to a stack.
2. Right subtree is visited before left subtree.
   (Storing the nodes from right to left instead of traditional left to right)
3. Print the stack elements, and we have our answer.
*/

package Questions;
import java.util.*;

class ReverseLoT
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


    /* Function to print reverse level order traversal of BT */
    void reverse()
    {
        Stack<Node> s = new Stack<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty())
        {
            Node temp = q.remove();
            s.push(temp);

            //Enqueue right child first
            if (temp.right != null) {
                q.add(temp.right);
            }
            //Then enqueue left child
            if (temp.left != null) {
                q.add(temp.left);
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
        ReverseLoT t = new ReverseLoT();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        System.out.println("\nReversed Level Order Traversal of BT :");
        t.reverse();
    }
}