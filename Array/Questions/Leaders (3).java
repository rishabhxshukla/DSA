/*
An element is a leader if it is greater than all the elements to its right side.
And the rightmost element is always a leader.
*/
// STACK

package Array.Questions;
import java.io.*;
import java.util.*;

class Leaders3
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
        //Storing the leaders in a stack
        Stack<Integer> s = new Stack<>();

        //Pushing the last element
        s.push(arr[size-1]);

        //Looping from 2nd last element
        for (int i = size-2; i >= 0; i--)
        {
            //If element in array > max element from right
            if (arr[i] > s.peek())
            {
                s.push(arr[i]);
            }
        }

        //Printing the stack
        System.out.print("\nLeaders : ");
        while (!s.isEmpty())
        {
            System.out.print(s.pop() + " ");
        }
    }


    public static void main(String[] args) throws IOException
    {
        //Creating object of the class
        Leaders3 obj = new Leaders3();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the leaders
        obj.leaders();
    }
}