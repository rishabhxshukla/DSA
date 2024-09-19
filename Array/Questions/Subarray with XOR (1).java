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
// NESTED LOOPS

package Array.Questions;
import java.io.*;

class Subarray_with_XOR1
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

        //Creating the subarrays
        for (int i=0; i<size; i++)
        {
            int xor = 0;

            //XOR of each subarray
            for (int j=i; j<size; j++)
            {
                xor = xor ^ arr[j];

                //No. of subarrays with xor k
                if (xor == k) {
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Subarray_with_XOR1 obj = new Subarray_with_XOR1();
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