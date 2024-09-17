/*
Given an array, return the majority element present inside it.
Majority element is the element that appears more than 'N / 3' times.

Example :
Input: arr = [3, 1, 2, 3, 3, 4]
Output: 3
*/
// NESTED LOOPS

package Array.Questions;
import java.io.*;

class MajorityElement4
{
    static final int size = 6;
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
        for (int i=0; i<size; i++)
        {
            int count = 0;

            //Counting the frequency of each element
            for (int j=0; j<size; j++)
            {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            //If count of element is more than N/3
            //Then it is the majority element
            if (count > size / 3) {
                return arr[i];
            }
        }

        return -999;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MajorityElement4 obj = new MajorityElement4();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the majority element
        System.out.println("\nMajority element : " + majorityElement());
    }
}