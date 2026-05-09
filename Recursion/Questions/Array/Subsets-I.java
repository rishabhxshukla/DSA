/*
Program to print all subsets of a given array containing unique elements

STEPS :
1) Include
2) Recurse
3) Backtrack
4) Exclude
*/
// O(N * 2ᴺ)

package Recursion.Questions.Array;
import java.util.*;

class SubsetsI
{
    static int arr[] = {1, 2, 3, 4, 5};


    static void subsets(int i, ArrayList<Integer> ans)
    {
        //Base case
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        //Choice 1: Include current element
        ans.add(arr[i]);
        subsets(i + 1, ans);

        //Backtrack: Remove last added element
        ans.removeLast();

        //Choice 2: Exclude current element
        subsets(i + 1, ans);
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Start recursion from index 0
        System.out.println("Subsets : ");
        subsets(0, new ArrayList<>());
    }
}