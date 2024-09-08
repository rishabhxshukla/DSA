/*
Given an array and an integer k. Your task is to find the "count" of subarrays with the
sum of the elements equal to the given value k.

Example :
Input: arr[] = {1, 2, 3, 4, 5}, k = 3
Output: 2
Explanation: Subarrays with sum k are {1, 2}, {3}.
*/
// NESTED LOOP

package Array.Questions;
import java.io.*;

class Subarray_with_Sum_Count1
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

        //Creating the subarrays
        for (int i=0; i<size; i++)
        {
            int S = 0;

            //Sum of each subarray
            for (int j=i; j<size; j++)
            {
                S = S + arr[j];

                //No. of subarrays with sum k
                if (S == k) {
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Subarray_with_Sum_Count1 obj = new Subarray_with_Sum_Count1();
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