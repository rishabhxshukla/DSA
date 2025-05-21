// Find the distinct elements of the array which contains mixed values.
// HASHSET

package Array.Questions;
import java.io.*;
import java.util.HashSet;

class Distinct1
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


    /* Function to find the distinct elements of the array */
    void distinct()
    {
        HashSet<Integer> hs = new HashSet<>();

        //Storing all the values in HashSet
        for (int i=0; i<size; i++)
        {
            hs.add(arr[i]);
        }

        System.out.println(hs);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Distinct1 obj = new Distinct1();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the distinct elements
        System.out.println("\nDistinct elements : ");
        obj.distinct();
    }
}