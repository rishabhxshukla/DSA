// Find the square of elements of the array

package Array.Questions;
import java.io.*;

class SquareElements
{
    static final int size = 5;
    static int arr[] = new int[size];


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
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing the array
        System.out.println("*** Created Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Calculating the squares
        obj.square();

        //Printing the squares
        System.out.println("\n*** Square of Elements ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}