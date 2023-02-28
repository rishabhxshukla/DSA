// Size of BT = (Size of left subtree) + (Size of right subtree) + 1

package Questions;

class SizeOfBT
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


    /* Printing the BT */
    void print(Node temp)
    {
        //4 2 5 1 3
        if (temp == null) {
            return;
        }
        print(temp.left);
        System.out.print(temp.data + " ");
        print(temp.right);
    }


    /* Function to find the size of BT */
    static int sizeOfBT(Node temp)
    {
        if (temp == null)
            return 0;
        else
            return sizeOfBT(temp.left) + sizeOfBT(temp.right) + 1;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        SizeOfBT t = new SizeOfBT();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print(root);

        //Printing size of BT
        System.out.println("\nSize of binary tree is : " + sizeOfBT(root));
    }
}