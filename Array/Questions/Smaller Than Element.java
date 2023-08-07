/*
How Many Numbers Are Smaller Than the Current Number
Given the array arr, for each arr[i] find out how many numbers in the array are smaller than it.
Input: arr = [8,1,2,2,3]
Output: [4,0,1,1,3]
*/
//

package Array.Questions;
import java.io.*;

class SmallerThanElement
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


    /* Function to find out the smaller elements */
    void smallerThanElement()
    {
        int count = 0;
        int ans[] = new int[size];

        for (int i=0; i<size; i++)
        {
            //Extracting each element
            int e = arr[i];

            //Comparing it with every other element
            for(int j=0; j<size; j++)
            {
                if (arr[j] < e) {
                    count++;
                }
            }

            ans[i] = count;     //Storing the count
            count = 0;          //Reinitializing count to 0
        }

        //Printing the result
        for (int i=0; i<size; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        SmallerThanElement obj = new SmallerThanElement();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Printing the result
        System.out.println("\nCount of smaller elements :");
        obj.smallerThanElement();
    }
}