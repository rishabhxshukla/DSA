// In an array, all numbers occur twice (or more) except one number which occurs only once.

package Questions;
import java.io.*;

class Once
{
    static final int size = 5;
    static int arr[] = new int[size];


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
        Once obj = new Once();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing the array
        System.out.println("*** Created Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Printing the element
        obj.once();
    }
}