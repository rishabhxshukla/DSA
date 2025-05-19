// Find all the pairs whose sum of cubes is equal to the target value.
// NESTED LOOPS

package Array.Questions;
import java.io.*;

class CubeSumPairs1
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
                //Calculating the sum
                int sum = (int)(Math.pow(i, 3) + Math.pow(j, 3));
                
                if (sum == target)
                {
                    System.out.println("("+ i +", "+ j +")");
                }
            }
        }
    }


    public static void main(String args[]) throws IOException
    {
        //Creating object of the class
        CubeSumPairs1 obj = new CubeSumPairs1();
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
