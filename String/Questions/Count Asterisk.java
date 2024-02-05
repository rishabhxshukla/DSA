/*
Count Asterisks
You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair.
In other words, the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.
Return the number of '*' in s, excluding the '*' between each pair of '|'.
Note that each '|' will belong to exactly one pair.

Example :
Input: s = "l|*e*et|c**o|*de|"
Output: 2
Explanation: The characters between the first and second '|' are excluded from the answer.
Also, the characters between the third and fourth '|' are excluded from the answer.
There are 2 asterisks considered. Therefore, we return 2.
*/

package String.Questions;
import java.io.*;

class CountAsterisk
{
    /* Function to count asterisks */
    void countAsterisks(String str)
    {
        int count = 0;

        for (int i=0; i<str.length(); i++)
        {
            //Extracting each character
            char ch = str.charAt(i);

            //For any character
            if (ch != '|')
            {
                if (ch == '*') {
                    count++;
                }
            }

            //If pipe found
            else
            {
                i++;

                //Skip all characters till next pipe
                while (str.charAt(i) != '|')
                {
                    i++;
                }
            }
        }

        System.out.println(count);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        CountAsterisk obj = new CountAsterisk();

        //User input
        String str = "l|*e*et|c**o|*de|";

        //Printing the count of asterisks
        System.out.print("No. of asterisks : ");
        obj.countAsterisks(str);
    }
}