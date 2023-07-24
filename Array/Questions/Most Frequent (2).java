// Find the most frequent element in an array
// HASHMAP + SORT

package Array.Questions;
import java.io.*;
import java.util.*;

class MostFrequent2
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


    /* Function to find the most frequent element */
    static int mostFrequent()
    {
        //Storing element : frequency in HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i=0; i<size; i++)
        {
            //Storing element in key
            int key = arr[i];

            //If key is already present in HashMap
            if (hm.containsKey(key))
            {
                //Updating its frequency
                int val = hm.get(key);
                val++;
                hm.put(arr[i], val);
            }
            //Otherwise add key to HashMap
            else
            {
                hm.put(key, 1);
            }
        }

        //Sorting the HashMap based on values
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());

        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));

        //Returning most frequent element
        return list.get(0).getKey();
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MostFrequent2 obj = new MostFrequent2();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the most frequency element
        System.out.println("\nMost frequency element : " + mostFrequent());
    }
}