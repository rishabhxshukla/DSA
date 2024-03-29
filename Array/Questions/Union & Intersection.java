// Find union and intersection of 2 arrays
// HASHSET

package Array.Questions;
import java.io.*;
import java.util.*;

class UnionIntersection
{
    static final int size = 5;
    static int arr1[] = new int[size];
    static int arr2[] = new int[size];


    /* Creating the array */
    void create(int a[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            a[i] = Integer.parseInt(b.readLine());
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

        //Creating the arrays
        System.out.println("*** ARRAY 1 ***");
        obj.create(arr1);
        System.out.println("*** ARRAY 2 ***");
        obj.create(arr2);

        //Printing the arrays
        System.out.println("\n*** Created Array 1 ***");
        obj.print(arr1);
        System.out.println("\n*** Created Array 2 ***");
        obj.print(arr2);

        //Printing the Union & Intersection
        System.out.print("\n\nUnion : ");
        obj.union();
        System.out.print("Intersection : ");
        obj.intersection();
    }
}