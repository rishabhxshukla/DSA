// Check if a linked list is palindrome or not
// REVERSE HALF & COMPARE

package LinkedList.Questions;
import java.io.*;

class Palindrome2
{
    static Node head;
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


    /* Creating the LL */
    void create(int data)
    {
        Node new_node = new Node(data);

        if(head == null) {
            head = new_node;
            return;
        }

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = new_node;
        new_node.next = null;
    }


    /* Printing the LL */
    void print()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    /* Helper function to reverse a linked list */
    static Node reverse(Node head)
    {
        Node back = null;
        Node temp = head;
        Node front = null;

        while (temp != null)
        {
            front = temp.next;
            temp.next = back;

            back = temp;
            temp = front;
        }

        //Returning the new head
        return back;
    }


    /* Function to check for palindrome */
    static boolean isPalindrome()
    {
        //Empty or single-node list is always a palindrome
        if (head == null || head.next == null) {
            return true;
        }

        //Step 1: Find the middle of the linked list
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Step 2: Reverse the second half of the list
        Node head2 = reverse(slow);

        //Step 3: Compare the first half and the reversed second half
        Node first = head;
        Node second = head2;
        boolean isPalindrome = true;

        while (second != null)
        {
            //If the nodes mismatch, break the loop
            if (first.data != second.data) {
                isPalindrome = false;
                break;
            }

            first = first.next;
            second = second.next;
        }

        //Step 4: Restore the original structure by reversing the second half again
        reverse(head2);

        return isPalindrome;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Palindrome2 ll = new Palindrome2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the LL
        for (int i = 1; i <= 5; i++)
        {
            ll.create(i);
        }
        for (int i = 4; i >= 1; i--)
        {
            ll.create(i);
        }

        //Printing the LL
        System.out.println("*** Created Linked List ***");
        ll.print();

        //Printing the result
        System.out.println("\nisPalindrome : " + isPalindrome());
    }
}