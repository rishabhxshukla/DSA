/*
Stock Buy-Sell problem to maximize profit.
Given an array 'prices' where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy a stock and a different day to sell that stock.

Example :
Input: prices[] = {7, 1, 5, 3, 6, 4}
Output: 5
Explanation: Buy stock on day 2 and sell it on day 5 => 6 – 1 = 5
*/
// MAX-MIN

package Array.Questions;
import java.io.*;

class Stocks1
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


    /* Function to find the maximum profit */
    static int maxProfit()
    {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int max = Integer.MIN_VALUE;

        //Finding the minimum element of the array
        for (int i = 0; i < size; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
                minIndex = i;
            }
        }

        //Finding the maximum element to the right of min
        for (int i = (minIndex + 1); i < size; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }

        //Returning maximum profit
        return (max - min);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Stocks1 obj = new Stocks1();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the maximum profit
        System.out.println("\nMaximum profit : " + maxProfit());
    }
}