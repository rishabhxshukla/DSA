// Find the intersection of 2 arrays
// 2 POINTERS

package Array.Questions;
import java.io.*;
import java.util.*;

class Intersection
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


    /* Function to find the intersection */
    void intersection()
    {
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //Traverse both the arrays
        while (i < size && j < size)
        {
            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                j++;
            }
            else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }

        System.out.println(ans);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Intersection obj = new Intersection();

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

        //Printing the Intersection
        System.out.print("\n\nIntersection : ");
        obj.intersection();
    }
}