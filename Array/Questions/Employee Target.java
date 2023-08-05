/*
Number of Employees Who Met the Target
There are n employees in a company, numbered from 0 to n - 1.
Each employee i has worked for hours[i] hours in the company.
The company requires each employee to work for at least 'target' hours.
You are given an array and a target, return the number of employees who worked at least target hours.
*/

package Array.Questions;
import java.io.*;

class EmployeeTarget
{
    static final int size = 5;
    static int arr[] = new int[size];


    /* Creating the array */
    void create() throws IOException
    {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        for (int i=0; i<size; i++)
        {
            System.out.print("Enter the element : ");
            arr[i] = Integer.parseInt(b.readLine());
        }
    }


    /* Printing the array */
    void print(int a[])
    {
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }


    /* Function to find the no. of employees who met the target hour */
    static int noOfEmployees(int target)
    {
        int count = 0;

        for (int i=0; i<size; i++)
        {
            if (arr[i] >= target) {
                count++;
            }
        }

        return count;
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        EmployeeTarget obj = new EmployeeTarget();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Creating the array
        obj.create();

        //Printing the array
        System.out.println("*** Created Array ***");
        obj.print(arr);

        //Taking user input
        System.out.print("\nEnter the target : ");
        int target = Integer.parseInt(b.readLine());

        //Printing the no. of employees
        System.out.println("No. of employees who met the target hour : " + noOfEmployees(target));
    }
}