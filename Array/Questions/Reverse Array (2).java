// Reverse an array
// 1 POINTER

package Array.Questions;
import java.io.*;

class ReverseArray2
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
        int temp;

        //(end - start) formula
        for (int i=0; i<size/2; i++)
        {
            temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i] = temp;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ReverseArray2 obj = new ReverseArray2();

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