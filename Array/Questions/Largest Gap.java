// Given an unsorted array, find the largest gap between any two elements of the array.
// MAX - MIN

package Array.Questions;
import java.io.*;

class LargestGap
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


    /* Function to find the largest gap */
    static int largestGap()
    {
        int min = arr[0];
        int max = arr[0];

        for (int i=0; i<size; i++)
        {
            //Minimum
            if (arr[i] < min) {
                min = arr[i];
            }

            //Maximum
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return (max - min);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        LargestGap obj = new LargestGap();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the largest gap
        System.out.println("\nLargest Gap : " + largestGap());
    }
}