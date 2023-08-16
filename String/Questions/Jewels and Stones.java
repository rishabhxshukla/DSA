/*
Jewels and Stones
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case-sensitive, so 'a' is considered a different type of stone from 'A'.

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
*/

package String.Questions;
import java.io.*;

class Jewels_and_Stones
{
    /* Function to find the stones that are also jewels */
    static int jewelsInStones(String jewels, String stones)
    {
        int count = 0;

        //Traversing the stones string
        for (int i=0; i<stones.length(); i++)
        {
            //Extracting each character
            char ch = stones.charAt(i);
            String c = Character.toString(ch);

            //If character is present in jewels string
            if (jewels.contains(c)) {
                count++;
            }
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        Jewels_and_Stones obj = new Jewels_and_Stones();

        //Jewels & Stones
        String jewels = "aA";
        String stones = "aAAbbbb";

        //Printing jewels & stones
        System.out.println("Jewels : " + jewels);
        System.out.println("Stones : " + stones);

        //Printing the no. of jewels in stones
        System.out.println("No. of jewels in stones : " + jewelsInStones(jewels, stones));
    }
}