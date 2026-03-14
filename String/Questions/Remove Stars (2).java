/*
You are given a string str, which contains stars *.
In one operation, you can :
1) Choose a star in str.
2) Remove the closest non-star character to its left, as well as remove the star itself.
3) Return the string after all stars have been removed.
*/
// STRINGBUILDER

package String.Questions;
import java.io.*;

class RemoveStars2
{
    /* Function to remove the stars from the string */
    static String removeStars(String str)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
        {
            //Extracting each character
            char ch = str.charAt(i);

            //If char is '*', perform backspace operation
            if (ch == '*') {
                if (!sb.isEmpty()) {
                    //Only delete if there's something to delete
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            //Otherwise keep adding the letters in answer string
            else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the string : ");
        String str = b.readLine();

        //Removing the stars from the string
        String ans = removeStars(str);

        //Printing the result
        System.out.print("Result : " + ans);
    }
}