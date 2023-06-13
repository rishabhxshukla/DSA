// Target sum problem
// HASHSET

package Array.Questions;
import java.io.*;
import java.util.*;

class TargetSum3
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
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> pair = new ArrayList<>();

        //Storing all elements in HashSet
        for (int i=0; i<size; i++)
        {
            hs.add(arr[i]);
        }

        //Checking difference from HashSet
        for (int i=0; i<size; i++)
        {
            int diff = target - arr[i];
            if (hs.contains(diff))
            {
                pair.add(arr[i]);
                pair.add(diff);
            }
        }

        //Printing the pairs
        for (int i=0; i<pair.size(); i=i+2)
        {
            int e1 = pair.get(i);
            int e2 = pair.get(i+1);
            System.out.print("(" + e1 + "," + e2 + ")" + " ");
        }

        //Deleting the HashSet & ArrayList
        hs.clear();
        pair.clear();
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        TargetSum3 obj = new TargetSum3();
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