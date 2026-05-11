/*
Program to print the sum of all the subsets of a given array

STEPS :
1) Include
2) Recurse
3) Backtrack
4) Exclude
*/
// O(N * 2ᴺ)

package Recursion.Questions.Array;
import java.util.*;

class SubsetSum
{
    static int arr[] = {1, 2, 3};


    static void subsets(int i, int sum)
    {
        //Base case
        if (i == arr.length) {
            System.out.print(sum + " ");
            return;
        }

        //Choice 1: Include current element
        sum = sum + arr[i];
        subsets(i + 1, sum);

        //Backtrack: Remove last added element
        sum = sum - arr[i];

        //Choice 2: Exclude current element
        subsets(i + 1, sum);
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Start recursion from index 0
        System.out.print("Subsets Sum : ");
        subsets(0, 0);
    }
}