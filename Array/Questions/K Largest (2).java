// Find first K largest elements of an array
// HEAP

package Array.Questions;
import java.io.*;
import java.util.*;

class KLargest2
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Creating the array */
    void create() throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }
    }


    /* Printing the array */
    void print(int a[])
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* Function to find K largest elements */
    static int[] kLargest(int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        //Adding all elements in PriorityQueue
        for (int i=0; i<size; i++)
        {
            pq.add(arr[i]);
        }

        //Storing K largest elements in temp[]
        int temp[] = new int[k];
        int i = 0;
        while (k > 0)
        {
            temp[i] = pq.remove();
            i++;
            k--;
        }

        //Deleting PriorityQueue
        pq.clear();

        return temp;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        KLargest2 obj = new KLargest2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the value of k : ");
        int k = Integer.parseInt(b.readLine());

        //Finding the K largest elements
        int ans[] = kLargest(k);

        //Printing the K largest elements
        System.out.println("*** K Largest Elements ***");
        obj.print(ans);
    }
}