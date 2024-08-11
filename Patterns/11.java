/*
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
*/

package Patterns;

class Pattern11
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i <= (2*N); i++)
        {
            /* Upper Part */
            if (i < N)
            {
                for (int j = 0; j <= i; j++)
                {
                    System.out.print("* ");
                }
            }
            /* Lower Part */
            else
            {
                for (int j = 0; j <= (2*N-i); j++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern11 obj = new Pattern11();

        //Creating the pattern
        obj.create(5);
    }
}