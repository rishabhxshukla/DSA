// Find maximum distance between two occurrences of same element in array

package Array.Questions;
import java.io.*;

class OccurrenceDistance
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


    /* Function to find the maximum distance */
    static int distance(int key)
    {
        int first = 0;
        int last = 0;

        //1st occurrence
        for (int i=0; i<size; i++)
        {
            if (arr[i] == key) {
                first = i;
                break;
            }
        }

        //2nd occurrence
        for (int i=first; i<size; i++)
        {
            if (arr[i] == key) {
                last = i;
            }
        }

        return (last - first);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        OccurrenceDistance obj = new OccurrenceDistance();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the key : ");
        int key = Integer.parseInt(b.readLine());

        //Printing the maximum distances between 2 occurrences
        System.out.println("Maximum distance b/w two " +key+ "'s : " + distance(key));
    }
}