/*
Create a target array in the given order
Given two arrays arr and index.
Your task is to create target array under the following rules :
1) Initially target array is empty.
2) Read arr[i] and index[i], insert at index index[i] the value arr[i] in target array.

Input: arr = [0, 1, 2, 3, 4], index = [0, 1, 2, 2, 1]
Output: [0, 4, 1, 3, 2]

Explanation:
[0, 0, 0, 0, 0]
[0, 1, 0, 0, 0]
[0, 1, 2, 0, 0]
[0, 1, 3, 2, 0]
[0, 4, 1, 3, 2]
*/

package Array.Questions;
import java.io.*;

class ElementAtIndex
{
    static final int size = 5;
    static int arr[] = {0, 1, 2, 3, 4};
    static int index[] = {0, 1, 2, 2, 1};
    static int target[] = new int [arr.length];


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
    static void shift(int start, int end)
    {
        for (int i = end; i >= start; i--)
        {
            target[i] = target[i - 1];
        }
    }


    /* Function to create the target array */
    static int[] createTarget()
    {
        for (int i = 0; i < size; i++)
        {
            //Extracting the index and element
            int idx = index[i];
            int element = arr[i];

            //Shifting elements to the right if an element
            //is already inserted at the given index
            if (target[idx] != 0) {
                shift(idx, size - 1);
            }

            //Inserting the element
            target[idx] = element;
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