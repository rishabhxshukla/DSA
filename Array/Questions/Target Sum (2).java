/*
Target sum problem.
For using the two-pointer technique, the array must be sorted.
If the sum is lesser than the target, increase the left pointer.
If the sum is greater than the target, decrease the right pointer.
*/
// 2 POINTERS

package Array.Questions;
import java.io.*;
import java.util.*;

class TargetSum2
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
        //Sort the array
        Arrays.sort(arr);

        //ArrayList to store the pairs
        ArrayList<Integer> pair = new ArrayList<>();
        int i = 0, j = size-1;

        while (i < j)
        {
            int sum = arr[i] + arr[j];
            if (sum == target)
            {
                pair.add(arr[i]);
                pair.add(arr[j]);
            }
            if (sum < target)
                i++;
            else
                j--;
        }

        //Printing the pairs
        for (int k=0; k<pair.size(); k=k+2)
        {
            int e1 = pair.get(k);
            int e2 = pair.get(k+1);
            System.out.print("(" + e1 + "," + e2 + ")" + " ");
        }

        //Deleting the ArrayList
        pair.clear();
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        TargetSum2 obj = new TargetSum2();
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