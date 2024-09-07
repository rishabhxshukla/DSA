/*
Given an unsorted array, return the length of the longest consecutive sequence.
Consecutive elements are elements that come after one another without any gap.
Example :
Input: arr = [102, 4, 100, 50, 101, 3, 2, 1]
Output: 4
Explanation:
Here, we have 2 consecutive sequences : [100, 101, 102] and [1, 2, 3, 4].
However, the longest consecutive sequence is [1, 2, 3, 4], so we return 4.
*/
// HASHSET

package Array.Questions;
import java.io.*;
import java.util.*;

class LongestConsecutiveSequence3
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


    /* Function to find the length of longest consecutive sequence */
    static int longestConsecutiveSequence()
    {
        int max = 0;
        HashSet<Integer> hs = new HashSet<>();

        //Adding all the elements to HashSet
        for (int i=0; i<size; i++)
        {
            hs.add(arr[i]);
        }

        //Loop through the array elements
        for (int i=0; i<size; i++)
        {
            //Check if the current number is the start of a sequence
            if (!hs.contains(arr[i] - 1))
            {
                int number = arr[i];    //Start of sequence
                int seqLen = 1;

                //Starting from number, check if number + 1 is present in HashSet
                while (hs.contains(number + 1))
                {
                    number = number + 1;    //Changing start to next number
                    seqLen++;               //Increasing sequence length
                }

                //Update the length of longest sequence
                max = Math.max(max, seqLen);
            }
        }

        return max;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        LongestConsecutiveSequence3 obj = new LongestConsecutiveSequence3();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the length of longest consecutive sequence
        System.out.println("\nLongest Consecutive Sequence : " + longestConsecutiveSequence());
    }
}