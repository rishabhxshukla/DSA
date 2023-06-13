// Move negative numbers to the beginning and positive numbers to the end of array
// 1 POINTER

package Array.Questions;
import java.io.*;

class NegativePositive1
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to move the negative numbers to the beginning */
    void move()
    {
        int temp = 0, j = 0;

        for (int i=0; i<size; i++)
        {
            //Swap with 'j' if negative
            if (arr[i] < 0)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        NegativePositive1 obj = new NegativePositive1();
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