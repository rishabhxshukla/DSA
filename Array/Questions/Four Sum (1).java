// Four sum problem
// NESTED LOOPS

package Array.Questions;
import java.io.*;
import java.util.*;

class FourSum1
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


    /* Function to find the quadruplets whose sum is equal to target */
    void pairs(int target)
    {
        //Set to store the quadruplets
        Set<List<Integer>> quadruplets = new HashSet<>();

        for (int i = 0; i < size; i++)
        {
            for (int j = i+1; j < size; j++)
            {
                for (int k = j+1; k < size; k++)
                {
                    for (int l = k+1; l < size; l++)
                    {
                        //Calculating the sum
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
                        
                        if (sum == target)
                        {
                            //Adding quadruplets as a group (sorting to avoid duplicates)
                            List<Integer> quadruplet = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            Collections.sort(quadruplet);
                            quadruplets.add(quadruplet);
                        }
                    }
                }
            }
        }

        //Printing the quadruplets
        for (List<Integer> group : quadruplets)
        {
            System.out.println(group);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        FourSum1 obj = new FourSum1();
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

        //Printing the quadruplets
        System.out.println("*** Quadruplets ***");
        obj.pairs(target);
    }
}
