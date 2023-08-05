/*
Given an array of integers, return the number of good pairs present in it.
A pair (i, j) is called good if arr[i] == arr[j] and i < j.
Input: [1, 2, 3, 1, 1, 3]
Output: 4
Explanation: 4 good pairs : (0,3), (0,4), (3,4), (2,5).
*/
// HASHMAP

package Array.Questions;
import java.io.*;
import java.util.*;

class GoodPairs2
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


    /* Function to find the no. of good pairs */
    static int goodPairs()
    {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i=0; i<size; i++)
        {
            //Extracting each element
            int e = arr[i];

            //Updating its frequency
            if (hm.containsKey(e)) {
                int val = hm.get(e);
                val++;
                hm.put(e, val);
            }
            else {
                hm.put(e, 1);
            }
        }

        //Using formula to find the no. of good pairs
        //n * (n - 1) / 2, where n is frequency of each element
        for (int i : hm.values())
        {
            count = count + (i * (i - 1) / 2);
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        GoodPairs2 obj = new GoodPairs2();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the no. of good pairs
        System.out.println("\nNo. of good pairs : " + goodPairs());
    }
}