/*
In order to represent a tree using an array,
numbering of nodes can start either from 0 to (n-1) or 1 to n,

Case 1: (0 to n-1)
if root=p;
then left=(2*p)+1;
and right=(2*p)+2;

Case 2: (1 to n)
if root=p;
then left=(2*p);
and right=(2*p)+1;
*/

package BinaryTree;
import java.io.*;

class ArrayImplementation
{
    static int root = 0;
    static String str[] = new String[10];


    /* Creating root node */
    void Root(String key)
    {
        str[0] = key;
    }


    /* Creating left node */
    void Left(String key, int root)
    {
        int t = (root * 2) + 1;

        if (str[root] == null) {
            System.out.println("Can't set child");
        }
        else {
            str[t] = key;
        }
    }


    /* Creating right node */
    void Right(String key, int root)
    {
        int t = (root * 2) + 2;

        if (str[root] == null) {
            System.out.println("Can't set child");
        }
        else {
            str[t] = key;
        }
    }


    /* Printing the Binary Tree */
    void print()
    {
        for(int i=0; i<10; i++)
        {
            if (str[i] != null)
                System.out.print(str[i]);
            else
                System.out.println("-");
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ArrayImplementation t = new ArrayImplementation();

        t.Root("A");
        t.Left("B", 0);
        t.Right("C", 0);
        t.Left("D", 1);
        t.Right("E", 1);
        t.Right("F", 2);

        //Printing the Binary Tree
        t.print();
    }
}