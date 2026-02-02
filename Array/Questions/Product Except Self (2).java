// Find the product of all the elements except self in a given array
// PREFIX PRODUCT * SUFFIX PRODUCT

package Array.Questions;
import java.util.*;

class ProductExceptSelf2
{
    static int arr[] = {1, 2, 3, 4, 5};


    /* Function to find the product except self */
    static ArrayList<Integer> prodExceptSelf()
    {
        ArrayList<Integer> ans = new ArrayList<>();

        //Prefix product (product of all elements before i)
        int left = 1;
        for (int i = 0; i < arr.length; i++)
        {
            //Storing left product in ans array
            ans.add(left);
            left = left * arr[i];
        }

        //Suffix product (product of all elements after i)
        int right = 1;
        for (int i = arr.length - 1; i >= 0; i--)
        {
            //Multiplying stored left product with right product
            ans.set(i, (ans.get(i) * right));
            right = right * arr[i];
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