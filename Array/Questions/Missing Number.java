// Missing number in an array of consecutive elements
// Gauss summation formula : (n * (n + 1)) / 2

package Array.Questions;
import java.io.*;

class MissingNumber
{
    static int arr[] = {1, 2, 4, 5};
    static int size = arr.length;


    /* Function to find the missing number */
    static int missing()
    {
        int n = size + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        //Sum of the elements present in the array
        for (int i=0; i<size; i++)
        {
            actualSum = actualSum + arr[i];
        }

        //Missing element
        int missing = expectedSum - actualSum;

        return missing;
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Printing the array
        System.out.println("*** Created Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Printing the missing element
        System.out.println("\nMissing element : " + missing());
    }
}