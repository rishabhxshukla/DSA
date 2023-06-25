// Find all the pairs in an array whose sum is a perfect cube.
// NESTED LOOPS

package Array.Questions;
import java.io.*;

class PerfectCubePairs
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


    /* Function to find the pairs */
    void pairs()
    {
        for (int i=0; i<size; i++)
        {
            for (int j=i+1; j<size; j++)
            {
                int sum = arr[i] + arr[j];                   //Sum of 2 elements
                double cubeRoot = Math.cbrt(sum);            //Cube root of sum
                double floorValue = Math.floor(cubeRoot);    //Removing the decimals

                //If cube root does not contain decimal digits
                if (cubeRoot == floorValue)
                {
                    System.out.println("("+ arr[i] +", "+ arr[j] +")");
                }
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        PerfectCubePairs obj = new PerfectCubePairs();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the pairs
        System.out.println("\n*** Perfect Cube Pairs ***");
        obj.pairs();
    }
}