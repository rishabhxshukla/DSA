// Printing nodes at a given level of a BT

package Questions;
import java.util.*;

class PrintKth
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


    /* Function to find the height of BT */
    static int height(Node temp)
    {
        if (temp == null) {
            return 0;
        }

        //Height of each subtree
        int left = height(temp.left);
        int right = height(temp.right);

        //Using the larger one
        if (left > right)
            return (left + 1);
        else
            return (right + 1);
    }


    /* Function to print nodes at the Kth level of BT */
    void printKth(Node temp, int k)
    {
        //Null node
        if (temp == null) {
            return;
        }

        //Invalid range
        if (k < 0 || k >= height(root)) {
            System.out.println("Invalid value of K!");
            return;
        }

        //Base case
        if (k == 0) {
            System.out.print(temp.data + " ");
        }
        printKth(temp.left, k - 1);
        printKth(temp.right, k - 1);
    }


    public static void main(String args[])
    {
        //Creating object of the class
        PrintKth t = new PrintKth();
        Scanner sc = new Scanner(System.in);

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Getting the value of K
        System.out.print("\nEnter the value of K : ");
        int k = sc.nextInt();

        //Printing Kth level
        System.out.println("Kth level : ");
        t.printKth(root, k);
    }
}