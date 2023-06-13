// Move negative numbers to the beginning and positive numbers to the end of array
// Using 2 pointers

package Array.Questions;
import java.io.*;

class NegativePositive2
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to move the negative numbers to the beginning */
    void move()
    {
        int i = 0, j = size-1;

        while (i < j)
        {
            //If +ve on left and -ve on right, then swap
            if (arr[i] >= 0 && arr[j] < 0)
            {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;

                i++;
                j--;
            }

            //If -ve is already present on left
            if (arr[i] < 0)
                i++;

            //If +ve is already present on right
            if (arr[j] >= 0)
                j--;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        NegativePositive2 obj = new NegativePositive2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing original array
        System.out.println("*** Original Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Moving negative numbers
        obj.move();

        //Printing new array
        System.out.println("\n*** New Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}