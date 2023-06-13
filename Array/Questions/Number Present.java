// Check if a number is present in the array not

package Array.Questions;
import java.io.*;

class NumberPresent
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to check the presence */
    static boolean isPresent(int key)
    {
        for (int i=0; i<size; i++)
        {
            if (arr[i] == key)
                return true;
        }
        return false;
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

        //Printing the array
        System.out.println("*** Created Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Taking user input
        System.out.print("\nEnter the no. that you want to check : ");
        int key = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("Is number present : " + isPresent(key));
    }
}