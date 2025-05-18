/*
Kids With the Greatest Number of Candies
There are n kids with candies. You are given an integer array candies, where each candies[i]
represents the number of candies the ith kid has, and an integer extraCandies, denoting the
number of extra candies that you have.
Return a boolean array of length n, where result[i] is true if, after giving the ith kid all the
extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Input: candies = [2, 3, 5, 1, 3], extraCandies = 3
Output: [true, true, true, false, true]
*/
// FIND MAX & COMPARE

package Array.Questions;
import java.io.*;
import java.util.*;

class Candies1
{
    static int candies[] ={2, 3, 5, 1, 3};
    static int size = candies.length;


    /* Printing the array */
    void print()
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(candies[i] + " ");
        }
    }


    /* Function to find the kids with greatest candies */
    void greatest(int extra)
    {
        int max = Integer.MIN_VALUE;
        boolean temp[] = new boolean[size];

        //Finding the maximum element
        for (int i = 0; i < candies.length; i++)
        {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        //Making the boolean array
        for (int i = 0; i < candies.length; i++)
        {
            if (candies[i] + extra >= max) {
                temp[i] = true;
            }
            else {
                temp[i] = false;
            }
        }

        System.out.println(Arrays.toString(temp));
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Candies1 obj = new Candies1();

        //Printing the array
        System.out.println("*** Candies ***");
        obj.print();

        int extra = 3;
        System.out.println("\nExtra candies : " + extra);

        //Printing the result
        System.out.println("Result :");
        obj.greatest(extra);
    }
}