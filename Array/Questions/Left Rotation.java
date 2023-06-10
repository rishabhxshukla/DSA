// Left rotation shifts each of the array elements to the left by 1 unit.

package Questions;
import java.io.*;

class LeftRotation
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to left rotate the array */
    // 1 2 3 4 5   -->   2 3 4 5 1
    void leftRotate()
    {
        //Storing the 1st element
        int first = arr[0];

        //Starting from the 2nd element
        for (int i=1; i<size; i++)
        {
            arr[i-1] = arr[i];
        }

        //Replacing the last element
        arr[size-1] = first;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        LeftRotation obj = new LeftRotation();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing the array
        System.out.println("*** Original Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Rotating the array
        obj.leftRotate();

        //Printing the rotated array
        System.out.println("\n*** New Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}