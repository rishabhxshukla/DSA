/*
Running Sum of Array
Running sum of an array : runningSum[i] = sum(arr[0]...arr[i]).
*/

package Array.Questions;
import java.io.*;

class RunningSum
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


    /* Function to find the running sum */
    static int[] runningSum()
    {
        int sum = 0;
        int ans[] = new int[size];

        for (int i=0; i<size; i++)
        {
            sum = sum + arr[i];
            ans[i] = sum;
        }

        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        RunningSum obj = new RunningSum();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the running sum
        System.out.println("\nRunning sum : ");
        int ans[] = runningSum();
        obj.print(ans);
    }
}