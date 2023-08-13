/*
Maximum Sum With Exactly K Elements
You are given an array arr and an integer k.
Your task is to perform the following operation exactly k times in order to maximize your score :
1) Select an element 'e' from the array.
2) Remove the selected element from the array.
3) Add a new element with a value of e + 1 to the array.
4) Increase your score by e.
Return the maximum score you can achieve after performing the operation exactly k times.

Input: arr = [1,2,3,4,5], k = 3
Output: 18
Explanation: We need to choose exactly 3 elements from arr to maximize the sum.
For the first iteration, we choose 5. Then sum is 5 and arr = [1,2,3,4,6]
For the second iteration, we choose 6. Then sum is 5 + 6 and arr = [1,2,3,4,7]
For the third iteration, we choose 7. Then sum is 5 + 6 + 7 = 18 and arr = [1,2,3,4,8]
So, we will return 18 which is the maximum sum that we can achieve.
*/

package Array.Questions;
import java.io.*;
import java.util.*;

class MaxSumWithK
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


    /* Function to find the maximum sum */
    static int maxSum(int k)
    {
        //Sorting the array
        Arrays.sort(arr);

        int len = arr.length;
        int sum = 0;

        while (k-- > 0)
        {
            //Selecting last element
            int e = arr[len - 1];

            //Adding it to sum
            sum = sum + e;

            //Adding last + 1 in array
            arr[len - 1] = e + 1;
        }

        return sum;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        MaxSumWithK obj = new MaxSumWithK();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the value of k : ");
        int k = Integer.parseInt(b.readLine());

        //Printing the maximum sum
        System.out.println("Maximum sum : " + maxSum(k));
    }
}