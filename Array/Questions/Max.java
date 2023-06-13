// Largest element of the array

package Array.Questions;
import java.io.*;

class Max
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


    /* Function to find the largest element of the array */
    static int largest()
    {
        int max = Integer.MIN_VALUE;

        for (int i=0; i<size; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Max obj = new Max();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the largest element
        System.out.println("\nLargest element : " + largest());
    }
}