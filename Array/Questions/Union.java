// Find the union of 2 arrays
// 2 POINTERS

package Array.Questions;
import java.io.*;
import java.util.*;

class Union
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
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //Traverse both the arrays
        while (i < size && j < size)
        {
            if (arr1[i] <= arr2[j]) {
                if (!ans.contains(arr1[i])) {
                    ans.add(arr1[i]);
                }
                i++;
            }
            else {
                if (!ans.contains(arr2[j])) {
                    ans.add(arr2[j]);
                }
                j++;
            }
        }

        //Add remaining elements from arr1
        while (i < size)
        {
            if (!ans.contains(arr1[i])) {
                ans.add(arr1[i]);
            }
            i++;
        }

        //Add remaining elements from arr2
        while (j < size)
        {
            if (!ans.contains(arr2[j])) {
                ans.add(arr2[j]);
            }
            j++;
        }

        System.out.println(ans);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Union obj = new Union();

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

        //Printing the Union
        System.out.print("\n\nUnion : ");
        obj.union();
    }
}