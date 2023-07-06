// Program to find the character at a given index within the string.

package String.Questions;
import java.io.*;

class CharacterAtIndex
{
    /* Function to find the character at given index */
    static char character(String str, int index)
    {
        if (index > str.length() || index < 0)
        {
            System.out.println("ERROR : Index cannot be out of scope of string length.");
            System.exit(0);
        }
        return str.charAt(index);
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user inputs
        System.out.print("Enter the string : ");
        String str = b.readLine();
        System.out.print("Enter the index : ");
        int index = Integer.parseInt(b.readLine());

        //Finding the character at index
        System.out.println("Character at index " +index+ " : " + character(str, index));
    }
}