/*
Dutch national flag consists of three colors: red, white, and blue.
We are given an array with these colours arranged randomly.
Our task is to put the same colours together and in the correct order.
*/
// 3 POINTERS
/*
We divide the array into 3 parts :
  [0,...,low-1] = red
  [low,...,mid-1] = white
  [mid,...,high] = unsorted
  [high+1,...,size-1] = blue

At the beginning, we assume that the entire array in unsorted.
We start by keeping mid at 0th index and high at size-1 index.
We keep on increasing the left sub-array (which contains red and white) and decrease the right
sub-array (which contains blue).
When the mid pointer crosses the high pointer, we exit the loop and the entire array is sorted.
*/

package Array.Questions;
import java.io.*;

class DutchNationalFlag2
{
    static String arr[] = {"white", "red", "white", "blue" ,"red", "blue"};
    static int size = arr.length;


    /* Printing the array */
    void print(String a[])
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* Helper function to swap 2 elements of an array */
    void swap(int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    /* Function to make the Dutch flag */
    void makeFlag()
    {
        int low = 0, mid = 0, high = size-1;

        while (mid <= high)
        {
            //Swap low and mid
            if (arr[mid].equals("red")) {
                swap(low, mid);
                low++;
                mid++;
            }
            //No swap
            else if (arr[mid].equals("white")) {
                mid++;
            }
            //Swap mid and high
            else {
                swap(mid, high);
                high--;
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        DutchNationalFlag2 obj = new DutchNationalFlag2();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Making the flag
        obj.makeFlag();

        //Printing the flag
        System.out.println("\n\n*** Dutch National Flag ***");
        obj.print(arr);
    }
}
