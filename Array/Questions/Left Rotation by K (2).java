// Left rotation shifts each of the array elements to the left by k unit.

package Array.Questions;
import java.io.*;

class LeftRotation_by_K2
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to left rotate the array */
    // 1 2 3 4 5   -->   2 3 4 5 1
    void leftRotate(int k)
    {
        int temp[] = new int[size];
        int j = 0;

        //Storing elements from kth index to the last index
        for (int i=k; i<size; i++)
        {
            temp[j++] = arr[i];
        }

        //Storing elements from 0th index to the kth index
        for (int i=0; i<k; i++)
        {
            temp[j++] = arr[i];
        }

        //Copying elements of temp array into original array
        for (int i=0; i<size; i++)
        {
            arr[i] = temp[i];
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        LeftRotation_by_K2 obj = new LeftRotation_by_K2();
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

        //Taking user input
        System.out.print("\nEnter the value of K : ");
        int k = Integer.parseInt(b.readLine());

        //Rotating the array
        obj.leftRotate(k);

        //Printing the rotated array
        System.out.println("*** New Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}