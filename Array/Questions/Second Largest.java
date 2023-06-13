// 2nd Largest element of the array

package Array.Questions;
import java.io.*;

class SecondLargest
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


    /* Function to find the 2nd largest element of the array */
    static int secondLargest()
    {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        //Finding the largest element
        for (int i=0; i<size; i++)
        {
            if (arr[i] > max1)
                max1 = arr[i];
        }

        //Comparing all elements other than the largest one
        for (int i=0; i<size; i++)
        {
            if (arr[i] > max2 && arr[i] != max1)
                max2 = arr[i];
        }

        return max2;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SecondLargest obj = new SecondLargest();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the 2nd largest element
        System.out.println("\n2nd Largest element : " + secondLargest());
    }
}