// Find index of a given element in the array

package Array.Questions;
import java.io.*;

class Index
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


    /* Function to find the index */
    static int index(int key)
    {
        for (int i=0; i<size; i++)
        {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Index obj = new Index();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the key to find its index : ");
        int key = Integer.parseInt(b.readLine());

        //Printing the index
        System.out.println("Index : " + index(key));
    }
}