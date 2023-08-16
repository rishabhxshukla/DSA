/*
Sort the People
You are given an array of strings names, and an array heights that consists of distinct positive numbers.
For each index i, names[i] and heights[i] denote the name and height of the ith person.
Return names sorted in descending order by the people's heights.

Input: names = ["Mary", "John", "Emma"], heights = [180, 165, 170]
Output: ["Mary", "Emma", "John"]
Explanation: Mary is the tallest, followed by Emma and John.
*/

package Array.Questions;
import java.io.*;
import java.util.*;

class SortPeople
{
    static String names[] = {"Mary", "John", "Emma"};
    static int heights[] = {180, 165, 170};


    /* Printing the names */
    void printNames()
    {
        for (int i=0; i<names.length; i++)
        {
            System.out.print(names[i] + " ");
        }
    }


    /* Printing the heights */
    void printHeights()
    {
        for (int i=0; i<heights.length; i++)
        {
            System.out.print(heights[i] + " ");
        }
    }


    /* Function to sort people */
    void sortPeople()
    {
        //TreeMap sorts values based on keys
        TreeMap<Integer, String> tm = new TreeMap<>(Collections.reverseOrder());

        //Inserting height and name in TreeMap
        for (int i=0; i<heights.length; i++)
        {
            int key = heights[i];
            String value = names[i];

            tm.put(key, value);
        }

        //Printing the sorted values
        for (var i : tm.keySet())
        {
            System.out.print(tm.get(i) + " ");
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SortPeople obj = new SortPeople();

        //Printing the array
        System.out.println("*** Names ***");
        obj.printNames();
        System.out.println("\n*** Heights ***");
        obj.printHeights();

        //Sorting the heights and printing the names
        System.out.println("\n\nSorting the heights...");
        obj.sortPeople();
    }
}