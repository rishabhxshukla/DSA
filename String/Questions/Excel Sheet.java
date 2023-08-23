/*
Excel Sheet Column Title
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:
A -> 1
B -> 2
...
Z -> 26
AA -> 27
AB -> 28
*/

package String.Questions;
import java.io.*;

class ExcelSheet
{
    /* Function to find the corresponding column title */
    static String convertToTitle(int columnNumber)
    {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0)
        {
            //27 % 26 = 1
            //'A' + 1 = 'B'
            //columnNumber = 1
            //'A' + 0 = 'A';

            columnNumber--;

            //Finding rightmost letter
            char l = (char)('A' + columnNumber % 26);

            //Inserting the letter in our answer string
            sb.insert(0, l);

            //Checking for the next letter
            columnNumber = columnNumber / 26;
        }

        //Converting StringBuilder to String
        String str =  sb.toString();

        return str;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        ExcelSheet obj = new ExcelSheet();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the number : ");
        int n = Integer.parseInt(b.readLine());

        //Printing the column title
        System.out.println("Column title : " + convertToTitle(n));
    }
}