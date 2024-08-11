/*
    *
   ***
  *****
 *******
*********
*/

package Patterns;

class Pattern8
{
    /* Function to create the pattern */
    void create(int N)
    {
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

            //Space
            for (int j = 0; j < (N-i-1); j++)
            {
                System.out.print(" ");
            }

            //New Line
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern8 obj = new Pattern8();

        //Creating the pattern
        obj.create(5);
    }
}