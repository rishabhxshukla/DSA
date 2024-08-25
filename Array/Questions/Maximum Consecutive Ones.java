// Given a binary array, return the maximum number of consecutive 1's in the array.
// COUNTER + MAX

package Array.Questions;
import java.io.*;

class MaximumConsecutiveOnes
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


    /* Function to find the consecutive ones */
    static int maximumConsecutiveOnes()
    {
        int max = 0;
        int count = 0;

        for (int i=0; i<size; i++)
        {
            //If 1 is found, increase the counter
            if (arr[i] == 1)
            {
                //Counter variable
                count++;

                //Variable to hold maximum frequency
                if (count > max) {
                    max = count;
                }
            }
            //If 0 is found, reduce counter to 0
            else {
                count = 0;
            }
        }

        return max;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MaximumConsecutiveOnes obj = new MaximumConsecutiveOnes();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the maximum consecutive ones
        System.out.println("\nMaximum consecutive ones : " + maximumConsecutiveOnes());
    }
}