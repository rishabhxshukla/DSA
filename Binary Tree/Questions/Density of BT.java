// Density of Binary Tree = Size / Height

package Questions;
import java.util.*;

class DensityOfBT
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
        Node sixth  = new Node(6);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
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


    /* Function to find the size of BT */
    static int sizeOfBT(Node temp)
    {
        if (temp == null)
            return 0;
        else
        {
            //Size of each subtree
            int left = sizeOfBT(temp.left);
            int right = sizeOfBT(temp.right);

            return left + right + 1;
        }
    }


    /* Function to find the height of BT */
    static int heightOfBT(Node temp)
    {
        if (temp == null)
            return 0;
        else
        {
            //Height of each subtree
            int lheight = heightOfBT(temp.left);
            int rheight = heightOfBT(temp.right);

            //Using the larger one
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }


    /* Function to find the density of BT */
    static int densityOfBT()
    {
        int size = sizeOfBT(root);
        int height = heightOfBT(root);
        return size / height;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        DensityOfBT t = new DensityOfBT();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing size and height of BT
        System.out.println("\nSize : " + sizeOfBT(root));
        System.out.println("Height : " + heightOfBT(root));

        //Printing density of BT
        System.out.println("Density : " + densityOfBT());
    }
}