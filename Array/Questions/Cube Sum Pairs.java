// Find all the pairs in an array whose sum of cubes is equal to the target value.
// NESTED LOOPS

package Array.Questions;
import java.io.*;

class CubeSumPairs
{
    /* Function to find the pairs */
    void pairs(int target)
    {
        //Only going till cube-root of target
        int range = (int)Math.cbrt(target);

        for (int i=0; i<=range; i++)
        {
            for (int j=0; j<=range; j++)
            {
                if (Math.pow(i, 3) + Math.pow(j, 3) == target)
                {
                    System.out.println("("+ i +", "+ j +")");
                }
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        CubeSumPairs obj = new CubeSumPairs();
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