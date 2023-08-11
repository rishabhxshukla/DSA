/*
Difference Between Element Sum and Digit Sum of an Array
1) The element sum is the sum of all the elements in arr.
2) The digit sum is the sum of all the digits (not necessarily distinct) that appear in arr.
Return the difference between the element sum and digit sum of the array.
*/

package Array.Questions;
import java.io.*;

class SumDifference
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


    /* Function to find the difference */
    static int difference()
    {
        int sumElements = 0, sumDigits = 0;

        //Sum of elements
        for (int i=0; i<arr.length; i++)
        {
            sumElements += arr[i];
        }

        //Sum of digits
        for (int i=0; i<arr.length; i++)
        {
            int n = arr[i];
            while(n > 0)
            {
                int r = n % 10;
                sumDigits += r;
                n = n / 10;
            }
        }

        return (sumElements - sumDigits);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SumDifference obj = new SumDifference();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the difference
        System.out.println("\nDifference : " + difference());
    }
}