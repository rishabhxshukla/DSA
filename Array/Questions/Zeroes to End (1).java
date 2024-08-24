// Move all zeroes to the end of the array
// TEMP ARRAY

package Array.Questions;
import java.io.*;

class Zeroes_to_End1
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


    /* Function to move all the zeroes */
    static int[] moveZeroes()
    {
        int newarr[] = new int[size];
        int k = 0;

        //Filling non-zero elements
        for (int i=0; i<size; i++)
        {
            if (arr[i] != 0) {
                newarr[k] = arr[i];
                k++;
            }
        }

        //Filling zeroes
        for (int i=k; i<size; i++)
        {
            newarr[i] = 0;
        }

        return newarr;
    }


    public static void main(String[] args) throws IOException
    {
        //Creating object of the class
        Zeroes_to_End1 obj = new Zeroes_to_End1();

        //Creating the array
        obj.create();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Moving the zeroes
        int ans[] = moveZeroes();

        //Printing new array
        System.out.println("\n*** New Array ***");
        obj.print(ans);
    }
}