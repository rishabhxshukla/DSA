// Move even numbers to the beginning and odd numbers to the end of array
// 2 POINTERS

package Array.Questions;
import java.io.*;

class EvenOdd2
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
        int i = 0, j = size-1;

        while (i < j)
        {
            //If odd on left and even on right, then swap
            if ((arr[i] % 2 != 0) && (arr[j] % 2 == 0)) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }

            //If even is already present on left
            if (arr[i] % 2 == 0) {
                i++;
            }

            //If odd is already present on right
            if (arr[j] % 2 != 0) {
                j--;
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        EvenOdd2 obj = new EvenOdd2();

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