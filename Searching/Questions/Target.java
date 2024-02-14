/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example :
Input: nums = [1,3,5,6], target = 5
Output: 2
*/

package Searching.Questions;

class Target
{
    /* Function to search for the target element */
    int search(int nums[], int target)
    {
        int lb = 0;
        int ub = nums.length - 1;

        while (lb <= ub)
        {
            //Mid index
            int mid = (lb + ub) / 2;

            //Move to the right half
            if (nums[mid] < target) {
                lb = mid + 1;
            }
            //Move to the left half
            else if (nums[mid] > target) {
                ub = mid - 1;
            }
            //Target found
            else {
                return mid;
            }
        }

        //If target not found, return the position where it should be inserted
        return lb;
    }

    public static void main(String[] args)
    {
        //Creating object of the class
        Target obj = new Target();

        //Array & Target element
        int nums[] = {1, 3, 5, 6};
        int target = 5;

        //Searching the target element
        int ans = obj.search(nums, target);

        //Printing the result
        System.out.println("Result : " + ans);
    }
}