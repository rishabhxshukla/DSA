// Find the least frequent element in an array
// HASHMAP + MIN

package Hashing.Questions;
import java.io.*;
import java.util.*;

class LeastFrequent1
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


    /* Function to find the least frequent element */
    static int leastFrequent()
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

        //Finding element with minimum frequency
        int ans = 0, min = Integer.MAX_VALUE;

        for (var i : hm.entrySet())
        {
            if (i.getValue() < min)
            {
                min = i.getValue();     //Updating min
                ans = i.getKey();       //Storing min's key
            }
        }

        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        LeastFrequent1 obj = new LeastFrequent1();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the least frequency element
        System.out.println("\nLeast frequency element : " + leastFrequent());
    }
}