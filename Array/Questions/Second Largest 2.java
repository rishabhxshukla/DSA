// 2nd Largest element of the array

package Array.Questions;
import java.io.*;

class SecondLargest2
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
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        //Finding the 2nd largest element
        for (int i=0; i<size; i++)
        {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }

        return slargest;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SecondLargest2 obj = new SecondLargest2();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the 2nd largest element
        System.out.println("\n2nd Largest element : " + secondLargest());
    }
}