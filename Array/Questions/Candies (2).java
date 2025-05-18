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
// HASHMAP

package Array.Questions;
import java.io.*;
import java.util.*;

class Candies2
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


    /* Function to check if 'val' is max element of the array */
    static boolean isGreatest(int val)
    {
        for (int i=0; i<candies.length; i++)
        {
            //If val is less than any value of the array
            if (val < candies[i]) {
                return false;
            }
        }

        return true;
    }


    /* Function to find the kids with greatest candies */
    void greatest(int extra)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Boolean> ans = new ArrayList<>();

        //Storing values in HashMap
        for (int i=0; i<candies.length; i++)
        {
            hm.put(i + 1, candies[i]);
        }

        //Checking if current element is the greatest
        for (int i=0; i<candies.length; i++)
        {
            int already = candies[i];
            int val = already + extra;

            if (isGreatest(val)) {
                ans.add(true);
            }
            else {
                ans.add(false);
            }
        }

        //Printing the answer list
        System.out.println(ans);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Candies2 obj = new Candies2();

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