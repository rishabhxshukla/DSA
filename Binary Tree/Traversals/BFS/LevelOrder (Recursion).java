// LevelOrder : level wise tree nodes

package Traversals;

class LevelOrder_Recursion
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

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;
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


    /* Function to print nodes at the current level */
    void printCurrent(Node temp, int level)
    {
        if (temp == null) {
            return;
        }
        if (level == 1) {
            System.out.print(temp.data + " ");
        }
        else
        {
            printCurrent(temp.left, level - 1);
            printCurrent(temp.right, level - 1);
        }
    }


    /* LevelOrder traversal of binary tree */
    void print()
    {
        //1 2 3 4 5
        int height = heightOfBT(root);
        for (int i=1; i<=height; i++)
        {
            printCurrent(root, i);
        }
    }


    public static void main(String args[])
    {
        //Creating object of the class
        LevelOrder_Recursion t = new LevelOrder_Recursion();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();
    }
}