// Segregate 0s on left side and 1s on right side of the array

package Array.Questions;
import java.io.*;

class Segregate3
{
    static final int size = 5;
    static int arr[] = new int[size];


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
        Segregate3 obj = new Segregate3();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing the array
        System.out.println("*** Original Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Segregating the array
        obj.segregate();

        //Printing the segregated array
        System.out.println("\n*** New Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}