/*
Given an array where every element appears twice except for one element. Find that element.
Input: arr = [1, 2, 3, 2, 1]
Output: 3
*/
// TEMP ARRAY

package Array.Questions;
import java.io.*;

class SingleElement1
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


    /* Function to find the single element */
    static int singleElement()
    {
        int element = -1;
        int max = 0;

        //Finding the maximum element
        for (int i=0; i<size; i++)
        {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //Creating temp array of size max + 1
        int temp[] = new int[max + 1];

        //Storing frequency of each element
        for (int i=0; i<size; i++)
        {
            temp[arr[i]] += 1;
        }

        //Finding element with frequency of 1
        for (int i=0; i<temp.length; i++)
        {
            if (temp[i] == 1) {
                element = i;
            }
        }

        return element;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SingleElement1 obj = new SingleElement1();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the single element
        System.out.print("\nSingle element : " + singleElement());
    }
}