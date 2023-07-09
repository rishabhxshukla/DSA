// Given two sorted LL, the task is to merge them in a sorted manner.
// 2 POINTERS

package LinkedList.Questions;
import java.io.*;
import java.util.*;

class Merge_2_Sorted_LL
{
    static Node head1;
    static Node head2;
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    /* Printing the LL */
    void print(Node temp)
    {
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* Creating the LL */
    void create()
    {
        /* Creating 1st LL */
        head1 = new Node(1);
        head1.next = new Node(7);
        head1.next.next = new Node(9);

        /* Creating 2nd LL */
        head2 = new Node(2);
        head2.next = new Node(5);
        head2.next.next = new Node(8);
        head2.next.next.next = new Node(12);
    }


    /* Function to merge 2 LLs */
    static LinkedList<Node> merge()
    {
        LinkedList<Node> ans = new LinkedList<>();
        Node ptr1 = head1;
        Node ptr2 = head2;

        while (ptr1 != null && ptr2 != null)
        {
            //Storing smaller element in answer list
            if (ptr1.data < ptr2.data) {
                ans.add(ptr1);
                ptr1 = ptr1.next;
            }
            else {
                ans.add(ptr2);
                ptr2 = ptr2.next;
            }
        }

        //Now either ptr1 or ptr2 will be at the last index of its list
        //Store the remaining elements of 1st list if 2nd list is finished
        while (ptr1 != null)
        {
            ans.add(ptr1);
            ptr1 = ptr1.next;
        }

        //Store the remaining elements of 2nd list if 1st list is finished
        while (ptr2 != null)
        {
            ans.add(ptr2);
            ptr2 = ptr2.next;
        }

        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Merge_2_Sorted_LL ll = new Merge_2_Sorted_LL();

        //Creating the LLs
        ll.create();

        //Printing the LLs
        System.out.println("1st Linked List : ");
        ll.print(head1);
        System.out.println("\n2nd Linked List : ");
        ll.print(head2);

        //Merging the LLs
        LinkedList<Node> ans = merge();

        //Printing the merged list
        System.out.println("\n*** Merged Linked List ***");
        for (Node i : ans) {
            System.out.print(i.data + " ");
        }
    }
}