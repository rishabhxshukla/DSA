// Given an unsorted array of integers, find the pair of elements with a difference of 1.
// SORTING + ARRAY LIST

package Array.Questions;
import java.io.*;
import java.util.*;

class Pair_With_Diff_Of_One
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


    /* Function to find the pairs */
    void pairs()
    {
        //Sorting the array
        Arrays.sort(arr);

        //Finding the pairs
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=0; i<size-1; i++)
        {
            //If next - current == 1
            if (arr[i + 1] - arr[i] == 1)
            {
                ans.add(arr[i]);
                ans.add(arr[i + 1]);
            }
        }

        //Printing the pairs
        Iterator<Integer> i = ans.iterator();
        int count = 0;

        while (i.hasNext())
        {
            System.out.print(i.next() + " ");
            count++;

            //Adding new line after each pair
            if (count % 2 == 0) {
                System.out.println();
            }
        }

        //Deleting the ArrayList
        ans.clear();
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Pair_With_Diff_Of_One obj = new Pair_With_Diff_Of_One();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the pairs
        System.out.println("\n*** Pairs With Difference Of 1 ***");
        obj.pairs();
    }
}