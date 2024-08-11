/*
* * * * *
* * * *
* * *
* *
*
*/

package Patterns;

class Pattern5
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = N; j > i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern5 obj = new Pattern5();

        //Creating the pattern
        obj.create(5);
    }
}