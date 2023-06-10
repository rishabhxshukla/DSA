// Move all zeroes to the beginning of the array

package Array.Questions;
import java.io.*;

class Zeroes_to_Beginning
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to move all the zeroes */
    static int[] moveZeroes()
    {
        int newarr[] = new int[size];
        int k = 0;

        //Moving all the zeroes
        for (int i=0; i<size; i++)
        {
            if (arr[i] == 0)
                newarr[k++] = 0;
        }

        //Moving non-zero elements
        for (int i=0; i<size; i++)
        {
            if (arr[i] != 0)
                newarr[k++] = arr[i];
        }

        return newarr;
    }


    public static void main(String[] args) throws IOException
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

        //Moving the zeroes
        int ans[] = moveZeroes();

        //Printing new array
        System.out.println("\n*** New Array ***");
        for (int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}