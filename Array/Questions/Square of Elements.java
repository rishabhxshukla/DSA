// Find the square of elements of the array

package Array.Questions;
import java.io.*;

class SquareElements
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


    /* Function to find the squares */
    void square()
    {
        for (int i=0; i<size; i++)
        {
            arr[i] = arr[i] * arr[i];
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SquareElements obj = new SquareElements();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Calculating the squares
        obj.square();

        //Printing the squares
        System.out.println("\n*** Square of Elements ***");
        obj.print(arr);
    }
}