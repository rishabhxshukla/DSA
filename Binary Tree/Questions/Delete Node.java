/*
Delete a node from a BT :
1) Find the last node & its parent.
2) Replace key node data with the last node data.
3) Delete the last node.

Example : Key node = 6, Parent = 3, Last node = 7
*/

package Questions;
import java.io.*;
import java.util.*;

class DeleteNode
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
        Node sixth   = new Node(6);
        Node seventh = new Node(7);

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


    /* Function to delete a node from a BT */
    void delete(Node root, int key)
    {
        //Empty tree
        if (root == null) {
            return;
        }

        //Single node
        if (root.left == null && root.right == null && root.data == key)
        {
            root = null;
            return;
        }

        Node temp = null, target = null, parent = null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        //Finding the last node (temp), node to be deleted (target), parent of last node (parent)
        while (!q.isEmpty())
        {
            temp = q.remove();

            //Storing the key node
            if (temp.data == key) {
                target = temp;
            }

            //Enqueue left child + storing its parent
            if (temp.left != null) {
                parent = temp;
                q.add(temp.left);
            }
            //Enqueue right child + storing its parent
            if (temp.right != null) {
                parent = temp;
                q.add(temp.right);
            }
        }

        //If key node was found in the tree
        if (target != null)
        {
            //Replacing key node data with last node data
            target.data = temp.data;

            //Deleting the last node :
            /*If the last node was 2nd child of its parent, set it to be null.
              Otherwise, if it was 1st (and only) child, set it to be null.*/
            if (parent.right == temp)
                parent.right = null;
            else
                parent.left = null;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        DeleteNode t = new DeleteNode();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the BT
        t.create();

        //Printing the BT
        System.out.println("*** Created Binary Tree ***");
        t.print();

        //Deleting the node
        System.out.print("\nEnter the node that you want to delete : ");
        int key = Integer.parseInt(b.readLine());
        t.delete(root, key);

        //Printing the BT
        System.out.println("*** New Binary Tree ***");
        t.print();
    }
}