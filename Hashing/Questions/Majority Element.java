/*
Given an array, return the majority element present inside it.
Majority element is the element that appears more than N/2 times.

Example :
Input: arr = [3, 1, 2, 3, 3]
Output: 3
*/
// HASHMAP

package Hashing.Questions;
import java.io.*;
import java.util.*;

class MajorityElement
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


    /* Function to find the majority element */
    static int majorityElement()
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        //Storing element & its frequency in HashMap
        for (int i=0; i<size; i++)
        {
            int elem = arr[i];

            //If HashMap contains the element, increase its frequency
            if (hm.containsKey(elem)) {
                int val = hm.get(elem);
                val++;
                hm.replace(elem, val);
            }
            //Otherwise, add the element to HashMap
            else {
                hm.put(elem, 1);
            }
        }

        //Iterate over HashMap and find the element with freq > size / 2
        for (var i : hm.entrySet())
        {
            if (i.getValue() > size / 2)
            {
                return i.getKey();
            }
        }

        return -999;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MajorityElement obj = new MajorityElement();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the majority element
        System.out.println("\nMajority element : " + majorityElement());
    }
}