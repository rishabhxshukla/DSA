// Find all duplicate elements in an array
// 2 HASHSETS

package Array.Questions;
import java.io.*;
import java.util.*;

class Duplicates
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to find the duplicates */
    void duplicates()
    {
        /*
         If you use anything other than HashSet for storing the duplicates, make sure to check this condition :-
         If element is not present in answer array : !al.contains(arr[i])
         Not writing this will add the element again to the answer array
        */

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int i=0; i<size; i++)
        {
            //If HashSet already contains the element, add it to the answer
            if (hs.contains(arr[i])) {
                ans.add(arr[i]);
            }

            //Otherwise add this element to the HashSet
            hs.add(arr[i]);
        }

        //Printing the duplicates
        System.out.println(ans);

        //Deleting both the HashSets
        hs.clear();
        ans.clear();
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Duplicates obj = new Duplicates();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing the array
        System.out.println("*** Created Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Printing the duplicates
        System.out.println("\nDuplicates : ");
        obj.duplicates();
    }
}