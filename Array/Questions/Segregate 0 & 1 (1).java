// Segregate 0s on left side and 1s on right side of the array
// TEMP ARRAY

package Array.Questions;
import java.io.*;

class Segregate1
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
        int temp[] = new int[size];
        int k = 0;

        //If 0 is found
        for (int i=0; i<size; i++)
        {
            if (arr[i] == 0) {
                temp[k++] = 0;
            }
        }

        //If 1 is found
        for (int i=0; i<size; i++)
        {
            if (arr[i] == 1) {
                temp[k++] = 1;
            }
        }

        //Copying elements back to original array
        for (int i=0; i<size; i++)
        {
            arr[i] = temp[i];
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Segregate1 obj = new Segregate1();

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