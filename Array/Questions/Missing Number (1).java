// Missing number in an array of consecutive elements
// TEMP ARRAY

package Array.Questions;
import java.io.*;

class MissingNumber1
{
    static int arr[] = {1, 2, 4, 5};
    static int size = arr.length;


    /* Printing the array */
    void print(int a[])
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* Function to find the missing number */
    static int missing()
    {
        //Temp array to keep track of present elements
        //2 extra space for: 1-based indexing, missing element
        int temp[] = new int[size + 2];

        //Tracking which elements are already present
        for (int i=0; i<size; i++)
        {
            temp[arr[i]] = 1;
        }

        //Looking for the missing element
        for (int i=1; i<temp.length; i++)
        {
            if (temp[i] == 0) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MissingNumber1 obj = new MissingNumber1();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the missing element
        System.out.println("\nMissing element : " + missing());
    }
}