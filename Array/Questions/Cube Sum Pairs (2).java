/*
Find all the pairs whose sum of cubes is equal to the target value.
STEPS :
1) Traverse numbers from 1 to cube root of target.
2) Subtract cube of current number from target and check if their difference is a
   perfect cube or not.
3) If it is a perfect cube then print the pairs.
*/
// DIFFERENCE

package Array.Questions;
import java.io.*;

class CubeSumPairs2
{
    /* Function to find the pairs */
    void pairs(int target)
    {
        //Only going till cube-root of target
        int range = (int)Math.cbrt(target);

        for (int i=0; i<=range; i++)
        {
            //Difference = Target - Cube of 1st no.
            int diff = target - (int)Math.pow(i, 3);

            //Second no. = Cube root of diff
            int j = (int)Math.cbrt(diff);

            //If i^3 + j^3 == target
            if ((int)Math.pow(i, 3) + (int)Math.pow(j, 3) == target)
            {
                System.out.println("("+ i +", "+ j +")");
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        CubeSumPairs2 obj = new CubeSumPairs2();
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);

        //Taking user input
        System.out.print("Enter the target value : ");
        int target = Integer.parseInt(b.readLine());

        //Printing the pairs
        System.out.println("*** Pairs ***");
        obj.pairs(target);
    }
}