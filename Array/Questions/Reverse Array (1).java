// Reverse an array
// TEMP ARRAY

package Array.Questions;
import java.io.*;

class ReverseArray1
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to reverse an array */
    static int[] reverse()
    {
        int newarr[] = new int[size];
        int k = 0;

        for (int i = size-1; i>=0; i--)
        {
            newarr[k++] = arr[i];
        }

        return newarr;
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing original array
        System.out.println("*** Original Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Reversing the array
        int ans[] = reverse();

        //Printing new array
        System.out.println("\n*** New Array ***");
        for (int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}