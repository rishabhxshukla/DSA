// Check if an element is present in the array not

package Array.Questions;
import java.io.*;

class ElementPresent
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


    /* Function to check the presence */
    static boolean isPresent(int key)
    {
        for (int i=0; i<size; i++)
        {
            if (arr[i] == key) {
                return true;
            }
        }

        return false;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ElementPresent obj = new ElementPresent();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the no. that you want to check : ");
        int key = Integer.parseInt(b.readLine());

        //Printing the result
        System.out.println("Is number present : " + isPresent(key));
    }
}