/*
Given an array and an integer K.
Find the total number of subarrays having bitwise XOR of all elements equal to K.
Bitwise XOR is a binary operation that compares two bits, returning 1 if the bits
are different and 0 if they are same.
Example :
   7 ^ 3 results in 4, because
   7 -> 111 (in binary)
   3 -> 011 (in binary)
   Result: 100 (in binary), which is 4.

Example :
Input: arr[] = {4, 2, 2, 6, 4}, k = 6
Output: 4
Explanation: Subarrays having XOR as 6 are {4, 2}, {4, 2, 2, 6, 4}, {2, 2, 6}, {6}.
*/
// HASHMAP

package Array.Questions;
import java.io.*;
import java.util.*;

class Subarray_with_XOR2
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


    /* Function to find subarrays having XOR of all elements equals to K */
    static int xor(int k)
    {
        int count = 0;
        int xor = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        //Initializing the map with the prefix XOR 0
        hm.put(0, 1);

        for (int i=0; i<size; i++)
        {
            //Calculate XOR up to the current element
            xor = xor ^ arr[i];

            //Calculate the target prefix XOR
            int x = xor ^ k;

            //Check if this prefix XOR is already present in HashMap
            //If yes then subarray found, increase the count
            if (hm.containsKey(x))
            {
                count = count + hm.get(x);
            }

            //Otherwise, update the count of the current XOR in HashMap
            else {
                hm.put(xor, hm.getOrDefault(xor, 0) + 1);
            }
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Subarray_with_XOR2 obj = new Subarray_with_XOR2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the value of K : ");
        int k = Integer.parseInt(b.readLine());

        //Printing the number of subarrays
        System.out.println("Total no. of subarrays : " + xor(k));
    }
}