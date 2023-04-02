// Children Sum property : Root node = Left child + Right child

package Questions;
import java.util.*;

class ChildrenSum
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
        Node first  = new Node(25);
        Node second = new Node(12);
        Node third  = new Node(13);
        Node fourth = new Node(7);
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
        //Creating a queue
        Queue<Node> q = new LinkedList<>();
        //Adding root node
        q.add(root);

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


    /* Function to find the sum of children of a node */
    static int childrenSum(Node temp)
    {
        //Base case: empty tree
        if (temp == null) {
            return 0;
        }

        //Base case: leaf node
        if (temp.left == null && temp.right == null) {
            return temp.data;
        }

        int left  = childrenSum(temp.left);
        int right = childrenSum(temp.right);

        if (temp.data == left + right)
            return temp.data;
        else
            return -1;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        ChildrenSum t = new ChildrenSum();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Children Sum property
        System.out.println("\nReturns root if property is followed : " + childrenSum(root));
    }
}