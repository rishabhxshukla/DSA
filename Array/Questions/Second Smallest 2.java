// 2nd Smallest element of the array

package Array.Questions;
import java.io.*;

class SecondSmallest2
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


    /* Function to find the 2nd smallest element of the array */
    static int secondSmallest()
    {
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;

        //Finding the 2nd smallest element
        for (int i=0; i<size; i++)
        {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] > smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }

        return ssmallest;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SecondSmallest2 obj = new SecondSmallest2();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the 2nd smallest element
        System.out.println("\n2nd Smallest element : " + secondSmallest());
    }
}