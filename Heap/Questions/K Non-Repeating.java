// Find first `k` non-repeating characters in a string

package Heap.Questions;
import java.io.*;
import java.util.*;

class KNonRepeating
{
    static PriorityQueue<Character> pq = new PriorityQueue<>();


    /* Creating the heap */
    void create() throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        System.out.print("Enter the string : ");
        String str = b.readLine();
        str = str.toUpperCase();

        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            pq.add(ch);
        }
    }


    /* Printing the heap */
    void print()
    {
        System.out.println(pq);
    }


    /* Function to find the first k non-repeating characters */
    void nonRepeating(int k)
    {
        while (k > 0 && k < pq.size())
        {
            //Removing root character
            char removed = pq.remove();

            //If next character is not same as root
            if (removed != pq.peek())
            {
                System.out.print(removed + " ");
                //Decreasing counter
                k--;
            }
            else
            {
                //Removing next characters till they are not same
                while (removed == pq.peek())
                {
                    pq.remove();
                }
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        KNonRepeating h = new KNonRepeating();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the heap
        h.create();

        //Printing the heap
        System.out.println("*** Created Heap ***");
        h.print();

        //Taking user input
        System.out.print("Enter the value of K : ");
        int k = Integer.parseInt(b.readLine());

        //Printing the k non-repeating characters
        System.out.println("First k non-repeating characters :");
        h.nonRepeating(k);
    }
}