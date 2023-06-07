// Reverse an array (using single pointer)

package Questions;
import java.io.*;

class ReverseArray2
{
    static final int size = 5;
    static int arr[] = new int[size];


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
        ReverseArray2 obj = new ReverseArray2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing original array
        System.out.println("*** Original Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Reversing the array
        obj.reverse();

        //Printing new array
        System.out.println("\n*** New Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}