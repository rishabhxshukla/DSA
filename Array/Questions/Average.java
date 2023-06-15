// Average of elements of the array

package Array.Questions;
import java.io.*;

class Average
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


    /* Function to find the sum of the array */
    static int average()
    {
        int sum = 0;

        for (int i=0; i<size; i++)
        {
            sum = sum + arr[i];
        }

        return (sum / size);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Average obj = new Average();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the average
        System.out.println("\nAverage : " + average());
    }
}