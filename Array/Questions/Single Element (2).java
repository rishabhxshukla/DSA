/*
Given an array where every element appears twice except for one element. Find that element.
Input: arr = [3,1,2,1,2]
Output: 3
*/
// HASHMAP

package Array.Questions;
import java.io.*;
import java.util.*;

class SingleElement2
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


    /* Function to find the single element */
    static int singleElement()
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int element = -1;

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
                hm.replace(key, val);
            }
            //Otherwise add key to HashMap
            else
            {
                hm.put(key, 1);
            }
        }

        //Finding element with frequency of 1
        for (var i : hm.entrySet())
        {
            if (i.getValue() == 1) {
                element = i.getKey();
            }
        }

        return element;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SingleElement2 obj = new SingleElement2();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the single element
        System.out.print("\nSingle element : " + singleElement());
    }
}