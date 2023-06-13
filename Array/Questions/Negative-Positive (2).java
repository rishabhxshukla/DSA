// Move negative numbers to the beginning and positive numbers to the end of array
// 2 POINTERS

package Array.Questions;
import java.io.*;

class NegativePositive2
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

        //Creating the array
        obj.create();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Moving negative numbers
        obj.move();

        //Printing new array
        System.out.println("\n*** New Array ***");
        obj.print(arr);
    }
}