/*
Given an array and an integer k. Your task is to find the length of the longest sub-array
with the sum of the elements equal to the given value k.

Input : arr[] = {10, 5, 2, 7, 1, 9}, k = 15
Output : 4
Explanation: Longest sub-array is {5, 2, 7, 1}.
*/
// HASHMAP

package Array.Questions;
import java.io.*;
import java.util.*;

class Subarray_with_Sum2
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


    /* Function to find the longest subarray with given sum */
    void subarray(int k)
    {
        //HashMap to store the sum and its index
        HashMap<Integer, Integer> hm = new HashMap<>();

        //Variables to store the current sum and the length of the longest subarray
        int len = 0, S = 0;

        for (int i = 0; i < size; i++)
        {
            //Calculating the sum
            S = S + arr[i];

            //Max length of subarray which is equal to target
            if (S == k) {
                len = Math.max(len, i + 1);
            }

            //Difference between current sum and target sum
            int r = S - k;

            //If r is found in HashMap, subarray with sum k exists. Update max length
            if (hm.containsKey(r)) {
                len = Math.max(len, i - hm.get(r));
            }

            //Add sum to the map if it's not already there
            hm.putIfAbsent(S, i);
        }

        System.out.println("Length of longest subarray with sum " + k + " is " + len);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Subarray_with_Sum2 obj = new Subarray_with_Sum2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the sum : ");
        int target = Integer.parseInt(b.readLine());

        //Printing the subarray indices
        obj.subarray(target);
    }
}