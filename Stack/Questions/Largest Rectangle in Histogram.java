/*
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
return the area of the largest rectangle in the histogram.

Example :
Input: heights = [2, 1, 5, 6, 2, 3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
*/

package Stack.Questions;
import java.io.*;
import java.util.*;

class LargestRectangleInHistogram

{
    static int arr[] = {2, 1, 5, 6, 2, 3};


    /* Function to find the largest rectangle area in histogram */
    public static int largestArea()
    {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;

        //Loop through all the bars
        for (int i = 0; i <= arr.length; i++)
        {
            //If we reach the end, take height as 0
            int currentHeight = (i == arr.length) ? 0 : arr[i];

            /*
               If current bar is smaller, then previous taller bars cannot extend further
               -> Remove bars that are taller than current bar
               -> Calculate the area each time
               -> Update maxArea variable
            */
            while (!s.isEmpty() && currentHeight < arr[s.peek()])
            {
                int height = arr[s.pop()];
                int width;

                //Bar spans from start
                if (s.isEmpty()) {
                    width = i;
                }
                //Bar spans between two smaller bars
                else {
                    width = i - s.peek() - 1;
                }

                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }

            //Push current index in stack
            s.push(i);
        }

        return maxArea;
    }


    public static void main(String args[]) throws IOException
    {
        //Printing the original histogram array
        System.out.println("Histogram array : " + Arrays.toString(arr));

        //Printing the largest area
        System.out.println("Largest rectangle area : " + largestArea());
    }
}