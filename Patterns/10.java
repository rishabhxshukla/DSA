/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/

package Patterns;

class Pattern10
{
    /* Function to create the pattern */
    void create(int N)
    {
        /* Upper Part */
        for (int i = 0; i < N; i++)
        {
            //Space
            for (int j = 0; j < (N-i-1); j++)
            {
                System.out.print(" ");
            }

            //Stars
            for (int j = 0; j < (2*i+1); j++)
            {
                System.out.print("*");
            }

            // New Line
            System.out.println();
        }

        /* Lower Part */
        for (int i = (N-1); i >= 0; i--)
        {
            //Space
            for (int j = 0; j < (N-i-1); j++)
            {
                System.out.print(" ");
            }

            //Stars
            for (int j = 0; j < (2*i+1); j++)
            {
                System.out.print("*");
            }

            // New Line
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern10 obj = new Pattern10();

        //Creating the pattern
        obj.create(5);
    }
}