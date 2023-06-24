// Find all the negative-positive pairs present in an array.
// 2 POINTERS

package Array.Questions;
import java.io.*;
import java.util.*;

class NegativePositivePair2
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


    /* Function to find the negative-positive pairs */
    void pairs()
    {
        //Sorting the array to segregate
        Arrays.sort(arr);

        //Pointers
        int i = 0, j = size - 1;

        while (i < j)
        {
            //If sum is 0, then print
            if (arr[i] + arr[j] == 0)
            {
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            }

            //If weightage is more on right
            else if (arr[i] + arr[j] > 0) {
                j--;
            }

            //If weightage is more on left
            else if (arr[i] + arr[j] < 0) {
                i++;
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        NegativePositivePair2 obj = new NegativePositivePair2();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the pairs
        System.out.println("\n*** Negative-Positive Pairs ***");
        obj.pairs();
    }
}