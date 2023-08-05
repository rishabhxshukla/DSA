/*
Shuffle the Array
Given an array consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/
// 2 POINTERS + TEMP ARRAY

package Array.Questions;
import java.io.*;

class Shuffle
{
    //Can't give odd size in this ques
    static final int size = 6;
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


    /* Function to shuffle the array using 2 pointer */
    // 1 2 3 4 5 6   -->   1 4 2 5 3 6
    static int[] shuffle()
    {
        int i = 0, j = size/2, k = 0;
        int ans[] = new int[size];

        while (i < size/2 && j < size)
        {
            ans[k++] = arr[i++];
            ans[k++] = arr[j++];
        }

        return ans;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Shuffle obj = new Shuffle();

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Original Array ***");
        obj.print(arr);

        //Shuffling the array
        int ans[] = shuffle();

        //Printing the shuffled array
        System.out.println("\n*** New Array ***");
        obj.print(ans);
    }
}