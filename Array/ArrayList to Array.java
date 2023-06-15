// Convert a given ArrayList to Array

package Array;
import java.io.*;
import java.util.ArrayList;

class ArrayList_to_Array
{
    static final int size = 5;
    static ArrayList<Integer> al = new ArrayList<>();


    /* Creating the ArrayList */
    void create() throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            int e = Integer.parseInt(b.readLine());
            al.add(e);
        }
    }


    /* Function to convert ArrayList to Array */
    void convert()
    {
        Object arr[] = al.toArray();

        for (int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ArrayList_to_Array obj = new ArrayList_to_Array();

        //Creating the array
        obj.create();

        //Printing the ArrayList
        System.out.println("*** Created Array List ***");
        System.out.println(al);

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.convert();
    }
}