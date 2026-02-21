/*
Fruit Into Baskets -> Max Subarray With At Most 2 Types Of Numbers
You are visiting a farm that has a single row of fruit trees arranged from left to right.
The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow :
    1) You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
    2) Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right.
       The picked fruits must fit in one of your baskets.
    3) Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.

Example 1 :
Input: fruits = [1, 2, 1]
Output: 3
Explanation: We can pick from all 3 trees.

Example 2 :
Input: fruits = [1, 2, 3, 2, 2]
Output: 4
Explanation: We can pick from trees [2, 3, 2, 2].
If we had started at the first tree, we would only pick from trees [1, 2].
*/
// SLIDING WINDOW -> O(N)

package Array.Questions;
import java.io.*;
import java.util.*;

class FruitIntoBaskets2
{
    static int arr[] = {1, 2, 3, 2, 2};


    /* Function to find the max number of fruits that can be picked */
    static int maxFruits()
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0, max = 0;

        for (int j = 0; j < arr.length; j++)
        {
            //Expand window
            hm.put(arr[j], hm.getOrDefault(arr[j], 0) + 1);

            //Shrink window
            if (hm.size() > 2)
            {
                //Remove fruits from the left until the window has only 2 fruit types
                while (hm.size() > 2)
                {
                    //Decrease freq
                    hm.put(arr[i], hm.get(arr[i]) - 1);

                    //If freq is 0, remove fruit
                    if (hm.get(arr[i]) == 0) {
                        hm.remove(arr[i]);
                    }

                    i++;
                }
            }

            //Update max
            max = Math.max(max, j - i + 1);
        }

        return max;
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("Max fruits : " + maxFruits());
    }
}