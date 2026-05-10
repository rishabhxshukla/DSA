/*
Program to print all subsets of a given array that may contain duplicate elements

STEPS :
1) Include
2) Recurse
3) Backtrack
4) Skip duplicates
5) Exclude
*/
// O(N logN) + O(N * 2ᴺ)

package Recursion.Questions.Array;
import java.util.*;

class SubsetsII
{
    static int arr[] = {1, 2, 3, 2, 1};


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

        //Backtrack: remove last added element
        ans.removeLast();

        //Skip duplicate values
        int j = i + 1;
        while (j < arr.length && arr[j - 1] == arr[j])
        {
            j++;
        }

        //Choice 2: Exclude current element
        subsets(j, ans);
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Sort the array first so that duplicates become adjacent
        Arrays.sort(arr);

        //Start recursion from index 0
        System.out.println("Subsets : ");
        subsets(0, new ArrayList<>());
    }
}