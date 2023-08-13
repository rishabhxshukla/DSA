/*
Find the Highest Altitude
There is a biker going on a road trip. The road trip consists of n + 1 points at different
altitudes. The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array 'arr' of length n where arr[i] is the net gain in altitude
between points i and i + 1. Return the highest altitude of a point.

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest one is 1.
*/

package Array.Questions;
import java.io.*;
import java.util.*;

class HighestAltitude
{
    static int arr[] = {-5, 1, 5, 0, -7};
    static int size = arr.length;


    /* Printing the array */
    void print()
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    /* Function to find the highest altitude */
    static int highestAltitude()
    {
        //Altitude array
        int temp[] = new int[size + 1];

        //Storing 0 initially
        temp[0] = 0;

        //Storing altitude at each point
        for (int i=0; i<size; i++)
        {
            temp[i + 1] =  temp[i] + arr[i];
        }

        //Sorting the array
        Arrays.sort(temp);

        //Returning the highest altitude present at last index
        return temp[temp.length - 1];
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        HighestAltitude obj = new HighestAltitude();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print();

        //Printing the highest altitude
        System.out.println("\nHighest altitude : " + highestAltitude());
    }
}