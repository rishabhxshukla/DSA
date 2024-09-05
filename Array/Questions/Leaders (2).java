/*
An element is a leader if it is greater than all the elements to its right side.
And the rightmost element is always a leader.
*/
// MAX VARIABLE + ARRAY LIST

package Array.Questions;
import java.io.*;
import java.util.*;

class Leaders2
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


    /* Function to find the leaders in an array */
    void leaders()
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = 0;

        //Storing the last element
        max = arr[size - 1];
        ans.add(max);

        //Looping from 2nd last element
        for (int i = size-2; i >= 0; i--)
        {
            //If element in array > max element
            if (arr[i] > max)
            {
                max = arr[i];   //Updating max variable
                ans.add(max);   //Storing max in ans
            }
        }

        //Printing the leaders
        System.out.print("\nLeaders : ");
        System.out.println(ans);
    }


    public static void main(String[] args) throws IOException
    {
        //Creating object of the class
        Leaders2 obj = new Leaders2();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the leaders
        obj.leaders();
    }
}