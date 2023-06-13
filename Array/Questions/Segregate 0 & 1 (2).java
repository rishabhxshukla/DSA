// Segregate 0s on left side and 1s on right side of the array
// COUNT

package Array.Questions;
import java.io.*;

class Segregate2
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to segregate the array */
    void segregate()
    {
        int count = 0;

        //Counting the no. of 0's
        for (int i=0; i<size; i++)
        {
            if (arr[i] == 0)
                count++;
        }

        //Filling array with 0's until count
        for (int i=0; i<count; i++)
        {
            arr[i] = 0;
        }

        //Filling the remaining array with 1's
        for (int i=count; i<size; i++)
        {
            arr[i] = 1;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Segregate2 obj = new Segregate2();
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

        //Segregating the array
        obj.segregate();

        //Printing the segregated array
        System.out.println("\n*** New Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}