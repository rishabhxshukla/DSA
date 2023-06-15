// Convert a given Array to ArrayList

package Array;
import java.io.*;
import java.util.ArrayList;

class Array_to_ArrayList
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


    /* Function to convert Array to ArrayList */
    void convert()
    {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i : arr)
        {
            al.add(i);
        }

        System.out.println(al);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Array_to_ArrayList obj = new Array_to_ArrayList();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the ArrayList
        System.out.println("\n*** Created Array List ***");
        obj.convert();
    }
}