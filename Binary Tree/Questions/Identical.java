// Two trees are identical when they have same data and the arrangement of data is also same.
/*
They must follow these 3 conditions :
1) Root node must be same
2) Check for left subtree
3) Check for right subtree
*/

package Questions;
import java.util.*;

class Identical
{
    static Node root1;
    static Node root2;
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


    /* Creating the BTs */
    void create1()
    {
        Node first  = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);
        Node fourth = new Node(4);
        Node fifth  = new Node(5);

        root1 = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }
    void create2()
    {
        Node first  = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);
        Node fourth = new Node(4);
        Node fifth  = new Node(5);

        root2 = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }


    /* Printing the BTs */
    void print(Node root)
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


    /* Function to check if given BTs are identical or not */
    static boolean isIdentical(Node a, Node b)
    {
        //If both trees are empty
        if (a == null && b == null) {
            return true;
        }

        //If both trees are non-empty
        if (a != null && b != null)
        {
            return (
                    a.data == b.data &&
                    isIdentical(a.left, b.left) &&
                    isIdentical(a.right, b.right)
            );
        }

        //Else return false
        return false;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        Identical t = new Identical();

        //Creating BT 1
        t.create1();
        //Creating BT 2
        t.create2();

        //Printing the BTs
        System.out.println("*** Created Binary Trees ***");
        System.out.print("1st Binary Tree : ");
        t.print(root1);
        System.out.print("\n2nd Binary Tree : ");
        t.print(root2);

        //Checking if given BTs are identical
        if (isIdentical(root1, root2))
            System.out.println("\nGiven binary trees are Identical.");
        else
            System.out.println("\nGiven binary trees are not Identical.");
    }
}