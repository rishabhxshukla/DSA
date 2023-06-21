// Given two sorted arrays, the task is to merge them in a sorted manner.
// 2 POINTERS

package Array.Questions;
import java.io.*;

class Merge_2_Sorted_Arrays1
{
    static int arr1[] = new int[3];
    static int arr2[] = new int[5];


    /* Creating the array */
    void create(int a[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<a.length; i++)
        {
            System.out.print("Enter the element : ");
            a[i] = Integer.parseInt(b.readLine());
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


    /* Function to merge 2 arrays */
    static int[] merge()
    {
        int n = arr1.length + arr2.length;
        int ans[] = new int[n];
        int i = 0, j = 0, k = 0;


        //Pointers starting from index 0 of both arrays
        while (i < arr1.length && j < arr2.length)
        {
            //Storing smaller element in answer array
            if (arr1[i] < arr2[j])
            {
                ans[k++] = arr1[i++];
            }
            else
            {
                ans[k++] = arr2[j++];
            }
        }

        //Now either ptr1 or ptr2 will be at the last index of its array
        //Store the remaining elements of 1st array if 2nd array is finished
        while (i < arr1.length)
        {
            ans[k++] = arr1[i++];
        }

        //Store the remaining elements of 2nd array if 1st array is finished
        while (j < arr2.length)
        {
            ans[k++] = arr2[j++];
        }

        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Merge_2_Sorted_Arrays1 obj = new Merge_2_Sorted_Arrays1();

        //Creating the arrays
        System.out.println("Creating Sorted Array 1 -> ");
        obj.create(arr1);
        System.out.println("Creating Sorted Array 2 -> ");
        obj.create(arr2);

        //Printing the arrays
        System.out.println("\n*** Array 1 ***");
        obj.print(arr1);
        System.out.println("\n*** Array 2 ***");
        obj.print(arr2);

        //Merging the arrays
        int ans[] = merge();

        //Printing the merged array
        System.out.println("\n*** Merged Array ***");
        obj.print(ans);
    }
}