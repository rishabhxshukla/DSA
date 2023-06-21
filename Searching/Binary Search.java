/*
Optimal formula for calculating middle element :
mid = s + (e-s)/2
mid = lb + (ub-lb)/2
*/

package Searching;
import java.io.*;

class Binary_Search
{
    /* Function to search for element in an array */
    static boolean search(int arr[], int key)
    {
        int lb = 0, ub = arr.length-1;

        while (lb <= ub)
        {
            int mid = (lb + ub) / 2;

            if (arr[mid] < key)
                lb = mid + 1;
            if (arr[mid] > key)
                ub = mid - 1;
            if (arr[mid] == key)
                return true;
        }
        return false;
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);
        int arr[] = new int[5];

        //Creating the array
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        System.out.print("Enter the element that you want to search : ");
        int key = Integer.parseInt(b.readLine());

        System.out.println("Searching...");
        System.out.println("Result : " + search(arr, key));
    }
}