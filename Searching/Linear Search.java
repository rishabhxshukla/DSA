package Searching;
import java.io.*;

class Linear_Search
{
    /* Function to search for element in an array */
    static boolean search(int arr[], int key)
    {
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] == key)
                return true;
        }
        return false;
    }

    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);
        int arr[] = new int[5];

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