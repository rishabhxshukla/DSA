/*
Check if Binary String Has at Most One Segment of Ones
Given a binary string str without leading zeros.
Return true if str contains at most one contiguous segment of ones. Otherwise, return false.

Example 1 :
Input: s = "1001"
Output: false
Explanation: The ones do not form a contiguous segment.

Example 2 :
Input: s = "110"
Output: true
*/

package String.Questions;
import java.io.*;

class SegmentOfOnes
{
    /* Function to check for the segment */
    static boolean onesSegment(String str)
    {
        for (int i = 0; i < str.length() - 1; i++)
        {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i + 1);

            /* If we encounter "01", it means :
               A segment of '1's ended earlier and a new segment just started
               which implies there are multiple segments of '1's */
            if (ch1 == '0' && ch2 == '1') {
                return false;
            }
        }

        return true;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Printing the result
        System.out.println("Segment of Ones : " + onesSegment(str));
    }
}