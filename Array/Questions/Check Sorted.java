// Check if the array is sorted
// current-previous comparison

package Array.Questions;
import java.io.*;

class CheckSorted
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


    /* Function to check if array is sorted */
    static boolean checkSorted()
    {
        for (int i=1; i<size; i++)
        {
            //If current element < previous element
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        CheckSorted obj = new CheckSorted();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the result
        System.out.println("\nSorted : " + checkSorted());
    }
}