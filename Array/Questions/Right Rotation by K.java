// Right rotation shifts each of the array elements to the right by k unit.

package Array.Questions;
import java.io.*;

class RightRotation_by_K
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
    void rightRotate(int k)
    {
        while (k > 0)
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

            //Changing the value of k
            k--;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        RightRotation_by_K obj = new RightRotation_by_K();
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
        obj.rightRotate(k);

        //Printing the rotated array
        System.out.println("*** New Array ***");
        obj.print(arr);
    }
}