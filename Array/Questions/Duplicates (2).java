// Find all duplicate elements in a sorted array
// 2 POINTERS

package Array.Questions;
import java.io.*;

class Duplicates2
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


    /* Function to find the duplicate elements */
    void duplicates()
    {
        //Printing the duplicates
        for (int i=1; i<size; i++)
        {
            if (arr[i] == arr[i - 1]) {
                //Print only if it's the first occurrence of the duplicate
                if (i == 1 || arr[i] != arr[i - 2]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Duplicates2 obj = new Duplicates2();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the duplicates
        System.out.println("\nDuplicates : ");
        obj.duplicates();
    }
}