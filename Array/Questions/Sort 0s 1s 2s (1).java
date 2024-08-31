// Given an unordered array which contains 0s, 1s, 2s only. Sort this array.
// COUNT

package Array.Questions;
import java.io.*;

class Sort012_1
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


    /* Function to sort the array */
    void sort()
    {
        int zero = 0, one = 0, two = 0;

        //Counting the no. of 0s 1s 2s
        for (int i=0; i<size; i++)
        {
            if (arr[i] == 0)
                zero++;
            else if (arr[i] == 1)
                one++;
            else if (arr[i] == 2)
                two++;
        }

        //Rearranging the array
        int i = 0;
        while (zero > 0)
        {
            arr[i++] = 0;
            zero--;
        }
        while (one > 0)
        {
            arr[i++] = 1;
            one--;
        }
        while (two > 0)
        {
            arr[i++] = 2;
            two--;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Sort012_1 obj = new Sort012_1();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Sorting
        obj.sort();

        //Printing the sorted array
        System.out.println("\n*** New Array ***");
        obj.print(arr);
    }
}