// Smallest element of the array

package Array.Questions;
import java.io.*;

class Min
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


    /* Function to find the smallest element of the array */
    static int smallest()
    {
        int min = Integer.MAX_VALUE;

        for (int i=0; i<size; i++)
        {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Min obj = new Min();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the smallest element
        System.out.println("\nSmallest element : " + smallest());
    }
}