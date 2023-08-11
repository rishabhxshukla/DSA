/*
Count Number of Pairs With Absolute Difference K
Given an array and an integer k, return the number of pairs (i, j) with |arr[i] - arr[j]| == k.
*/
// NESTED LOOP

package Array.Questions;
import java.io.*;
import java.util.*;

class Pairs_with_Difference2
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


    /* Function to find the no. of pairs */
    static int pairs(int k)
    {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        //Storing value + frequency in HashMap
        for (int i=0; i<arr.length; i++)
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

        //Checking if HashMap contains the 3rd value
        for (int i=0; i<arr.length; i++)
        {
            int sum = arr[i] + k;

            if (hm.containsKey(sum))
            {
                count = count + hm.get(sum);
            }
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Pairs_with_Difference2 obj = new Pairs_with_Difference2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Taking user input
        System.out.print("Enter the value of difference (k) : ");
        int k = Integer.parseInt(b.readLine());

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the no. of pairs
        System.out.println("\nNo. of pairs with difference k : " + pairs(k));
    }
}