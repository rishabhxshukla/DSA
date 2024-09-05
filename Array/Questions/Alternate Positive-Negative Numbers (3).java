/*
You are given an array consisting of "different" number of positive and negative numbers.
Rearrange the array such that the numbers are placed in an alternate sign order.
The leftover elements should be placed at the very end in the same order as in original array.
Example :
Input: arr = [1, 2, 3, 4, -5, -6]
Output: arr = [1, -5, 2, -6, 3, 4]
Explanation:
Positive numbers are [1, 2]. Negative numbers are [-5, -6]. Extra numbers are [3, 4].
*/
// 2 TEMP ARRAYS + 2 POINTERS

package Array.Questions;
import java.io.*;

class AlternatePositiveNegative3
{
    static final int size = 6;
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


    /* Function to rearrange the numbers */
    void rearrange()
    {
        int a = 0, b = 0;
        int positive[] = new int[size];
        int negative[] = new int[size];

        //Segregating positive & negative numbers in 2 arrays
        for (int i=0; i<size; i++)
        {
            if (arr[i] > 0) {
                positive[a++] = arr[i];
            }
            else {
                negative[b++] = arr[i];
            }
        }

        //Rearranging array in alternate order of positive-negative numbers
        int i = 0, p = 0, n = 0;

        //Placing numbers in alternate order
        while (p < a && n < b)
        {
            arr[i] = positive[p++];
            arr[i + 1] = negative[n++];
            i = i + 2;
        }

        //Appending positive numbers (if any)
        while (p < a)
        {
            arr[i++] = positive[p++];
        }

        //Appending negative numbers (if any)
        while (n < b)
        {
            arr[i++] = negative[n++];
        }

        //Printing the rearranged array
        print(arr);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        AlternatePositiveNegative3 obj = new AlternatePositiveNegative3();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the rearranged array
        System.out.println("\nArray after rearranging in alternate positive-negative order :");
        obj.rearrange();
    }
}