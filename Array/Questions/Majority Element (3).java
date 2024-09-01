/*
Given an array, return the majority element present inside it.
Majority element is the element that appears more than N/2 times.

Example :
Input: arr = [3, 1, 2, 3, 3]
Output: 3
*/
// BOYER-MOORE MAJORITY VOTING ALGORITHM
/*
At the beginning, count = 0 and candidate = none.
Start iterating through the array :
   1) If count is 0, pick the current element as the new candidate and set count = 1.
   2) If the current element is same as the candidate, increment count.
   3) If the current element is different from the candidate, decrement count.

The candidate at the end of this process is the potential majority element because its
frequency 'outweighs' other elements during the traversal.
*/

package Array.Questions;
import java.io.*;

class MajorityElement3
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


    /* Function to find the majority element */
    static int majorityElement()
    {
        int count = 0, candidate = 0;

        /* STEP 1: Finding the candidate for majority element */
        for (int i=0; i<size; i++)
        {
            //If count is 0, assign the new element as candidate
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
            //If current element is same as candidate, increase count
            else if (arr[i] == candidate) {
                count++;
            }
            //If current element is different from candidate, decrease count
            else if (arr[i] != candidate) {
                count--;
            }
        }

        /* STEP 2: Check if the candidate is actually the majority element */
        //Note: If the problem guarantees that the majority element is present in the array,
        //you can skip this step and return candidate as the majority element.
        count = 0;
        for (int i=0; i<size; i++)
        {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > size / 2) {
            return candidate;
        }
        else {
            return -999;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MajorityElement3 obj = new MajorityElement3();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the majority element
        System.out.println("\nMajority element : " + majorityElement());
    }
}