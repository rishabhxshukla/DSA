/*
Given an array of intervals where arr[i] = [start, end], merge all the
overlapping intervals, and return an array of the non-overlapping intervals
that cover all the intervals in the given input.

Example :
Input: arr = [[1, 3], [2, 6], [8, 10]]
Output: [[1, 6], [8, 10]]
Explanation: Since intervals [1, 3] and [2, 6] overlap, merge them into [1, 6].
*/
// NESTED LOOPS

package Array.Questions;
import java.io.*;
import java.util.*;

class OverlappingIntervals1
{
    //2D array to store the intervals
    static final int size = 3;
    static int arr[][] = new int[size][2];


    /* Creating the array */
    void create() throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the start of interval " + (i + 1) + ": ");
            arr[i][0] = Integer.parseInt(b.readLine());
            System.out.print("Enter the end of interval " + (i + 1) + ": ");
            arr[i][1] = Integer.parseInt(b.readLine());
        }
    }


    /* Printing the array */
    void print(int a[][])
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print("[" + a[i][0] + ", " + a[i][1] + "] ");
        }
    }


    /* Function to merge the overlapping intervals */
    void merge()
    {
        //Sorting the array by the 1st number of each interval
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));

        //List to store the final merged intervals
        ArrayList<Integer> merged = new ArrayList<>();

        //Iterate over the array and pick each interval one-by-one and check for
        //overlaps with any of the intervals already present in the merged list
        for (int i = 0; i < size; i++)
        {
            //Start & End of current interval
            int start = arr[i][0];
            int end = arr[i][1];

            //Inner loop to check against intervals present in merged list
            boolean mergedFlag = false;
            for (int j = 0; j < merged.size(); j = j + 2)
            {
                int mergedEnd = merged.get(j + 1);

                //If start of current interval <= end of a merged interval
                //it means they overlap, update the end of merged interval
                if (start <= mergedEnd)
                {
                    merged.set(j + 1, Math.max(mergedEnd, end));
                    mergedFlag = true;
                    break;
                }
            }

            //If the interval was not merged, add it as a new interval
            if (!mergedFlag) {
                merged.add(start);
                merged.add(end);
            }
        }

        //Printing the final intervals
        for (int i = 0; i < merged.size(); i = i + 2)
        {
            System.out.println("[" + merged.get(i) + ", " + merged.get(i + 1) + "]");
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        OverlappingIntervals1 obj = new OverlappingIntervals1();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Intervals ***");
        obj.print(arr);

        //Merging the overlapping intervals
        System.out.println("\n\n*** New Intervals ***");
        obj.merge();
    }
}