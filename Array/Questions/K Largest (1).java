// Find first K largest elements of an array
// SORTING

package Array.Questions;
import java.io.*;
import java.util.*;

class KLargest1
{
    static final int size = 5;
    static Integer arr[] = new Integer[size];


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
    void print(Integer a[])
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* Function to find K largest elements */
    static Integer[] kLargest(int k)
    {
        //Sorting the array
        Arrays.sort(arr, Collections.reverseOrder());

        //Storing K largest elements in temp[]
        Integer temp[] = new Integer[k];
        int i = 0;
        while (k > 0)
        {
            temp[i] = arr[i];
            i++;
            k--;
        }

        return temp;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        KLargest1 obj = new KLargest1();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the value of k : ");
        int k = Integer.parseInt(b.readLine());

        //Finding the K largest elements
        Integer ans[] = kLargest(k);

        //Printing the K largest elements
        System.out.println("*** K Largest Elements ***");
        obj.print(ans);
    }
}