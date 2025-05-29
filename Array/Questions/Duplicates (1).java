// Find all duplicate elements in an unsorted array
// HASHMAP

package Array.Questions;
import java.io.*;
import java.util.*;

class Duplicates1
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


    /* Function to find the duplicate elements */
    void duplicates()
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        //Adding element & its frequency to HashMap
        for (int i=0; i<size; i++)
        {
            int key = arr[i];

            if (hm.containsKey(key)) {
                int val = hm.get(key);
                val++;
                hm.put(key, val);
            }
            else {
                hm.put(key, 1);
            }
        }

        //Printing the duplicate elements
        for (Map.Entry<Integer, Integer> i : hm.entrySet())
        {
            //If freq > 1, then its a duplicate element
            if (i.getValue() > 1) {
                System.out.print(i.getKey() + " ");
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Duplicates1 obj = new Duplicates1();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the duplicates
        System.out.println("\nDuplicates : ");
        obj.duplicates();
    }
}