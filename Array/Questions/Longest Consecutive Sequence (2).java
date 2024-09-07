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
// SORTING

package Array.Questions;
import java.io.*;
import java.util.*;

class LongestConsecutiveSequence2
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
        //Sorting the array
        Arrays.sort(arr);

        int max = 0;           //Longest consecutive sequence length
        int seqLen = 1;        //Current length of sequence

        for (int i=1; i<size; i++)
        {
            //If current element is consecutive to its previous one, increase seqLen
            if (arr[i] == arr[i-1] + 1) {
                seqLen++;       //Increment length of current sequence
            }
            //If current element is not consecutive to its previous one, restart
            else if (arr[i] != arr[i - 1]) {
                seqLen = 1;    //Reset the length for new sequence
            }

            //Update the length of longest sequence
            max = Math.max(max, seqLen);
        }

        return max;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        LongestConsecutiveSequence2 obj = new LongestConsecutiveSequence2();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the length of longest consecutive sequence
        System.out.println("\nLongest Consecutive Sequence : " + longestConsecutiveSequence());
    }
}