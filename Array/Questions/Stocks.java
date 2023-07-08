/*
Stock Buy-Sell problem to maximize profit.
Given an array 'prices' where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy a stock and a different day to sell that stock.

Example :
Input: prices[] = {7, 1, 5, 3, 6, 4}
Output: 5
Explanation: Buy stock on day 1 and sell it on day 4 => 6 – 1 = 5
*/

package Array.Questions;
import java.io.*;

class Stocks
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
        int profit = 0;     //Initially, profit is 0
        int min = arr[0];   //Initially, buying stock on day 0

        for (int i=1; i<size; i++)
        {
            //If current element < minimum price, make it the new minimum
            //Now we buy the stock at new minimum element price
            if (arr[i] < min) {
                min = arr[i];
            }
            //If current element > minimum price, find the maximum profit
            //Find the bigger value b/w previous profit and current profit
            else {
                profit = Math.max(profit, arr[i] - min);
            }
        }

        return profit;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Stocks obj = new Stocks();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the maximum profit
        System.out.println("\nMaximum profit : " + maxProfit());
    }
}