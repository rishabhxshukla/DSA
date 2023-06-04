/*
Even-Odd Tree :
Assuming root to be at level 0,
1) All the nodes on even levels have even values.
2) All the nodes on odd levels have odd values.
*/

package Questions;
import java.util.*;

class EvenOddTree
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
        Node first   = new Node(10);
        Node second  = new Node(13);
        Node third   = new Node(17);
        Node fourth  = new Node(20);
        Node fifth   = new Node(30);
        Node sixth   = new Node(40);
        Node seventh = new Node(50);

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


    /* Function to check if given BT is Even-Odd or not */
    static boolean isEvenOdd(Node temp)
    {
        if (temp == null)
            return true;

        int level = 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty())
        {
            int size = q.size();

            //Checking all nodes at each level
            for (int i=0; i<size; i++)
            {
                Node t = q.poll();

                //If level is even & nodes are odd
                if (level % 2 == 0)
                {
                    if (t.data % 2 != 0)
                        return false;
                }
                //If level is odd & nodes are even
                else if (level % 2 != 0)
                {
                    if (t.data % 2 == 0)
                        return false;
                }

                //Enqueue left child
                if (t.left != null) {

                    q.add(t.left);
                }
                //Enqueue right child
                if (t.right != null) {

                    q.add(t.right);
                }
            }
            //Increment level count
            level++;
        }
        return true;
    }


    public static void main(String args[])
    {
        //Creating object of the class
        EvenOddTree t = new EvenOddTree();

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Printing the result
        System.out.println("\nEven-Odd Tree : " + isEvenOdd(root));
    }
}