/*
Taking input from user in single line with space separated values.
1) Take input in single line
2) Split the values by space
3) Convert string[] to int[]
*/

package Array;
import java.io.*;

class SingleLineInput
{
    static final int size = 5;
    static int arr[] = new int[size];


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter 5 elements (separated by space) : ");
        String line = b.readLine();
        String input[] = line.trim().split(" ");

        //Creating the array
        for (int i=0; i<input.length; i++)
        {
            arr[i] = Integer.parseInt(input[i]);
        }

        //Printing the array
        System.out.println("*** Created Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}