// Segregate 0s on left side and 1s on right side of the array
// 2 POINTERS

package Array.Questions;
import java.io.*;

class Segregate3
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


    /* Function to segregate the array */
    void segregate()
    {
        int i = 0, j = size-1;

        while (i < j)
        {
            //If 1 on left and 0 on right, then swap
            if (arr[i] == 1 && arr[j] == 0)
            {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;

                i++;
                j--;
            }

            //If 0 is already present on left
            if (arr[i] == 0)
                i++;

            //If 1 is already present on right
            if (arr[j] == 1)
                j--;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Segregate3 obj = new Segregate3();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Segregating the array
        obj.segregate();

        //Printing the segregated array
        System.out.println("\n*** New Array ***");
        obj.print(arr);
    }
}