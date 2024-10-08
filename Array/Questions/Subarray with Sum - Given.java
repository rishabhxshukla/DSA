// Given an array, find the single subarray with the "given" sum.
// 2 POINTERS

package Array.Questions;
import java.io.*;

class Subarray_with_Sum_Given
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


    /* Function to find the subarray with given sum */
    void subarray(int target)
    {
        int i = 0, j = 0;
        int sum = arr[0];

        while (j < size)
        {
            if (sum == target) {
                System.out.println("Sum is present b/w index " +i+ " and " +j);
                return;
            }
            else if (sum < target) {
                j++;
                if (j < size) {
                    sum = sum + arr[j];
                }
            }
            else {
                sum = sum - arr[i];
                i++;
            }
        }
        
        System.out.println("No subarray found!");
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Subarray_with_Sum_Given obj = new Subarray_with_Sum_Given();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the sum : ");
        int target = Integer.parseInt(b.readLine());

        //Printing the subarray indices
        obj.subarray(target);
    }
}