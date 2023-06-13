// Reverse an array
// TEMP ARRAY

package Array.Questions;
import java.io.*;

class ReverseArray1
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


    /* Function to reverse an array */
    static int[] reverse()
    {
        int newarr[] = new int[size];
        int k = 0;

        for (int i = size-1; i>=0; i--)
        {
            newarr[k++] = arr[i];
        }

        return newarr;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ReverseArray1 obj = new ReverseArray1();

        //Creating the array
        obj.create();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Reversing the array
        int ans[] = reverse();

        //Printing new array
        System.out.println("\n*** New Array ***");
        obj.print(ans);
    }
}