/*
Dutch national flag consists of three colors: red, white, and blue.
We are given an array with these colours arranged randomly.
Our task is to put the same colours together and in the correct order.
*/
// COUNT

package Array.Questions;
import java.io.*;

class DutchNationalFlag1
{
    static String arr[] = {"white", "red", "white", "blue" ,"red", "blue"};
    static int size = arr.length;


    /* Printing the array */
    void print(String a[])
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* Function to make the Dutch flag */
    void makeFlag()
    {
        int red = 0, white = 0, blue = 0;

        //Counting the no. of colours
        for (int i=0; i<size; i++)
        {
            if (arr[i].equals("red")) {
                red++;
            }
            else if (arr[i].equals("white")) {
                white++;
            }
            else {
                blue++;
            }
        }

        //Making the flag
        int i = 0;
        while (red > 0)
        {
            arr[i++] = "red";
            red--;
        }
        while (white > 0)
        {
            arr[i++] = "white";
            white--;
        }
        while (blue > 0)
        {
            arr[i++] = "blue";
            blue--;
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        DutchNationalFlag1 obj = new DutchNationalFlag1();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Making the flag
        obj.makeFlag();

        //Printing the flag
        System.out.println("\n\n*** Dutch National Flag ***");
        obj.print(arr);
    }
}
