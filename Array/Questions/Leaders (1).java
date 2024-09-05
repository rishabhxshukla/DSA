/*
An element is a leader if it is greater than all the elements to its right side.
And the rightmost element is always a leader.
*/
// NESTED LOOPS

package Array.Questions;
import java.io.*;
import java.util.*;

class Leaders1
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

        for (int i=0; i<size; i++)
        {
            //Flag used to track if the current element is a leader or not
            boolean isLeader = true;

            //Check if current element > all the elements to its right
            for (int j=i+1; j<size; j++)
            {
                //Current element is not a leader if a larger element exists its right
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            //If current element > all the elements to its right, add it to ans
            if (isLeader == true) {
                ans.add(arr[i]);
            }
        }

        //Printing the leaders
        System.out.print("\nLeaders : ");
        System.out.println(ans);
    }


    public static void main(String[] args) throws IOException
    {
        //Creating object of the class
        Leaders1 obj = new Leaders1();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the leaders
        obj.leaders();
    }
}