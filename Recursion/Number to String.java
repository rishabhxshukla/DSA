package Recursion;
import java.io.*;

class Number_to_String
{
    void sayDigit(int n, String arr[])
    {
        if (n == 0)
            return;

        int digit = n % 10;
        n = n / 10;

        sayDigit(n, arr);

        System.out.print(arr[digit] + " ");
    }


    public static void main(String args[]) throws IOException
    {
        Number_to_String obj = new Number_to_String();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Array to store all the string names based on their index values
        String arr[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        System.out.print("Enter the number : ");
        int n = Integer.parseInt(b.readLine());

        System.out.print("String format : ");
        obj.sayDigit(n, arr);
    }
}