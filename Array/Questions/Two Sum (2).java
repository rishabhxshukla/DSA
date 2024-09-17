// Two sum problem
// HASHSET

package Array.Questions;
import java.io.*;
import java.util.*;

class TwoSum2
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
        Set<List<Integer>> pairs = new HashSet<>();

        for (int i=0; i<size; i++)
        {
            //Taking current element and calculating the difference
            int diff = target - arr[i];

            //Check if the difference is already present in HashSet
            //If yes then pair found, add it to the List
            if (hs.contains(diff))
            {
                //Adding pairs as a group
                pairs.add(Arrays.asList(arr[i], diff));
            }
            //Otherwise, add the current element to the HashSet
            else {
                hs.add(arr[i]);
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
        TwoSum2 obj = new TwoSum2();
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