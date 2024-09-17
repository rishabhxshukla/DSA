// Three sum problem
// HASHSET

package Array.Questions;
import java.io.*;
import java.util.*;

class ThreeSum2
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
        Set<List<Integer>> triplets = new HashSet<>();

        //Iterate over the array to pick the first element
        for (int i = 0; i < size; i++)
        {
            HashSet<Integer> hs = new HashSet<>();

            //Iterate over the array to pick the second element
            for (int j = i+1; j < size; j++)
            {
                //Taking 2 elements and calculating the difference
                int diff = target - (arr[i] + arr[j]);

                //Check if the difference is already present in HashSet
                //If yes then triplet found, add it to the List
                if (hs.contains(diff))
                {
                    //Adding triplets as a group
                    triplets.add(Arrays.asList(arr[i], arr[j], diff));
                }
                //Otherwise, add the current element to the HashSet
                else {
                    hs.add(arr[j]);
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
        ThreeSum2 obj = new ThreeSum2();
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