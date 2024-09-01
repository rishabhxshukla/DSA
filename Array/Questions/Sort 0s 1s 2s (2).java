// Given an unordered array which contains 0s, 1s, 2s only. Sort this array.
// 3 POINTERS
/*
We divide the array into 3 parts :
  [0,...,low-1] = 0
  [low,...,mid-1] = 1
  [mid,...,high] = unsorted
  [high+1,...,size-1] = 2

At the beginning, we assume that the entire array in unsorted.
We start by keeping mid at 0th index and high at size-1 index.
We keep on increasing the left sub-array (which contains 0 and 1) and decrease the right
sub-array (which contains 2).
When the mid pointer crosses the high pointer, we exit the loop and the entire array is sorted.
*/

package Array.Questions;
import java.io.*;

class Sort012_2
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


    /* Function to sort the array */
    void sort()
    {
        int low = 0, mid = 0, high = size-1;

        while (mid <= high)
        {
            //Swap low and mid
            if (arr[mid] == 0) {
                swap(low, mid);
                low++;
                mid++;
            }
            //No swap
            else if (arr[mid] == 1) {
                mid++;
            }
            //Swap mid and high
            else if (arr[mid] == 2) {
                swap(mid, high);
                high--;
            }
        }
    }


    /* Helper function to swap 2 elements */
    void swap(int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Sort012_2 obj = new Sort012_2();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Sorting
        obj.sort();

        //Printing the sorted array
        System.out.println("\n*** New Array ***");
        obj.print(arr);
    }
}