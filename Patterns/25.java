/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/

package Patterns;

class Pattern25
{
    /* Function to create the pattern */
    void create(int N)
    {
        //Initial space
        int space = (2 * N) - 2;

        for (int i = 1; i <= (2*N-1); i++)
        {
            //No. of stars
            int stars = (i < N) ? (i) : (2 * N - i);

            //Stars
            for (int j = 1; j <= stars; j++)
            {
                System.out.print("*");
            }

            //Space
            for (int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }

            //Stars
            for (int j = 1; j <= stars; j++)
            {
                System.out.print("*");
            }

            //New Line
            System.out.println();

            //Changing space
            space = (i < N) ? (space - 2) : (space + 2);
        }

    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern25 obj = new Pattern25();

        //Creating the pattern
        obj.create(5);
    }
}