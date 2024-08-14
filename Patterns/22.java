/*
*        *
**      **
***    ***
****  ****
**********
*/

package Patterns;

class Pattern22
{
    /* Function to create the pattern */
    void create(int N)
    {
        //Initial space
        int space = (2 * N) - 2;

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
        Pattern22 obj = new Pattern22();

        //Creating the pattern
        obj.create(5);
    }
}