package Questions;
import java.util.*;

class GetLevel
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
        first.left   = second;
        first.right  = third;
        second.left  = fourth;
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


    /* Function to find the level of a given node */
    static int level(Node temp, int key, int level)
    {
        int down;

        //Empty tree or leaf node
        if (temp == null) {
            return -1;
        }

        //Base case
        if (temp.data == key) {
            return level;
        }

        //Moving down in left subtree
        down = level(temp.left, key, level + 1);
        if (down != -1) {
            return down;
        }
        //Moving down in right subtree
        down = level(temp.right, key, level + 1);
        return down;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        GetLevel t = new GetLevel();
        Scanner sc = new Scanner(System.in);

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        System.out.print("\nEnter the node to find its level : ");
        int key = sc.nextInt();

        System.out.println("Level : " + level(root, key, 0));
    }
}