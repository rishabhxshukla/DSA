/*
The next greater element of a value x in an array is the first element that appears to the right of x
and has a greater value.
You are given two distinct integer arrays, nums1 and nums2, where nums1 is a subset of nums2.
For each element nums1[i], locate its corresponding index j in nums2 such that
nums1[i] == nums2[j], and identify the next greater element to the right of nums2[j] in nums2.
If no such greater element exists, return -1 for that position.
Return an ans[] array where ans[i] contains the next greater element for nums1[i].

Example :
Input: nums1 = [4, 1, 2], nums2 = [1, 3, 4, 2]
Output: [-1, 3, -1]
Explanation:
The next greater element for each value of nums1 in nums2 is as follows :
-> 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
-> 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
-> 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
*/
// NESTED LOOPS

package Array.Questions;
import java.io.*;
import java.util.*;

class NextGreaterElement2
{
    static int nums1[] = {4, 1, 2};
    static int nums2[] = {1, 3, 4, 2};


    /* Function to find the next greater element of each element in nums1 */
    static ArrayList<Integer> nextGreaterElement()
    {
        ArrayList<Integer> ans = new ArrayList<>();

        //Loop through each element of nums1
        for (int i = 0; i < nums1.length; i++)
        {
            int nextGreater = -1;

            //Find nums1[i] in nums2
            for (int j = 0; j < nums2.length; j++)
            {
                if (nums1[i] == nums2[j])
                {
                    //Look to the right of j for its greater element
                    for (int k = j + 1; k < nums2.length; k++)
                    {
                        if (nums2[k] > nums1[i])
                        {
                            nextGreater = nums2[k];
                            break;
                        }
                    }
                    break;  //Stop searching nums2 once match is found
                }
            }

            ans.add(nextGreater);
        }

        return ans;
    }


    public static void main(String args[])
    {
        //Printing the nums arrays
        System.out.println("Nums1[] : " + Arrays.toString(nums1));
        System.out.println("Nums2[] : " + Arrays.toString(nums2));

        //Printing the next greater element array
        System.out.println("Next greater element array : " + nextGreaterElement());
    }
}