// Find first K smallest elements of an array
// SORTING

package Array.Questions;
import java.io.*;
import java.util.*;

class KSmallest1
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


    /* Function to find K smallest elements */
    static int[] kSmallest(int k)
    {
        //Sorting the array
        Arrays.sort(arr);

        //Storing K smallest elements in temp[]
        int temp[] = new int[k];
        int i = 0;
        while (k > 0)
        {
            temp[i] = arr[i];
            i++;
            k--;
        }

        return temp;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        KSmallest1 obj = new KSmallest1();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the value of k : ");
        int k = Integer.parseInt(b.readLine());

        //Finding the K smallest elements
        int ans[] = kSmallest(k);

        //Printing the K smallest elements
        System.out.println("*** K Smallest Elements ***");
        obj.print(ans);
    }
}