// Move even numbers to the beginning and odd numbers to the end of array
// 1 POINTER

package Array.Questions;
import java.io.*;

class EvenOdd1
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


    /* Function to move the even numbers to the beginning */
    void move()
    {
        //Pointer
        int j = 0;

        for (int i=0; i<size; i++)
        {
            //Swap with 'j' if even
            if (arr[i] % 2 == 0)
            {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                j++;
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        EvenOdd1 obj = new EvenOdd1();

        //Creating the array
        obj.create();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Moving the numbers
        obj.move();

        //Printing new array
        System.out.println("\n*** New Array ***");
        obj.print(arr);
    }
}