// Two sum problem
// NESTED LOOPS

package Array.Questions;
import java.io.*;
import java.util.*;

class TwoSum1
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


    /* Function to find the pairs whose sum is equal to target */
    void pairs(int target)
    {
        //ArrayList to store the pairs
        ArrayList<Integer> pair = new ArrayList<>();

        for (int i=0; i<size-1; i++)
        {
            for (int j=i+1; j<size; j++)
            {
                if (arr[i] + arr[j] == target)
                {
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                }
            }
        }

        //Printing the pairs
        for (int i=0; i<pair.size(); i=i+2)
        {
            int e1 = pair.get(i);
            int e2 = pair.get(i+1);
            System.out.print("(" + e1 + "," + e2 + ")" + " ");
        }

        //Deleting the ArrayList
        pair.clear();
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        TwoSum1 obj = new TwoSum1();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the target : ");
        int target = Integer.parseInt(b.readLine());

        //Printing the pairs
        System.out.println("*** Pairs ***");
        obj.pairs(target);
    }
}