// Move even numbers to the beginning and odd numbers to the end of array
// QUEUE

package Array.Questions;
import java.io.*;
import java.util.*;

class EvenOdd4
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


    /* Function to move the even numbers to the beginning */
    void move()
    {
        Queue<Integer> q = new LinkedList<>();

        //Storing Even numbers
        for (int i=0; i<size; i++)
        {
            if (arr[i] % 2 == 0) {
                q.add(arr[i]);
            }
        }

        //Storing Odd numbers
        for (int i=0; i<size; i++)
        {
            if (arr[i] % 2 != 0) {
                q.add(arr[i]);
            }
        }

        //Moving back the elements to the array
        int i = 0;
        while (!q.isEmpty())
        {
            arr[i++] = q.remove();
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        EvenOdd4 obj = new EvenOdd4();

        //Creating the array
        obj.create();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Moving the numbers
        obj.move();

        //Printing new array
        System.out.println("\n*** New Array ***");
        obj.print(arr);
    }
}