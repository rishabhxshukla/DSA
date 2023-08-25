/*
Given an array of integers, return the number of good pairs present in it.
A pair (i, j) is called good if arr[i] == arr[j] and i < j.
Input: [1, 2, 3, 1, 1, 3]
Output: 4
Explanation: 4 good pairs : (1,1), (1,1), (1,1), (3,3).
*/
// NESTED LOOP

package Array.Questions;
import java.io.*;

class GoodPairs1
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


    /* Function to find the no. of good pairs */
    static int goodPairs()
    {
        int count = 0;

        for (int i=0; i<size; i++)
        {
            for (int j=i+1; j<size; j++)
            {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        GoodPairs1 obj = new GoodPairs1();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the no. of good pairs
        System.out.println("\nNo. of good pairs : " + goodPairs());
    }
}