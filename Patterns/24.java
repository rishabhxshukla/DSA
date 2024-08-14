/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/

package Patterns;

class Pattern24
{
    /* Function to create the pattern */
    void create(int N)
    {
        //Initial space for 1st part
        int space = 0;

        /* Upper Part */
        for (int i = 0; i < N; i++)
        {
            //Stars
            for (int j = 0; j < (N-i); j++)
            {
                System.out.print("*");
            }

            //Space
            for (int j = 0; j < space; j++)
            {
                System.out.print(" ");
            }

            //Stars
            for (int j = 0; j < (N-i); j++)
            {
                System.out.print("*");
            }

            // New Line
            System.out.println();

            //Increasing space by 2
            //Since 2 stars are removed in next iteration
            space = space + 2;
        }

        //Initial space for 2nd part
        space = (2 * N) - 2;

        /* Lower Part */
        for (int i = 0; i < N; i++)
        {
            //Stars
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }

            //Space
            for (int j = 0; j < space; j++)
            {
                System.out.print(" ");
            }

            //Stars
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }

            // New Line
            System.out.println();

            //Reducing space by 2
            //Since 2 new stars are added in next iteration
            space = space - 2;
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern24 obj = new Pattern24();

        //Creating the pattern
        obj.create(5);
    }
}