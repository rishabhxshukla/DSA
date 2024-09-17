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
        //Set to store the pairs
        Set<List<Integer>> pairs = new HashSet<>();

        for (int i = 0; i < size-1; i++)
        {
            for (int j = i+1; j < size; j++)
            {
                if (arr[i] + arr[j] == target)
                {
                    //Adding pairs as a group
                    pairs.add(Arrays.asList(arr[i], arr[j]));
                }
            }
        }

        //Printing the pairs
        for (List<Integer> group : pairs)
        {
            System.out.println(group);
        }
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