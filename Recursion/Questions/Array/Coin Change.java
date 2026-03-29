/*
You are given an integer array coins[] representing coins of different denominations and an integer
amount representing a total amount of money.
Return the fewest number of coins that you need to make up that amount.
If that amount of money cannot be made up by any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin.

Example 1 :
Input: coins = [1, 2, 5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1

Example 2 :
Input: coins = [2], amount = 3
Output: -1
*/
// O(coins)^amount

package Recursion.Questions.Array;
import java.util.*;

class CoinChange
{
    static int coins[] = {1, 2, 5};
    static int amount = 11;

    static int coinChange(int coins[], int amount)
    {
        int min = Integer.MAX_VALUE;

        //Exact amount reached -> no more coins needed
        if (amount == 0) {
            return 0;
        }

        //Amount exceeded -> invalid path
        if (amount < 0) {
            return -1;
        }

        for (int i = 0; i < coins.length; i++)
        {
            int count = coinChange(coins, amount - coins[i]);

            if (count != -1) {
                //+1 accounts for the current coin used
                min = Math.min(min, count + 1);
            }
        }

        //If no combination works, return -1
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }


    public static void main(String args[])
    {
        //Printing the input data
        System.out.println("Coins : " + Arrays.toString(coins) + ", Amount : " + amount);

        //Printing the result
        System.out.println("Count : " + coinChange(coins, amount));
    }
}