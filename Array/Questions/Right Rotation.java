// Right rotation shifts each of the array elements to the right by 1 unit.

package Array.Questions;
import java.io.*;

class RightRotation
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


    /* Function to right rotate the array */
    // 1 2 3 4 5   -->   5 1 2 3 4
    void rightRotate()
    {
        //Storing the last element
        int last = arr[size-1];

        //Starting from the last element
        for (int i=size-1; i>=1; i--)
        {
            arr[i] = arr[i-1];
        }

        //Replacing the first element
        arr[0] = last;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        RightRotation obj = new RightRotation();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Rotating the array
        obj.rightRotate();

        //Printing the rotated array
        System.out.println("\n*** New Array ***");
        obj.print(arr);
    }
}