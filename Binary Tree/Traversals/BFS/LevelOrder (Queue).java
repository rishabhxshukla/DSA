// LevelOrder : Level wise tree nodes
// Follow the RPA method : Remove -> Print -> Add child

package Traversals;
import java.util.*;

class LevelOrder_Queue
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


    /* LevelOrder traversal of binary tree by using array for implementing queue */
    void print()
    {
        //Creating a queue
        Queue<Node> q = new LinkedList<>();
        //Adding root node
        q.add(root);

        //Loop
        while (!q.isEmpty())
        {
            Node temp = q.remove();
            System.out.print(temp.data + " ");

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
        LevelOrder_Queue t = new LevelOrder_Queue();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();
    }
}