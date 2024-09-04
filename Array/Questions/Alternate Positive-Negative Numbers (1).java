/*
You are given an array of even length consisting of an equal number of positive and negative numbers.
Rearrange the array such that the numbers are placed in an alternate sign order.
Example :
Input: arr = [3, 1, -2, -5, 2, -4]
Output: arr = [3, -2, 1, -5, 2, -4]
Explanation:
The positive numbers are [3, 1, 2]. The negative numbers are [-2, -5, -4].
*/
// TEMP ARRAYS

package Array.Questions;
import java.io.*;

class AlternatePositiveNegative1
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
        int positive[] = new int[size / 2];
        int negative[] = new int[size / 2];

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
        a = 0; b = 0;
        for (int i=0; i<size; i=i+2)
        {
            arr[i] = positive[a++];
            arr[i + 1] = negative[b++];
        }

        //Printing the rearranged array
        print(arr);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        AlternatePositiveNegative1 obj = new AlternatePositiveNegative1();

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