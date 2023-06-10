/*
Given an array consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/

package Questions;
import java.io.*;

class Shuffle
{
    //Can't give odd size in this ques
    static final int size = 6;
    static int arr[] = new int[size];


    /* Function to shuffle the array using 2 pointer */
    // 1 2 3 4 5 6   -->   1 4 2 5 3 6
    static int[] shuffle()
    {
        int i = 0, j = size/2, k = 0;
        int newarr[] = new int[size];

        while (i < size/2 && j < size)
        {
            newarr[k++] = arr[i];
            newarr[k++] = arr[j];

            i++;
            j++;
        }
        return newarr;
    }


    public static void main(String args[]) throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }

        //Printing the array
        System.out.println("*** Original Array ***");
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //Shuffling the array
        int ans[] = shuffle();

        //Printing the shuffled array
        System.out.println("\n*** New Array ***");
        for (int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}