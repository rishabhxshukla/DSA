/*
You are given an array consisting of "equal" number of positive and negative numbers.
Rearrange the array such that the numbers are placed in an alternate sign order.
Example :
Input: arr = [1, 2, 3, -4, -5, -6]
Output: arr = [1, -4, 2, -5, 3, -6]
Explanation:
Positive numbers are [1, 2, 3]. Negative numbers are [-4, -5, -6].
*/
// 2 POINTERS

package Array.Questions;
import java.io.*;

class AlternatePositiveNegative2
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
        int temp[] = new int[size];
        int pos = 0, neg = 1;

        //Storing positive & negative numbers using 2 pointers
        //Positive numbers are stored at even indices
        //Negative numbers are stored at odd indices
        for (int i=0; i<size; i++)
        {
            if (arr[i] > 0) {
                temp[pos] = arr[i];
                pos = pos + 2;
            }
            else {
                temp[neg] = arr[i];
                neg = neg + 2;
            }
        }

        //Printing the rearranged array
        print(temp);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        AlternatePositiveNegative2 obj = new AlternatePositiveNegative2();

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