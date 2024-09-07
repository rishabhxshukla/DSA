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
// NESTED LOOPS

package Array.Questions;
import java.io.*;

class LongestConsecutiveSequence1
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

        //Picking each element one-by-one and checking if a consecutive element is present
        for (int i=0; i<size; i++)
        {
            int seqLen = 1;         //Current length of subsequence
            int element = arr[i];   //Picked up element

            //Checking if array contains element + 1
            while (true)
            {
                boolean foundNext = false;

                //Check if next consecutive element exists
                for (int j=0; j<size; j++)
                {
                    if (arr[j] == element + 1) {
                        seqLen++;             //Increment the length
                        element = arr[j];     //Start checking from this new element
                        foundNext = true;     //Mark that we found the next element
                        break;                //Exit inner loop and continue checking further
                    }
                }

                //If next consecutive element is not found, break the while loop
                if (!foundNext) {
                    break;
                }
            }

            //Update the length of longest sequence
            if (seqLen > max) {
                max = seqLen;
            }
        }

        return max;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        LongestConsecutiveSequence1 obj = new LongestConsecutiveSequence1();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the length of longest consecutive sequence
        System.out.println("\nLongest Consecutive Sequence : " + longestConsecutiveSequence());
    }
}