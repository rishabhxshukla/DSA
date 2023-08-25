/*
Count Good Triplets
Given an array of integers arr, and three integers a, b and c.
You need to find the number of good triplets.
A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:
1) 0 <= i < j < k < arr.length
2) |arr[i] - arr[j]| <= a
3) |arr[j] - arr[k]| <= b
3) |arr[i] - arr[k]| <= c
Return the number of good triplets.

Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
Output: 4
Explanation: There are 4 good triplets: (3,0,1), (3,0,1), (3,1,1), (0,1,1).
*/
// NESTED LOOPS

package Array.Questions;
import java.io.*;

class GoodTriplets
{
    static int arr[] = {3, 0, 1, 1, 9, 7};


    /* Printing the array */
    void print()
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Function to find the good triplets */
    static int goodTriplets(int a, int b, int c)
    {
        int count = 0;

        for (int i=0; i<arr.length; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                for (int k=j+1; k<arr.length; k++)
                {
                    if ((Math.abs(arr[i] - arr[j]) <= a) &&
                        (Math.abs(arr[j] - arr[k]) <= b) &&
                        (Math.abs(arr[i] - arr[k]) <= c))
                    {
                        count++;
                    }
                }
            }
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        GoodTriplets obj = new GoodTriplets();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print();

        //Printing the no. of good triplets
        System.out.println("\nNo. of good triplets : " + goodTriplets(7, 2, 3));
    }
}