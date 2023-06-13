// Reverse an array
// 2 POINTERS

package Array.Questions;
import java.io.*;

class ReverseArray3
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
    void reverse()
    {
        int start = 0, end = size-1, temp;

        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ReverseArray3 obj = new ReverseArray3();

        //Creating the array
        obj.create();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Reversing the array
        obj.reverse();

        //Printing new array
        System.out.println("\n*** New Array ***");
        obj.print(arr);
    }
}