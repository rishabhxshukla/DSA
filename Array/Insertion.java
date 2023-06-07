package Array;
import java.io.*;

class Insertion
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Function to insert an element at a particular index */
    static int[] insert(int key, int pos)
    {
        //Creating a new array
        int newarr[] = new int[size + 1];

        //Inserting elements before the key
        for (int i = 0; i < pos; i++)
        {
            newarr[i] = arr[i];
        }

        //Inserting the key
        newarr[pos] = key;

        //Inserting elements after the key
        for (int i = pos+1; i < newarr.length; i++)
        {
            newarr[i] = arr[i - 1];
        }

        return newarr;
    }


    public static void main(String[] args) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing original array
        System.out.println("*** Original Array ***");
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter the element that you want to insert : ");
        int key = Integer.parseInt(b.readLine());
        System.out.print("Enter the index where you want to insert : ");
        int pos = Integer.parseInt(b.readLine());

        //Inserting an element
        int ans[] = insert(key, pos);

        //Printing new array
        System.out.println("*** New Array ***");
        for (int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}