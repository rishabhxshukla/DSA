// Move all zeroes to the beginning of the array
// 2 POINTERS

package Array.Questions;
import java.io.*;

class Zeroes_to_Beginning2
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


    /* Function to move all the zeroes */
    void moveZeroes()
    {
        int i = 0, j = 0;

        while (i < size && j < size)
        {
            //Increment j and always place it at 0 element
            if (arr[j] != 0) {
                j++;
            }

            //Increment i and j if both are at 0 element
            else if (arr[i] == 0 && arr[j] == 0) {
                i++;
                j++;
            }

            //Swap non-zero (i) and zero (j)
            else if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
    }


    public static void main(String[] args) throws IOException
    {
        //Creating object of the class
        Zeroes_to_Beginning2 obj = new Zeroes_to_Beginning2();

        //Creating the array
        obj.create();

        //Printing original array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Moving the zeroes
        obj.moveZeroes();

        //Printing new array
        System.out.println("\n*** New Array ***");
        obj.print(arr);
    }
}