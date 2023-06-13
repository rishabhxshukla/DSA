// In an array, all numbers occur twice (or more) except one number which occurs only once.
// NESTED LOOPS

package Array.Questions;
import java.io.*;

class Once
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


    /* Function to find the element that occurs only once */
    void once()
    {
        int count;

        //Check for an element with every other element
        for (int i=0; i<size; i++)
        {
            //Reinitialize count to 0
            count = 0;

            for (int j=0; j<size; j++)
            {
                if (arr[i] == arr[j])
                    count++;
            }

            if (count == 1)
                System.out.print("\nElement that occurs once is : " + arr[i]);
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Once obj = new Once();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the element
        obj.once();
    }
}