// Find the minimum and maximum elements of an array in 1 iteration.

package Array.Questions;
import java.io.*;

class MinAndMax
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
    void MinMax()
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

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

        //Printing the min and max element
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MinAndMax obj = new MinAndMax();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the minimum & maximum
        System.out.println("\n*** Minimum & Maximum Elements ***");
        obj.MinMax();
    }
}