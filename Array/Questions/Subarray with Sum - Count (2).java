/*
Given an array and an integer k. Your task is to find the "count" of subarrays with the
sum of the elements equal to the given value k.

Example :
Input: arr[] = {1, 2, 3, 4, 5}, k = 3
Output: 2
Explanation: Subarrays with sum k are {1, 2}, {3}.
*/
// PREFIX SUM

package Array.Questions;
import java.io.*;
import java.util.*;

class Subarray_with_Sum_Count2
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


    /* Function to find the count of subarrays with the given sum */
    static int subarrayCount(int k)
    {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        /*
        Initialize the HashMap to handle cases where a subarray starting from the first
        element sums to 'k'.
        Adding prefix sum 0 with a count of 1 because a subarray sum can start from the
        first element
        */
        hm.put(0, 1);

        for (int i=0; i<size; i++)
        {
            //Calculate the prefix sum
            prefixSum = prefixSum + arr[i];

            //Check if (sum - k) is already in HashMap, indicating a valid subarray
            if (hm.containsKey(prefixSum - k))
            {
                count = count + hm.get(prefixSum - k);
            }

            //Add the current sum to the prefix sum HashMap
            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Subarray_with_Sum_Count2 obj = new Subarray_with_Sum_Count2();
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

        //Printing the count of subarrays
        System.out.println("Count of subarrays with given sum : " + subarrayCount(target));
    }
}