// Top K frequent numbers present in the array
// HASHMAP + LIST

package Hashing.Questions;
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
        List<Integer> list = new ArrayList<>();

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

        //Adding HashMap elements to a List
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            list.add(entry.getKey());
        }

        //Sorting the List based on the frequency of elements
        list.sort((a, b) -> hm.get(b) - hm.get(a));

        //Printing the top K frequent elements
        for (int i = 0; i < k && i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
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