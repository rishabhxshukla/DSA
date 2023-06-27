/*
Find sum of all subarrays of size K
arr : 1 2 3 4 5, k = 3
sum = 1+2+3 = 6
sum = 2+3+4 = 9
sum = 3+4+5 = 12
*/
// SLIDING WINDOW

package Array.Questions;
import java.io.*;

class SubarraySum
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


    /* Function to find the sum of subarrays */
    void sum(int k)
    {
        int sum = 0;

        //Sum of first k group
        for (int i = 0; i < k; i++)
        {
            sum = sum + arr[i];
        }

        //Printing the 1st sum
        System.out.print(sum + " ");

        //Make subarrays starting from 1st index
        //Remove before element and add current element to the window
        for (int i = k; i < size; i++)
        {
            //Removing 1st element from sum
            sum = sum - arr[i - k];
            //Adding new element to sum
            sum = sum + arr[i];

            //Printing the sum of subarray
            System.out.print(sum + " ");
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SubarraySum obj = new SubarraySum();
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

        //Printing the subarray sum
        System.out.println("*** Subarray Sum ***");
        obj.sum(k);
    }
}