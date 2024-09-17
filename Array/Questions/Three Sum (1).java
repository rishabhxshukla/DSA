// Three sum problem
// NESTED LOOPS

package Array.Questions;
import java.io.*;
import java.util.*;

class ThreeSum1
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


    /* Function to find the triplets whose sum is equal to target */
    void pairs(int target)
    {
        //List to store the triplets
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < size-2; i++)
        {
            for (int j = i+1; j < size-1; j++)
            {
                for (int k = j+1; k < size; k++)
                {
                    if (arr[i] + arr[j] + arr[k] == target)
                    {
                        //Adding triplets as a group
                        triplets.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    }
                }
            }
        }

        //Printing the triplets
        for (List<Integer> group : triplets)
        {
            System.out.println(group);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ThreeSum1 obj = new ThreeSum1();
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

        //Printing the triplets
        System.out.println("*** Triplets ***");
        obj.pairs(target);
    }
}