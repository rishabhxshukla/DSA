// Left rotation shifts each of the array elements to the left by k unit.

package Array.Questions;
import java.io.*;

class LeftRotation_by_K3
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


    /* Function to left rotate the array */
    // 1 2 3 4 5   -->   2 3 4 5 1
    void leftRotate(int k)
    {
        //Avoid unnecessary rotations if k > size
        if (k > size) {
            k = k % size;
        }

        //Reverse the first k elements
        reverseArray(0, k - 1);

        //Reverse the remaining elements
        reverseArray(k, size - 1);

        //Reverse the entire array
        reverseArray(0, size - 1);
    }


    /* Helper function to reverse the elements of an array */
    void reverseArray(int start, int end)
    {
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        LeftRotation_by_K3 obj = new LeftRotation_by_K3();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the value of K : ");
        int k = Integer.parseInt(b.readLine());

        //Rotating the array
        obj.leftRotate(k);

        //Printing the rotated array
        System.out.println("*** New Array ***");
        obj.print(arr);
    }
}