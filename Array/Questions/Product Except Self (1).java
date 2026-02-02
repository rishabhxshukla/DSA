// Find the product of all the elements except self in a given array
// NESTED LOOPS

package Array.Questions;
import java.util.*;

class ProductExceptSelf1
{
    static int arr[] = {1, 2, 3, 4, 5};


    /* Function to find the product except self */
    static ArrayList<Integer> prodExceptSelf()
    {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
        {
            //Reinitializing prod to 1 for every loop
            int prod = 1;

            for (int j = 0; j < arr.length; j++)
            {
                //If i and j are equal, don't do calculation
                if (i == j) {
                    continue;
                }

                prod = prod * arr[j];
            }

            ans.add(prod);
        }

        return ans;
    }


    public static void main(String args[])
    {
        //Printing the array
        System.out.println("Array : " + Arrays.toString(arr));

        //Printing the result
        System.out.println("Result : " + prodExceptSelf());
    }
}