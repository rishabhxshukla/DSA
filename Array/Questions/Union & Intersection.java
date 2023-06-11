// Find union and intersection of 2 arrays

package Array.Questions;
import java.io.*;
import java.util.*;

class UnionIntersection
{
    static final int size = 5;
    static int arr1[] = new int[size];
    static int arr2[] = new int[size];


    /* Function to find the union */
    void union()
    {
        //Using HashSet as it only stores unique values
        HashSet<Integer> hs = new HashSet<>();

        //Adding elements of both the arrays to HashSet
        for (int i=0; i<size; i++)
        {
            hs.add(arr1[i]);
            hs.add(arr2[i]);
        }

        System.out.println(hs);
    }


    /* Function to find the intersection */
    void intersection()
    {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        //Adding elements of array 1 & array 2 to two HashSets
        for (int i=0; i<size; i++)
        {
            hs1.add(arr1[i]);
            hs2.add(arr2[i]);
        }

        //Taking out common elements of both HashSets
        for (int i=0; i<size; i++)
        {
            int e = arr1[i];
            if (hs1.contains(e) && hs2.contains(e))
                ans.add(e);
        }

        System.out.println(ans);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        UnionIntersection obj = new UnionIntersection();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the arrays
        System.out.println("*** ARRAY 1 ***");
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr1[i] = Integer.parseInt(b.readLine());
        }
        System.out.println("*** ARRAY 2 ***");
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr2[i] = Integer.parseInt(b.readLine());
        }

        //Printing the arrays
        System.out.println("\n*** Created Array 1 ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n*** Created Array 2 ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr2[i] + " ");
        }

        //Printing the Union & Intersection
        System.out.print("\n\nUnion : ");
        obj.union();
        System.out.print("Intersection : ");
        obj.intersection();
    }
}