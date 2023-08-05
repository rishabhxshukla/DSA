/*
Richest Customer Wealth
You are given a m x n grid accounts where accounts[i][j] is the amount of money
the ith customer has in the jth bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
*/

package Array.Questions;
import java.io.*;
import java.util.*;

class RichestCustomer
{
    static int arr[][] = {
                          {1, 5},
                          {7, 3},
                          {3, 5}
                         };


    /* Function to find the person with maximum wealth */
    static int maximumWealth()
    {
        int sum = 0;
        //List to store the sum of each row
        ArrayList<Integer> rowSum = new ArrayList<>();

        for (int i=0; i<arr.length; i++)
        {
            sum = 0;    //Initializing sum to 0 for each row

            for (int j=0; j<arr[i].length; j++)
            {
                sum = sum + arr[i][j];
            }

            //Adding sum of each row in the list
            rowSum.add(sum);
        }

        //Sorting the list
        Collections.sort(rowSum);

        return rowSum.get(rowSum.size() - 1);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        RichestCustomer obj = new RichestCustomer();

        //Printing the maximum wealth
        System.out.println("Maximum wealth : " + maximumWealth());
    }
}