/*
Given an array and an integer k. Your task is to find the length of the longest sub-array
with the sum of the elements equal to the given value k.

Input : arr[] = {10, 5, 2, 7, 1, 9}, k = 15
Output : 4
Explanation: Longest sub-array is {5, 2, 7, 1}.
*/
// 2 POINTERS

package Array.Questions;
import java.io.*;

class Subarray_with_Sum3
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
        int i = 0, j = 0;
        int len = 0, S = 0;

        while (j < size)
        {
            //Calculating the sum
            S = S + arr[j];

            //Adjust the left pointer if the current sum exceeds k
            while (S > k && i <= j) {
                S = S - arr[i];
                i++;
            }

            //If the current sum equals k, update the length
            if (S == k) {
                len = Math.max(len, j - i + 1);
            }

            //Move the right pointer to expand the window
            j++;
        }

        System.out.println("Length of longest subarray with sum " + k + " is " + len);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Subarray_with_Sum3 obj = new Subarray_with_Sum3();
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