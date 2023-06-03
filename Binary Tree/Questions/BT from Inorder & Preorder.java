/*
Preorder : 1 2 4 5 3 6 7
Inorder  : 4 2 5 1 6 3 7

1) In Preorder, the leftmost element is the root element. (1)
2) Search the ‘root’ in Inorder :
    a) All elements on the left side of root are nodes of left subtree. (4, 2, 5)
    b) All elements on the right side of root are nodes of right subtree. (6, 3, 7)
3) Again scan the Preorder and look for the first element that matches with the nodes of left subtree.
   This matched element will be the root of left subtree. (2)
4) Again go to the Inorder and look for the left and right subtrees of the current root. (4 | 5)
5) Follow steps 3 & 4 for right subtree as well.
*/

package Questions;
import java.util.*;

class BTfromInorderPreorder
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


    /* Printing the BT */
    void print(Node temp)
    {
        if (temp == null) {
            return;
        }
        print(temp.left);
        System.out.print(temp.data + " ");
        print(temp.right);
    }


    /* Finding the position of root node in Inorder */
    static int position(int in[], int start, int end, int key)
    {
        for (int i=start; i<=end; i++)
        {
            if (in[i] == key)
                return i;
        }
        return -1;
    }


    /* Function to build the BT */
    static Node solve(int in[], int pre[], int start, int end)
    {
        int index = 0;

        if (start > end)
            return null;

        Node temp = new Node(pre[index++]);

        if (start == end)
            return temp;

        int pos = position(in, start, end, temp.data);

        temp.left  = solve(in, pre, start, pos-1);
        temp.right = solve(in, pre, pos+1, end);

        return temp;
    }


    static Node build(int in[], int pre[], int n)
    {
        return solve(in, pre, 0,  in.length-1);
    }


    public static void main(String args[])
    {
        //Creating object of the class
        BTfromInorderPreorder t = new BTfromInorderPreorder();

        //Preorder & Inorder arrays :
        int pre[] = {1, 2, 4, 5, 3, 6, 7};
        int  in[] = {4, 2, 5, 1, 6, 3, 7};

        //Getting back the root node
        root = build(in, pre, 6);

        //Printing the BT
        t.print(root);
    }
}