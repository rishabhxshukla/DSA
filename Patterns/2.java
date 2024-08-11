/*
*
* *
* * *
* * * *
* * * * *
*/

package Patterns;

class Pattern2
{
    /* Function to create the pattern */
    void create(int N)
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //Creating object of the class
        Pattern2 obj = new Pattern2();

        //Creating the pattern
        obj.create(5);
    }
}