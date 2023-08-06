/*
Create Target Array in the Given Order
Given two arrays arr and index. Your task is to create target array under the following rules :
1) Initially target array is empty.
2) Read arr[i] and index[i], insert at index index[i] the value arr[i] in target array.

Input: arr = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
*/

package Array.Questions;
import java.io.*;

class ElementAtIndex
{
    static final int size = 5;
    static int arr[] = {0, 1, 2, 3, 4};
    static int index[] = {0, 1, 2, 2, 1};


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


    /* Helper function to shift elements */
    static void shiftElements(int target[], int pos, int value, int length)
    {
        for (int i = length - 1; i >= pos; i--)
        {
            target[i + 1] = target[i];
        }

        target[pos] = value;
    }


    /* Function to create the target array */
    static int[] createTarget()
    {
        int target[] = new int [arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            shiftElements(target, index[i], arr[i], i);
        }

        return target;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ElementAtIndex obj = new ElementAtIndex();

        //Printing the arrays
        System.out.println("*** Array ***");
        obj.print(arr);
        System.out.println("\n*** Indices ***");
        obj.print(index);

        //Printing the target array
        System.out.println("\nTarget Array :");
        int target[] = createTarget();
        obj.print(target);
    }
}