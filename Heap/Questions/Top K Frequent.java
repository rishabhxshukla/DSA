// Top K frequent numbers present in the array
// HASHMAP + PRIORITY QUEUE

package Heap.Questions;
import java.io.*;
import java.util.*;

class TopKFrequent
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


    /* Function to top K frequent elements */
    void topKfrequent(int k)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        //Storing the elements in HashMap
        for (int i=0; i<size; i++)
        {
            //Storing element in key
            int key = arr[i];

            //If element is already present, then update it
            if (hm.containsKey(key)) {
                int updated = hm.get(key) + 1;
                hm.put(key, updated);
            }
            //Otherwise add it to HashMap
            else {
                hm.put(key, 1);
            }
        }

        //Sorting the elements in descending order based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() != b.getValue() ? b.getValue() - a.getValue() : a.getKey() - b.getKey()
        );

        //Adding all HashMap elements to PriorityQueue
        pq.addAll(hm.entrySet());

        //Printing the top K frequent elements
        while (k > 0)
        {
            System.out.print(pq.remove().getKey() + " ");
            k--;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        TopKFrequent obj = new TopKFrequent();
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

        //Printing the top K frequent elements
        System.out.print("Top K frequent elements : ");
        obj.topKfrequent(k);
    }
}