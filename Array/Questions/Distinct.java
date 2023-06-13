// Distinct elements of the array containing mixed values
// HASHMAP

package Array.Questions;
import java.io.*;
import java.util.HashMap;

class Distinct
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
    static HashMap<Integer, Integer> distinct()
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        //Storing all the values in a HashMap
        for (int i=0; i<size; i++)
        {
            if (hm.containsValue(arr[i]))
                continue;
            else
                hm.put(i, arr[i]);
        }

        return hm;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Distinct obj = new Distinct();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the distinct elements
        HashMap<Integer, Integer> ans = distinct();
        System.out.println("\nDistinct elements : " + ans.values());
    }
}