/*
**********
****  ****
***    ***
**      **
*        *
*/

package Patterns;

class Pattern23
{
    /* Function to create the pattern */
    void create(int N)
    {
        //Initial space
        int space = 0;

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
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern23 obj = new Pattern23();

        //Creating the pattern
        obj.create(5);
    }
}